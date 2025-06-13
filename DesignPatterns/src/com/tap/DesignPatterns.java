package com.tap;


interface Animal{
	
}

class AnimalFactory implements Animal{
	
	
	static Animal createInstance(String name) {
		
        if(name.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if(name.equalsIgnoreCase("cat")) {
            return new Cat();
        } else if(name.equalsIgnoreCase("horse")) {
            return new Horse();
        } else {
            return null;
        }
	}
}

class Dog implements Animal{
    
}

class Cat implements Animal{
    
}

class Horse implements Animal{
    
}



public class DesignPatterns {

	public static void main(String[] args) {
		
		Animal dog = AnimalFactory.createInstance("dog");
		Animal cat =  AnimalFactory.createInstance("cat");
		Animal horse = AnimalFactory.createInstance("horse");
		
		System.out.println(dog);
		System.out.println(cat);
		System.out.println(horse);

	}

}
