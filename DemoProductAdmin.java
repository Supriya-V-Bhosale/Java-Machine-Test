package com.java.App;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.nissan.bean.DemoProducts;


public class DemoProductAdmin {
	//declare global variable
		public static final Scanner scanner=new Scanner(System.in);
		public static List<List<DemoProducts>> ProductDetails=new ArrayList<>();
		public static List<DemoProducts> computerList=new ArrayList<>();
		public static List<DemoProducts> laptopList=new ArrayList<>();
		public static List<DemoProducts> watchesList=new ArrayList<>();
		public static List<DemoProducts> MobilePhonesList=new ArrayList<>();

		static DemoInputUser takeInputFromUser=new DemoInputUser();
		
		public static void main(String args[]) {
			char choice='n';
			try {
				do {
					System.out.print("What do you want...\n1.Add Products\n2.Display All products \n3.Search product: ");
					int input=scanner.nextInt();
					switch(input) {
					case 1:System.out.print("Enetr Category category Name\n1.Coumpter\n2.Laptop\n3.Watches\n4.MobilePhones : ");
							int categoryName=scanner.nextInt();
							switch(categoryName) {
								case 1:takeInputFromUser.getInputFromUser(computerList);
									break;
								case 2:takeInputFromUser.getInputFromUser(laptopList);
									break;
								case 3:takeInputFromUser.getInputFromUser(watchesList);
									break;
								case 4:takeInputFromUser.getInputFromUser(MobilePhonesList);

							}
						
						break;
					case 2:System.out.println("Displaying All the products............");
						System.out.print("Enetr Category...\n1.Computer\n2.Laptop\n3.Watches\n4.Mobile Phones: ");
						int category=scanner.nextInt();	
						switch(category) {
							case 1:DisplayAllProducts(computerList);
								break;
							case 2:DisplayAllProducts(laptopList);
								break;
							case 3:DisplayAllProducts(watchesList);
								break;
							case 4:DisplayAllProducts(MobilePhonesList);
								break;
								
						}
						break;
						
					case 3:System.out.print("Searching Products ....\n1.By Item name\n2.By Item Code: ");
						int entry=scanner.nextInt();
						
						switch(entry) {
						case 1:
							System.out.print("Enetr Category...\n1.Computer\n2.Laptop\n3.Watches\n4.Mobile Phones: ");
							int cat=scanner.nextInt();
						
							switch(cat) {
								case 1:
									SearchProductByName(computerList);
									break;
								case 2:SearchProductByName(laptopList);
									break;
								case 3:SearchProductByName(watchesList);
									break;
								case 4:SearchProductByName(MobilePhonesList);
									break;
							}
						case 2:System.out.print("Enetr Category...\n1.Computer\n2.Laptop\n3.Watches\n4.Mobile Phones: ");
							int cat1=scanner.nextInt();
							switch(cat1) {
								case 1:
									SearchProductByCode(computerList);
									break;
								case 2:SearchProductByCode(laptopList);
									break;
								case 3:SearchProductByCode(watchesList);
									break;
								case 4:SearchProductByCode(MobilePhonesList);
									break;
							}
					}
					break;
					
					default:System.out.println("Invalid Input...");
					}
					
					
					System.out.print("Do You want to continue...(y/n) ");
					choice=scanner.next().charAt(0);
				}while(choice=='Y' || choice=='y');
				
				ProductDetails.add(computerList);
				ProductDetails.add(laptopList);
				ProductDetails.add(watchesList);
				ProductDetails.add(MobilePhonesList);

			}catch(Exception e) {
				System.out.println("Invalid Inout...");
			}
			
		}

		private static void SearchProductByName(List<DemoProducts> list) {
			System.out.println("Enetr item Name");
			String  Item=scanner.next();
			for(DemoProducts ele:list) {
				if(Item.equals(ele.getItemName())) {
					System.out.println("Found it...");
					System.out.println(ele.getItemCode() + " " + ele.getItemName()+ " "  + ele.getTax());
					return;
				}
				}
			System.out.println("Not Found");
			
		}

		private static void SearchProductByCode(List<DemoProducts> productDetails2) {
			System.out.println("Enetr item Code");
			int id=scanner.nextInt();
			for(DemoProducts ele:productDetails2) {
				if(id==ele.getItemCode()) {
					System.out.println("Found it...");
					//System.out.println(ele.getItemCode() + " " + ele.getItemName()+  " " + ele.getTax());
					return;
				}
				}
			System.out.println("Not Found");
			
		}
		
		

		private static void DisplayAllProducts(List<DemoProducts> productDetails2) {
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.printf(String.format("%-9s%15s%15s%20s%10s%10s%n","Item Code","Item Name","Buying price ","Selling price","Tax","Quantity"));

			for(DemoProducts ele:productDetails2) {
				System.out.printf(String.format("%-9s%15s%15s%20s%10s%10s%n",ele.getItemCode(),ele.getItemName(),ele.getBuyingPrice(),ele.getSellingPrice(),ele.getTax(),ele.getQuntity()));
	
				}
			System.out.println("-----------------------------------------------------------------------------------------");

		}
		

		

		

}
