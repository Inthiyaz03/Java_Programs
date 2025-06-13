package com.tap;



class Heart{
	private int weight;
	private int bpm;
	
	public Heart(int weight,int bpm) {
		this.weight=weight;
		this.bpm=bpm;
	}
	
	int getWeight() {
		return weight;
	}
	int getBpm() {
		return bpm;
	}
}

class Brain{
	private int weight;
	private String colour;
	
	public Brain(int weight,String colour) {
		this.weight=weight;
		this.colour=colour;
	}
	
	int getWeight() {
		return weight;
	}
	String getColour() {
		return colour;
	}
	
}

class Bike{
	private String brand;
	private float mileage;
	
	public Bike(String brand, float mileage) {
		this.brand=brand;
		this.mileage=mileage;
	}
	
	
	String getBrand() {
		return brand;
	}
	
	float getMilegae() {
		return mileage;
	}
}

class Book{
	private String name;
	private String author;
	
	public Book(String name,String author) {
		this.name=name;
		this.author=author;
	}
	
	String getName() {
		return name;
	}
	
	String getAuthor() {
		return author;
	}
	
}


class Student{
	Heart h = new Heart(2, 3);
	Brain b = new Brain(4,"grey");
	
	void hasBook(Book boo) {
		System.out.println(boo.getName());
		System.out.println(boo.getAuthor());
	}
	
	void hasBike(Bike b) {
		System.out.println(b.getBrand());
		System.out.println(b.getMilegae());
	}
	
}



public class Relation {

	public static void main(String[] args) {
		Bike b = new Bike("ninja", 12.5f);
		Book bo = new Book("Half blood prince", "jk Rowling");
		Student st = new Student();
		
		System.out.println(st.h.getWeight());
		System.out.println(st.h.getBpm());
		
		System.out.println(st.b.getWeight());
		System.out.println(st.b.getColour());
		st.hasBike(b);
		st.hasBook(bo);
		
		st=null;
		st.hasBike(b);
		st.hasBook(bo);
		System.out.println(st.h.getWeight());
		System.out.println(st.h.getBpm());
		
		System.out.println(st.b.getWeight());
		System.out.println(st.b.getColour());
		
		
	}

}
