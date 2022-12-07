package com.java.App;
import java.util.List;
import java.util.Scanner;
import com.nissan.bean.DemoProducts;

public class DemoInputUser {
	//declaring global variable
	static Scanner scanner=new Scanner(System.in);
	
	public static void getInputFromUser(List<DemoProducts> list) {
		
		try {
				
				//Take item code from user
				System.out.print("Enetr item code: ");
				int itemCode=scanner.nextInt();
				//Check product is alrady exists in List 
				DemoProducts productCode=checkProductCodeExits(itemCode,list);
				
				if(productCode!=null) {
					System.out.println("Item is existing ....try with another Item");
					
				}
				
				//Take Item name from user
				System.out.print("Enter Item Name: ");
				String ItemName=scanner.next();
				
				//Take  buying Price from user
				System.out.print("Enter Item buyingPrice: ");
				double buyingPrice=scanner.nextDouble();
				//Take  selling  Price from user
				System.out.print("Enter Item sellingPrice: ");
				
				double sellingPrice=scanner.nextDouble();
				
				
				//Take  tax from user
				System.out.print("Enetr Tax ");
				
				double tax=scanner.nextDouble();
				//Take Quantity from user
				System.out.print("Enetr Quantity of item ");
				
				int itemQuntity=scanner.nextInt();
				
				//Adding Object in List
				DemoProducts obj=new DemoProducts(itemCode,ItemName,buyingPrice,sellingPrice,tax,itemQuntity);
				list.add(obj);
				
			
			
		}catch(Exception e) {
			System.out.println("Invalid Input");
			e.printStackTrace();
			
		}
	}


	private static DemoProducts checkProductCodeExits(int itemCode, List<DemoProducts> list) {

		
		for(DemoProducts productCode:list) {
		if(itemCode==productCode.getItemCode()) {
			return productCode;
		}
	}
	return null;
	}

	
}
