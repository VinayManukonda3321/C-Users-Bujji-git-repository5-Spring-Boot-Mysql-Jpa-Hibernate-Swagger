package com.rs.fer.request;

import javax.persistence.Column;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class AddExpenseRequestVO {

		
	@Setter
	@Getter
	private String type;
	
	@Setter
	@Getter
	private String date;
	
	@Setter
	@Getter
	private int price;

	@Setter
	@Getter
	private int numberOfItems;
	
	@Setter
	@Getter
	private int total;
	
	@Setter
	@Getter
	private String byWhoom;
	
	@Setter
	@Getter
	private int userId;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getByWhoom() {
		return byWhoom;
	}

	public void setByWhoom(String byWhoom) {
		this.byWhoom = byWhoom;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
