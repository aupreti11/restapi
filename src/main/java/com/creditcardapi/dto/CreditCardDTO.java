package com.creditcardapi.dto;

public class CreditCardDTO {

	private int mid;
	private String model;
	private String color;
	private String description;

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
				+ "]";
	}

}
