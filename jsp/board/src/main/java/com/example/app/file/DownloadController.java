package com.example.app.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.Result;

public class DownloadController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		

		
		String uploadPath = req.getSession().getServletContext().getRealPath("/")+ "upload/";
		String fileSystemName = req.getParameter("fileSystemName");
		String fileOriginalName = req.getParameter("fileOriginalName");
		String encodedFileName = URLEncoder.encode(fileOriginalName, "UTF-8").replaceAll("\\+", "%20");

		InputStream in = null;
		OutputStream out = null;
		byte[] data =null;
		try {
			File file = new File(uploadPath,fileSystemName);
			data = new byte[(int)file.length()];
			file.length();//byte로 변환했을때 byte의 길이
			in = new FileInputStream(file);
			
			resp.setContentType("application/octet-stream");
            resp.setHeader("Content-Type", "application/octet-stream;charset=utf-8");
			resp.setHeader("Content-Length", file.length() + "");
			resp.setHeader("Content-Disposition", "attachment; filename*=UTF-8''" + encodedFileName);
			
			out = resp.getOutputStream();
			out.write(in.readAllBytes());
			
			// 만약 해당파일의 내요이 없다면, read()는 0을 리턴하기 때문에 "==-1"일 경우, 무한 반복한다.
			// 따라서 "> 0"로 작성해야 0일 때에도 탈출할 수 있다.
			
			
//			//파일의 내용이 전혀 없으면 read()사용 시 무한 루프에 걸린다.
//			while(in.read(data) >0) {
			//파일의 내용이 전혀 없으면 readAllBytes()를 사용해야 정상적으로 다운로드 된다.
//				out.write(data); // read를 통해 읽은 byte가 0일 경우에는 write를 사용하지 않아도 자동으로 응답된다.
//			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in!=null) {
					in.close();
				}
				if(out!=null) {
					out.close();
				}
			} catch (IOException e) {
				System.gc(); // 주인을 잃어버린 필드들의 청소기 역할,지금 당장 주인 잃은 것, 닫아줘야하는 것 찾아(표시만 일단해두는것)
				System.runFinalization(); // 보자마자 다 없애는 것.열려있는 파일있으면 수정이나 삭제가 안되서
				e.printStackTrace();
			}
		}
		
		return null;
	}

}
