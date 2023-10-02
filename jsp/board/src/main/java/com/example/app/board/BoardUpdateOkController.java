package com.example.app.board;

import java.io.File;
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

public class BoardUpdateOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		req.setCharacterEncoding("UTF-8");
		
		Result result = new Result();
		
		FileDAO fileDAO = new FileDAO();
		BoardVO boardVO = new BoardVO();
		BoardDAO boardDAO = new BoardDAO();
		
		
		String uploadPath = req.getSession().getServletContext().getRealPath("/")+"upload/";
		int fileSize =1024*1024*1024*5;
		
		//0 수정후 파일들 서버경로에 업로드
		MultipartRequest multipartRequest = new MultipartRequest(req,uploadPath,fileSize,"UTF-8",new DefaultFileRenamePolicy());
		String boardTitle= multipartRequest.getParameter("boardTitle");
		String boardContent=multipartRequest.getParameter("boardContent");
		int boardNumber = Integer.valueOf(multipartRequest.getParameter("boardNumber"));

		
		
		int memberNumber = (Integer)req.getSession().getAttribute("memberNumber");
		
		boardVO.setBoardNumber(boardNumber);
		boardVO.setBoardTitle(boardTitle);
		boardVO.setBoardContent(boardContent);
		boardVO.setMemberNumber(memberNumber);
		// 첫번째 게시글 수정
		boardDAO.update(boardVO);

		// 두번째 수정전 파일 삭제
		fileDAO.select(boardNumber).stream().map(file->file.getFileSystemName()).forEach(name->{
			File file = new File(uploadPath,name);
			if(file.exists()) {
				file.delete();
			}
		});
		
		// 수정전 파일 DB에서 삭제
		fileDAO.delete(boardNumber);
		
		// 수정 후 파일 DB에 추가
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
		
		result.setPath("/board/boardDetail.bo?boardNumber="+boardNumber);
		return result;
	}

}
