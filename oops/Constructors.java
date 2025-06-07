package oops;
// Constructors in java are used to initialize the object of a class.
// name of constructor is same as class name
// constructor has no return type
// constructor can be overloaded
// constructor can be called only once for an object
// constructor are called when an object of class is created

// Types of constructors
// default constructor are constructors which have no parameters and are used to initialize the object of a class.
// Non-parameterized constructor
class Students {
    String name;
    int age;

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    Students() {
        System.out.println("Constructor called");
    }

    //parameterized constructor
    Students(String name, int age) {
        this.name = name;   //this.name is name of class(jo sbse uper h) aur name wo h jo parameter meh diya hua h
        this.age = age;
    }

    //copy constructor
    Students(Students s3) {
        this.name = s3.name;
        this.age = s3.age;
    }
}

public class Constructors {
    public static void main(String[] args) {
        System.out.println("Program started");  // Added confirmation
        Students s1 = new Students();  // Constructor is called here
        s1.name = "Aman";
        s1.age = 24;
        s1.printInfo();

        Students s2 = new Students("Raju", 21);   //we need to give parameters in constructor so that it can be called 
        s2.printInfo();

        Students s3 = new Students(s1);      //copy constructor is called here; s1 is passed as parameter
        s3.printInfo();
    }
}
