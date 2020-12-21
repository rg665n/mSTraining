package com.ram.model;



public class Orders {

	private int itemId;

	private String item;

	private int price;

	private String state;

	private int pin;
	
	public Orders() {}
	public Orders(int itemId, String item, int price, String state, int pin) {
		super();
		this.itemId = itemId;
		this.item = item;
		this.price = price;
		this.state = state;
		this.pin = pin;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		if (state.isEmpty() || state == null) throw new IllegalArgumentException("State is Mandatory");
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		if ( pin <0  ) throw new IllegalArgumentException("Invalid PIN");
		this.pin = pin;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		if ( item.isEmpty() || item ==null ) throw new IllegalArgumentException("Item is Mandataory");
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if ( price <0 ) throw new IllegalArgumentException("Invalid Price");
		this.price = price;
	}
	@Override
	public String toString() {
		return "Orders [itemId=" + itemId + ", item=" + item + ", price=" + price + ", state=" + state + ", pin=" + pin
				+ "]";
	}

    
    
}

