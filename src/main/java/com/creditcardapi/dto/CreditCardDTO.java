package com.creditcardapi.dto;

public class CreditCardDTO {

	private int mid;
	private String model;
	private String color;
	private String description;
	private String name;
	private String type;
	private String cno;
	private int cvv;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "CreditCardDTO [mid=" + mid + ", model=" + model + ", color=" + color + ", description=" + description
				+ ", name=" + name + ", type=" + type + ", cno=" + cno + ", cvv=" + cvv + "]";
	}

	

}
