package com.coco.market.app.category.vo;



//primary_category_id INT PRIMARY KEY AUTO_INCREMENT,
//name VARCHAR(255) NOT NULL


public class CategoryVO {

	public CategoryVO() {;}
	private int primaryCategoryId;
	private String name;
	
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
		return "CategoryVO [primaryCategoryId=" + primaryCategoryId + ", name=" + name + "]";
	}


  
}
