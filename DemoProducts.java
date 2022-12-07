package com.nissan.bean;
public class DemoProducts {
	//instance variables
		private int itemCode;
		private String itemName;
		private double buyingPrice;
		private double sellingPrice;
		private double tax;
		private int quntity;
		
		//Default constructor
		public DemoProducts() {
			super();
		}
		
		//Parametrized constructor
		public DemoProducts(int itemCode, String itemName, double buyingPrice,
				double sellingPrice,double tax, int quntity) {
			super();
			this.itemCode = itemCode;
			this.itemName = itemName;
			this.buyingPrice = buyingPrice;
			this.sellingPrice = sellingPrice;
			this.tax = tax;
			this.quntity = quntity;
		}
		
		//Setters and getters methods
		public int getItemCode() {
			return itemCode;
		}

		public void setItemCode(int itemCode) {
			this.itemCode = itemCode;
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public double getBuyingPrice() {
			return buyingPrice;
		}

		public void setBuyingPrice(double buyingPrice) {
			this.buyingPrice = buyingPrice;
		}

		public double getSellingPrice() {
			return sellingPrice;
		}

		public void setSellingPrice(double sellingPrice) {
			this.sellingPrice = sellingPrice;
		}

		public double getTax() {
			return tax;
		}

		public void setTax(double tax) {
			this.tax = tax;
		}

		public int getQuntity() {
			return quntity;
		}

		public void setQuntity(int quntity) {
			this.quntity = quntity;
		}
		
		//to String method
		@Override
		public String toString() {
			return "Products [itemCode=" + itemCode + ", itemName=" + itemName + ", buyingPrice=" + buyingPrice
					+ ", sellingPrice=" + sellingPrice + "tax=" + tax + ", quntity="
					+ quntity + "]";
		}

		
	}



