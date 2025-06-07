package oops;

public class Polymorphism {
  // Polymorphism is the ability of an object to take on many forms.
    static class Students {
        String name;
        int age;

        public void printinfo(String name){      //method overloading
            System.out.println(name);             //compile-time polymorphism
        }

        public void printinfo(int age){         //should have different parameters
            System.out.println(age);
        }   
        public void printinfo(String name, int age){
            System.out.println(name + " " + age);
        }
    }

    public static void main(String[] args){
        Students s1 = new Students();
        s1.name = "Aman";
        s1.age = 24;
        s1.printinfo(s1.name);
        s1.printinfo(s1.age);       
        s1.printinfo(s1.name, s1.age);      
    }
    
}
