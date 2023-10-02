package com.coco.market.app.category.vo;

public class SubCategoryVO {
	public SubCategoryVO() {;}
    
	private int subCategory1Id;
	private int primaryCategoryId;
	private String name;
	
	
	public int getSubCategory1Id() {
		return subCategory1Id;
	}
	public void setSubCategory1Id(int subCategory1Id) {
		this.subCategory1Id = subCategory1Id;
	}
	public int getPrimaryCategoryId() {
		return primaryCategoryId;
	}
	public void setPrimaryCategoryId(int primaryCategoryId) {
		this.primaryCategoryId = primaryCategoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "SubCatgoryVO [subCategory1Id=" + subCategory1Id + ", primaryCategoryId=" + primaryCategoryId + ", name="
				+ name + "]";
	}
	
	
}
