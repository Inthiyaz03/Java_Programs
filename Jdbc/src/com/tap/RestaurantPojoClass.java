package com.tap;

import java.util.Scanner;

class Restaurant{
	private int restaurantId;
	private String name;
	private String cusineType;
	private String address;
	private String rating;
	private String isActive;
	
	
	public Restaurant() {
		
	}


	public Restaurant(int restaurantId, String name, String cusineType, String address, String rating,
			String isActive) {
		super();
		this.restaurantId = restaurantId;
		this.name = name;
		this.cusineType = cusineType;
		this.address = address;
		this.rating = rating;
		this.isActive = isActive;
	}


	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setCusineType(String cusineType) {
		this.cusineType = cusineType;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setRating(String rating) {
		this.rating = rating;
	}


	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}


	public int getRestaurantId() {
		return restaurantId;
	}


	public String getName() {
		return name;
	}


	public String getCusineType() {
		return cusineType;
	}


	public String getAddress() {
		return address;
	}


	public String getRating() {
		return rating;
	}


	public String getIsActive() {
		return isActive;
	}
	
	
	@Override
	public String toString() {

		
		return "restaurantId : " + restaurantId + "\n" +
				"name: " + name + "\n" +
				"cusineType: " + cusineType + "\n" +
				"Address: " + address + "\n" +
				"rating: " + rating + "\n" +
				"isActive: " + isActive + "\n";
	}
	
	
	
}




public class RestaurantPojoClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the no of restaurants: ");
		int noOfRestaurants = scanner.nextInt();
		int n = noOfRestaurants;
		Restaurant [] restaurant = new Restaurant[n]; 
		for(int i=0;i<n;i++) {
			System.out.println("enter the details of restaurant: " + (i+1));
			
			System.out.println("enter the restaurantid: ");
			int restaurantId = scanner.nextInt();
			
			System.out.println("enter the name: ");
			String name=scanner.next() ;
			
			System.out.println("enter the cusineType: ");
			String cusineType = scanner.next();
			
			System.out.println("enter the address: ");
			String address= scanner.next() ;
			
			System.out.println("enter the rating: ");
			String rating =scanner.next();
			
			System.out.println("enter the status isActive: ");
			String isActive = scanner.next() ;
			
			restaurant[i] = new Restaurant( restaurantId,  name,  cusineType,  address,  rating, isActive) ;
			
		}
		
		
		System.out.println("/details of restaurant: ");
		
		for( Restaurant res : restaurant ) {
			System.out.println(res.toString());
			System.out.println("-----------------------------");
		}
		scanner.close();

	}

}

