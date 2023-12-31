package com.example.app.file.vo;

public class FileVO {
	private String fileSystemName; 
	public String getFileSystemName() {
		return fileSystemName;
	}

	public void setFileSystemName(String fileSystemName) {
		this.fileSystemName = fileSystemName;
	}

	public String getFileOriginalName() {
		return fileOriginalName;
	}

	public void setFileOriginalName(String fileOriginalName) {
		this.fileOriginalName = fileOriginalName;
	}

	public int getBoardNumber() {
		return boardNumber;
	}

	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}

	private String fileOriginalName;
	private int boardNumber;
	
	public FileVO() {;}

	@Override
	public String toString() {
		return "FileVO [fileSystemName=" + fileSystemName + ", fileOriginalName=" + fileOriginalName + ", boardNumber="
				+ boardNumber + "]";
	}
	
}
