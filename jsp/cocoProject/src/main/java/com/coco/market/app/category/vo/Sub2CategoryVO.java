package com.coco.market.app.category.vo;

public class Sub2CategoryVO {
	public Sub2CategoryVO() {;}

	private int subCategory1Id;
	private int subCategory2Id;
	private String name;
	
	public int getSubCategory1Id() {
		return subCategory1Id;
	}
	public void setSubCategory1Id(int subCategory1Id) {
		this.subCategory1Id = subCategory1Id;
	}
	public int getSubCategory2Id() {
		return subCategory2Id;
	}
	public void setSubCategory2Id(int subCategory2Id) {
		this.subCategory2Id = subCategory2Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Sub2CategoryVO [subCategory1Id=" + subCategory1Id + ", subCategory2Id=" + subCategory2Id + ", name="
				+ name + "]";
	}

	
}
