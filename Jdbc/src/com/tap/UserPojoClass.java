package com.tap;



import java.time.LocalDate;
import java.util.Scanner;

class User {
	private int userid;
	private String username;
	private String password;
	private String email;
	private String address;
	private String role;
	private LocalDate createdDate;   
	private LocalDate lastLoginDate; 

	
	public User() {
		
	}

	
	public User(int userid, String username, String password, String email, String address, String role, LocalDate lastLoginDate) {
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.role = role;
		this.createdDate = LocalDate.now();
		this.lastLoginDate = lastLoginDate; 
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setLastLoginDate(LocalDate lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	
	public int getUserid() {
		return userid;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public String getRole() {
		return role;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public LocalDate getLastLoginDate() {
		return lastLoginDate;
	}

	
	@Override
	public String toString() {
		return "User ID: " + userid + "\n" +
				"Username: " + username + "\n" +
				"Email: " + email + "\n" +
				"Address: " + address + "\n" +
				"Role: " + role + "\n" +
				"Created Date: " + createdDate + "\n" +
				"Last Login Date: " + lastLoginDate + "\n";
	}
}

public class UserPojoClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Create an array to store User objects
		System.out.println("How many users do you want to add?");
		int numberOfUsers = scanner.nextInt();
		User[] users = new User[numberOfUsers];

		// Take input for each user
		for (int i = 0; i < numberOfUsers; i++) {
			System.out.println("Enter details for User " + (i + 1));

			System.out.print("Enter User ID: ");
			int userid = scanner.nextInt();

			System.out.print("Enter Username: ");
			String username = scanner.next();

			System.out.print("Enter Password: ");
			String password = scanner.next();

			System.out.print("Enter Email: ");
			String email = scanner.next();

			System.out.print("Enter Address: ");
			String address = scanner.next();

			System.out.print("Enter Role: ");
			String role = scanner.next();

			System.out.print("Enter Last Login Date (YYYY-MM-DD): ");
			String lastLogin = scanner.next();
			LocalDate lastLoginDate = LocalDate.parse(lastLogin);  // Parse input to LocalDate

			// Create a new User object with the entered details
			users[i] = new User(userid, username, password, email, address, role, lastLoginDate);
		}

		// Display the user details using the toString method
		System.out.println("\nUser Details:");
		for (User user : users) {
			System.out.println(user.toString());  // Calls the overridden toString method
			System.out.println("--------------------------");
		}

		scanner.close();
	}
}
