package oops;

class Pen{
    String color;
    String type;
    public void write(){                             
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color); //this keyword is used to refer to the current object who is calling the method
    }
}

class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}


public class ClassesObjects { 
    public static void main(String[] args) {
        Pen pen1 = new Pen();     // creating an object
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor(); 


        Student s1 = new Student();   //new keyword is used to create an object
        s1.name = "Aman";
        s1.age = 24;
        s1.printInfo();
        
    }
}


