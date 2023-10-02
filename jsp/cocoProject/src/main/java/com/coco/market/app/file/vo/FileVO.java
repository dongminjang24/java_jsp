package com.coco.market.app.file.vo;

public class FileVO {
	
	public FileVO() {;}
	private String fileSystemName; 
	
	private String fileOriginalName;
	private int itemNumber;


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

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	
	@Override
	public String toString() {
		return "FileVO [fileSystemName=" + fileSystemName + ", fileOriginalName=" + fileOriginalName + ", itemNumber="
				+ itemNumber + "]";
	}
	
}
