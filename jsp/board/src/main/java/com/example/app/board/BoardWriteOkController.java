package com.example.app.board;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.Result;
import com.example.app.board.dao.BoardDAO;
import com.example.app.board.vo.BoardVO;
import com.example.app.file.dao.FileDAO;
import com.example.app.file.vo.FileVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BoardWriteOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		req.setCharacterEncoding("UTF-8");
		
		Result result = new Result();
		
		//request 객체, 업로드할 경로, 파일의 크기, 인코딩 방식, 이름변경정책;
		//아래코드는 서버 경로의 루트 경로를 찾아주는 메소드;
		// 로컬에서는 webContent까지의 경로
		FileDAO fileDAO = new FileDAO();
		BoardVO boardVO = new BoardVO();
		BoardDAO boardDAO = new BoardDAO();
		int boardNumber = 0;
		
		
		String uploadPath = req.getSession().getServletContext().getRealPath("/")+"upload/";
		int fileSize =1024*1024*1024*5;
		
		
		MultipartRequest multipartRequest = new MultipartRequest(req,uploadPath,fileSize,"UTF-8",new DefaultFileRenamePolicy());
		String boardTitle= multipartRequest.getParameter("boardTitle");
		String boardContent=multipartRequest.getParameter("boardContent");
		int memberNumber = (Integer)req.getSession().getAttribute("memberNumber");
		
		boardVO.setBoardTitle(boardTitle);
		boardVO.setBoardContent(boardContent);
		boardVO.setMemberNumber(memberNumber);
		
		boardDAO.insert(boardVO);
		boardNumber= boardDAO.getSequence();
		@SuppressWarnings("unchecked")
		Enumeration<String> fileNames= multipartRequest.getFileNames();//input태그 네임값 가져온 것.
	
		while(fileNames.hasMoreElements()) {
			String fileName = fileNames.nextElement();//예는 null이 될 수 없음.
			String fileOriginalName = multipartRequest.getOriginalFileName(fileName);
			String fileSystemlName= multipartRequest.getFilesystemName(fileName);
			if(fileOriginalName==null) {continue;}
			FileVO fileVO = new FileVO();
			fileVO.setFileOriginalName(fileOriginalName);
			fileVO.setFileSystemName(fileSystemlName);
			fileVO.setBoardNumber(boardNumber);
			
			fileDAO.insert(fileVO);
		}
		
		result.setPath("/board/boardListOk.bo");
		return result;
	}

}
