package oops;

// Abstraction: Shape is an abstract class
abstract class Shape {
    // Encapsulation: Private field for color
    private String color;

    // Getter and setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Abstract method to be implemented by subclasses
    public abstract void draw();

    // Overloaded method to draw with additional description
    public abstract void draw(String description);
}

// Inheritance: Circle is a subclass of Shape
class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    // Getter and setter for radius
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Polymorphism: Circle's implementation of draw
    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius + " and color: " + getColor());
    }

    // Method overloading: Circle's overloaded draw method
    @Override
    public void draw(String description) {
        System.out.println("Drawing a Circle with radius: " + radius + ", color: " + getColor() + ". " + description);
    }
}

// Inheritance: Rectangle is a subclass of Shape
class Rectangle extends Shape {
    private int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Getter and setter for length and width
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // Polymorphism: Rectangle's implementation of draw
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with length: " + length + ", width: " + width + " and color: " + getColor());
    }

    // Method overloading: Rectangle's overloaded draw method
    @Override
    public void draw(String description) {
        System.out.println("Drawing a Rectangle with length: " + length + ", width: " + width + ", color: " + getColor() + ". " + description);
    }
}

public class AllFourPillars {
    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle
        Shape myCircle = new Circle(5);
        myCircle.setColor("Red");  // Encapsulation: Setting color
        myCircle.draw();  // Polymorphism: Calls Circle's draw method

        // Calling overloaded method for Circle
        myCircle.draw("It has a large radius.");

        Shape myRectangle = new Rectangle(10, 4);
        myRectangle.setColor("Blue");  // Encapsulation: Setting color
        myRectangle.draw();  // Polymorphism: Calls Rectangle's draw method

        // Calling overloaded method for Rectangle
        myRectangle.draw("It has a rectangular shape.");
    }
}


// Drawing a Circle with radius: 5 and color: Red
// Drawing a Circle with radius: 5, color: Red. It has a large radius.
// Drawing a Rectangle with length: 10, width: 4 and color: Blue
// Drawing a Rectangle with length: 10, width: 4, color: Blue. It has a rectangular shape.

