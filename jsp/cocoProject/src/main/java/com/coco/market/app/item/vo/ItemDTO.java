package com.coco.market.app.item.vo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.coco.market.app.file.vo.FileVO;

//
//board_number int unsigned auto_increment primary key,
//board_title varchar(255),
//board_content varchar(500),
//board_date datetime,
//board_read_count int unsigned,
//member_number int unsigned,
//constraint fk_board foreign key(board_number)
//references tbl_board(board_number)

public class ItemDTO {




	public ItemDTO() {;}
	private long itemNumber;
	private String itemName;
    private String itemAddress;
    private Boolean itemStatus;
    private Boolean itemChangeBoolean;
    private long itemPrice; 
    private String itemDescription;
    private LocalDateTime itemCreateTime; 
    private int userNumber;
	private int subCategory2Id;
    private Boolean shippingPrice;
    private int itemCount;
    private Boolean protectedPayment;
	private List<FileVO> files = new ArrayList<FileVO>();
    private List<ItemTagDTO> tags;

    
	public long getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(long itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemAddress() {
		return itemAddress;
	}
	public void setItemAddress(String itemAddress) {
		this.itemAddress = itemAddress;
	}
	public Boolean getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(Boolean itemStatus) {
		this.itemStatus = itemStatus;
	}
	public Boolean getItemChangeBoolean() {
		return itemChangeBoolean;
	}
	public void setItemChangeBoolean(Boolean itemChangeBoolean) {
		this.itemChangeBoolean = itemChangeBoolean;
	}
	public long getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(long itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public LocalDateTime getItemCreateTime() {
		return itemCreateTime;
	}
	public void setItemCreateTime(LocalDateTime itemCreateTime) {
		this.itemCreateTime = itemCreateTime;
	}
	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	public int getSubCategory2Id() {
		return subCategory2Id;
	}
	public void setSubCategory2Id(int subCategory2Id) {
		this.subCategory2Id = subCategory2Id;
	}
	public Boolean getShippingPrice() {
		return shippingPrice;
	}
	public void setShippingPrice(Boolean shippingPrice) {
		this.shippingPrice = shippingPrice;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	public Boolean getProtectedPayment() {
		return protectedPayment;
	}
	public void setProtectedPayment(Boolean protectedPayment) {
		this.protectedPayment = protectedPayment;
	}
	public List<FileVO> getFiles() {
		return files;
	}
	public void setFiles(List<FileVO> files) {
		this.files = files;
	}
	public List<ItemTagDTO> getTags() {
		return tags;
	}
	public void setTags(List<ItemTagDTO> tags) {
		this.tags = tags;
	}
	
	

	
    @Override
	public String toString() {
		return "ItemDTO [itemNumber=" + itemNumber + ", itemName=" + itemName + ", itemAddress=" + itemAddress
				+ ", itemStatus=" + itemStatus + ", itemChangeBoolean=" + itemChangeBoolean + ", itemPrice=" + itemPrice
				+ ", itemDescription=" + itemDescription + ", itemCreateTime=" + itemCreateTime + ", userNumber="
				+ userNumber + ", subCategory2Id=" + subCategory2Id + ", shippingPrice=" + shippingPrice
				+ ", itemCount=" + itemCount + ", protectedPayment=" + protectedPayment + ", files=" + files + ", tags="
				+ tags + "]";
	}
	
	
	

}
