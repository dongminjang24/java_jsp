package com.animal.app.vo;

public class AnimalVO {
	private int animalNumber;
	private String animalName; 
	private int animalLife;
	private String animalSpecies;
	private String animalDetail;
	
	public AnimalVO() {;}

	public int getAnimalNumber() {
		return animalNumber;
	}

	public void setAnimalNumber(int animalNumber) {
		this.animalNumber = animalNumber;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public int getAnimalLife() {
		return animalLife;
	}

	public void setAnimalLife(int animalLife) {
		this.animalLife = animalLife;
	}

	public String getAnimalSpecies() {
		return animalSpecies;
	}

	public void setAnimalSpecies(String animalSpecies) {
		this.animalSpecies = animalSpecies;
	}

	public String getAnimalDetail() {
		return animalDetail;
	}

	public void setAnimalDetail(String animalDetail) {
		this.animalDetail = animalDetail;
	}

	@Override
	public String toString() {
		return "AnimalVO [animalNumber=" + animalNumber + ", animalName=" + animalName + ", animalLife=" + animalLife
				+ ", animalSpecies=" + animalSpecies + ", animalDetail=" + animalDetail + "]";
	}
	
}
