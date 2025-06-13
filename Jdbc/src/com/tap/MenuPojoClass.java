package com.tap;

import java.util.Scanner;

class Menu{
	
	private int menuId;
	private int restaurantId;
	private String itemName;
	private String description;
	private int price;
	private String isAvailable;
	
	public Menu() {
		
	}

	public Menu(int menuId, int restaurantId, String itemName, String description, int price, String isAvailable) {
		super();
		this.menuId = menuId;
		this.restaurantId = restaurantId;
		this.itemName = itemName;
		this.description = description;
		this.price = price;
		this.isAvailable = isAvailable;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getMenuId() {
		return menuId;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public String getItemName() {
		return itemName;
	}

	public String getDescription() {
		return description;
	}

	public int getPrice() {
		return price;
	}

	public String getIsAvailable() {
		return isAvailable;
	}
	
	@Override
	public String toString() {
		return  "menuId: " +  menuId +"\n" +
				"restaurantId: " + restaurantId +"\n"+
				"itemName: " + itemName +"\n"+
				"description: " + description +"\n" +
				"price: " + price +"\n"+
				"isAvailable: " + isAvailable;
	}
	
	
	
}



public class MenuPojoClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the no of menus needed");
		int n = scanner.nextInt();
		Menu []  menu = new Menu[n];

		for(int i=0;i<n;i++) {
			System.out.println("enter the menu details: " + (i+1));
		
			System.out.println("enter the menuId: ");
			int menuId = scanner.nextInt();
			
			System.out.println("enter the restaurantId: ");
			int restaurantId = scanner.nextInt();
			
			System.out.println("enter the itemName: ");
			String itemName = scanner.next();
			
			System.out.println("enter the description: ");
			String description = scanner.nextLine();
			scanner.nextLine();
			System.out.println("enter the price: ");
			int price = scanner.nextInt();
			
			System.out.println("enter the isAvailable: ");
			String isAvailable = scanner.next();
			
			menu[i] = new Menu ( menuId,  restaurantId,  itemName,  description,  price,  isAvailable);
		}
		
		
		System.out.println("\nthe menu details are: ");
		
		for(Menu m : menu) {
			System.out.println(m.toString());
			System.out.println("-----------------------------");
		}
		scanner.close();
		
		
	}

}
