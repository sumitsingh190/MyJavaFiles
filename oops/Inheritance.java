package oops;

// Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object.

class Shape{
    String color;
    public void area(){
        System.out.println("Displays area");
    }
}
    // Single level inheritance
class Triangle extends Shape{       //Triangle class inherits Shape class and will have all the properties of Shape class which is color whether we have defined it or not
    public void area(int l, int h){     
        System.out.println(1/2*l*h);
    }
}
   //Multi-level Inheritance
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
        //Hierarchical Inheritance
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
} 

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
        
    }
    
}
