package oops;

 // Abstraction is the process of hiding the implementation details and showing only functionality to the user. 
 // Abstraction is achieved by using abstract classes and interfaces.
 // Abstract class is a class that is declared with the abstract keyword.
 // Abstract method is a method that is declared with the abstract keyword.
 // Abstract class can have abstract and non-abstract methods.
 // Abstract class cannot be instantiated.
 // Abstract class can have constructors and static methods also.
 // Abstract class can have final methods which will force the subclass not to change the body of the method.
 // Abstract class can have final variables.
 // Abstract class can have non-final variables.
 // Abstract class can have constructors.
 // Abstract class can have static methods.
 // Abstract class can have static final variables.

 abstract class Animal{
    abstract void walk();  //abstract method is used because we want walk method to be implemented in the subclass
    public void eat(){      //non-abstract method
        System.out.println("Animal eats");
    }

    Animal(){ //creating a constructor
        System.out.println("You are creating a new animal");
    }
}


class Horse extends Animal{

    Horse(){
        System.out.println("Created a Horse");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();   //creating an object of Horse class and calling the constructor of Horse class and its parent class Animal class; first the constructor of Horse class will be called then the constructor of Animal class will be called
        horse.walk(); //calling the walk method of Horse class
        horse.eat();  //calling the eat method of Animal class
    }
}

//jab v aap derived class mein constructor call karoge toh parent class ka constructor pehle call hoga aur phir child class ka constructor call hoga
//this is called constructor chaining