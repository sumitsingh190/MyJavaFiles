package oops;
// Interfaces are used to achieve abstraction.
// Interfaces are used to achieve multiple inheritance.
// Interfaces are used to achieve loose coupling(loose coupling means that the classes are not dependent on each other).
// Interfaces are used to achieve polymorphism.
// Interfaces do not have constructors.
// Interfaces cannot have functional implementations.
// Interfaces have abstract methods.

interface Animals{
    //Animal(){        ///we cannot create a constructor in an interface
    //    System.out.println("Animal");
    //}
    int eyes = 2;   //we can define variables in interfaces and they are by default public, static and final which means that they cannot be changed and is same for all
    public void walk();   //function definition is only done in interfaces
    
}

interface Herbivore{

}

class Cow implements Animals, Herbivore{    //Multiple inheritance is shown here which can only be implemented with interfaces in java; cow implements both the interfaces
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.walk();
    }
}

// interfaces are used to achieve abstraction and multiple inheritance
//static and final variables are defined in interfaces
//we cannot create objects of interfaces
//we cannot create constructors in interfaces
//we cannot create functional implementations in interfaces


//static are those roperties which are common to all the objects of a class
// we can access static properties without creating objects of a class 
// static properties are also known as class properties
// static variables, static methodss, static blocks are all static properties and can be accessed without creating objects of a class
// static means jo uss class ke har object me same hoga wo static properties hote hai
// static ko memory ek hee baar di jati hai
