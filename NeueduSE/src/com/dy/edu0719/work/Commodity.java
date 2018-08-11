package com.dy.edu0719.work;

public class Commodity {

	private double price;
	private String name;
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//必须同名且同价格-->同一个对象
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Commodity) {
			Commodity commodity = (Commodity) obj;
			if(this.price == commodity.price && this.name.equals(commodity.name)) {
				return true;
			}else {
				return false;
			}
		} else {
			return false;
		}
		
		
	}
	
}
