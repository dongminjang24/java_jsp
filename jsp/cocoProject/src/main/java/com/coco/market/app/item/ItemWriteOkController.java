package com.coco.market.app.item;

import java.io.File;
import java.io.IOException;
import java.rmi.ServerException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.coco.market.app.Execute;
import com.coco.market.app.Result;
import com.coco.market.app.file.dao.FileDAO;
import com.coco.market.app.file.vo.FileVO;
import com.coco.market.app.item.dao.ItemDAO;
import com.coco.market.app.item.vo.ItemVO;

public class ItemWriteOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		req.setCharacterEncoding("UTF-8");
		
		Result result = new Result();
		
        FileDAO fileDAO = new FileDAO();
        ItemVO itemVO = new ItemVO();
        ItemDAO itemDAO = new ItemDAO();  // 변수명 변경

		
		
        String uploadPath = req.getSession().getServletContext().getRealPath("/") + "upload/";

        DiskFileItemFactory fileFactory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(fileFactory);

		
//		MultipartRequest multipartRequest = new MultipartRequest(req,uploadPath,fileSize,"UTF-8",new DefaultFileRenamePolicy());
//		String itemName= multipartRequest.getParameter("itemName");
//		String itemAddress= multipartRequest.getParameter("itemAddress");
//		String itemDescription = multipartRequest.getParameter("itemDescription");
//		Boolean itemStatus = Boolean.valueOf(multipartRequest.getParameter("itemStatus")); 
//        Boolean itemChangeBoolean = Boolean.valueOf(multipartRequest.getParameter("itemChangeBoolean"));  // 수정된 부분
//		long itemPrice = Long.valueOf(multipartRequest.getParameter("itemPrice")); 
//		int categoryId = Integer.valueOf(multipartRequest.getParameter("subCategory2Id"));
//		Boolean shippingPrice = Boolean.valueOf(multipartRequest.getParameter("shippingPrice")); 
//		int itemCount = Integer.valueOf(multipartRequest.getParameter("itemCount"));
//		Boolean protectedPayment = Boolean.valueOf(multipartRequest.getParameter("protectedPayment")); 
		int userNumber = (Integer)req.getSession().getAttribute("userNumber");
		itemVO.setUserNumber(userNumber);
        String tagsString = null;

        try {

            List<FileItem> items = upload.parseRequest(req);
            for (FileItem item : items) {
                if (item.isFormField()) { // 일반 데이터 처리
                    String fieldName = item.getFieldName();
                    String fieldValue = item.getString("UTF-8");
                    switch (fieldName) {
                    case "itemName":
                        itemVO.setItemName(fieldValue);
                        break;
                    case "itemStatus":
                        itemVO.setItemStatus(Boolean.valueOf(fieldValue));
                        break;
                    case "itemPrice":
                    	itemVO.setItemPrice(Long.valueOf(fieldValue));
                    	break;
                    case "itemAddress":
                    	itemVO.setItemAddress(fieldValue);
                    	break;
                    case "itemChangeBoolean":
                    	itemVO.setItemChangeBoolean(Boolean.valueOf(fieldValue));
                    	break;
                    case "itemDescription":
                        itemVO.setItemDescription(fieldValue);
                        break;
                    case "subCategory2Id":
                    	itemVO.setSubCategory2Id(Integer.valueOf(fieldValue));
                    	break;
                    case "itemCount":
                    	itemVO.setItemCount(Integer.valueOf(fieldValue));
                    	break;
                    case "shippingPrice":
                        itemVO.setShippingPrice(Boolean.valueOf(fieldValue));
                    	break;
                    case "protectedPayment":
                        itemVO.setProtectedPayment(Boolean.valueOf(fieldValue));
                    	break;
                    case "tags":
                        tagsString = fieldValue;
                        break;
		                }
		        }
            }

            itemDAO.insert(itemVO); 
            int itemNumber = itemDAO.getSequence();  

            for (FileItem item : items) {
                if (!item.isFormField()) { // 파일 데이터만 처리
	            	  
		            String fileSystemName = item.getName();
		            ServletContext sc = req.getServletContext();
		            String uniqueName = System.currentTimeMillis() + "_" + fileSystemName;
		            FileVO fileVO = new FileVO();
		            fileVO.setFileOriginalName(fileSystemName);
		            fileVO.setFileSystemName(uniqueName);
		            fileVO.setItemNumber(itemNumber);
		            fileDAO.insert(fileVO);
		            File storeFile = new File(uploadPath  + uniqueName);
		            item.write(storeFile);
		        }}
		
	

		if (tagsString != null && !tagsString.trim().isEmpty()) {
		    String[] tagsArray = tagsString.split(",");
		    for (String tagName : tagsArray) {
		        tagName = tagName.trim();
		        Integer tagId = itemDAO.getTagIdByName(tagName); // 태그 ID를 가져옴
		        if (tagId == null) { // 태그가 DB에 없으면
		            itemDAO.insertNewTag(tagName); // 새 태그를 DB에 추가
		            tagId = itemDAO.getTagIdByName(tagName); // 새로 삽입된 태그의 ID를 가져옴
		        }
		        // 아이템과 태그를 연결
		        try {
		            itemDAO.connectItemWithTag(itemNumber, tagId); // 이미 연결된 경우 예외가 발생할 수 있음
		        } catch(Exception e) {
		            // 이미 연결되어 있거나 다른 문제가 발생한 경우 처리. 예외 처리는 필요에 따라 변경될 수 있음.
		            e.printStackTrace();
		        }
		    }
		}
		

        } catch (Exception e) {
            e.printStackTrace();
        }

		result.setPath("/item/list.it");
        return result;
    }

}
