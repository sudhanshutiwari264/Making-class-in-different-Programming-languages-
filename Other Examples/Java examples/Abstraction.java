/*
Likewise in Object-oriented programming, abstraction is a process of hiding the implementation details 
from the user, only the functionality will be provided to the user. In other words, the user will have the 
information on what the object does instead of how it does it.


A class which contains the abstract keyword in its declaration is known as abstract class

(01)Abstract classes may or may not contain abstract methods, i.e., methods without body ( public void get(); )
    -you can put body if you know the real implementation. Otherwise you can make it abstract and implement it lately by a child class

(02)But, if a class has at least one abstract method, then the class must be declared abstract.

(03)If a class is declared abstract, it cannot be instantiated.

(04)To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it.

(05)If you inherit an abstract class, you have to provide implementations to all the abstract methods in it.

*/

abstract class Shape  
{ 
    String color; 
      
    // these are abstract methods 
    abstract double area(); 
    public abstract String toString(); 
      
    // abstract class can have constructor 
    public Shape(String color) { 
        System.out.println("Shape constructor called"); 
        this.color = color; 
    } 
      
    // this is a concrete method 
    public String getColor() { 
        return color; 
    } 
} 
class Circle extends Shape 
{ 
    double radius; 
      
    public Circle(String color,double radius) { 
  
        // calling Shape constructor 
        super(color); 
        System.out.println("Circle constructor called"); 
        this.radius = radius; 
    } 
  
    @Override
    double area() { 
        return Math.PI * Math.pow(radius, 2); 
    } 
  
    @Override
    public String toString() { 
        return "Circle color is " + super.color +  
                       "and area is : " + area(); 
    } 
      
} 
class Rectangle extends Shape{ 
  
    double length; 
    double width; 
      
    public Rectangle(String color,double length,double width) { 
        // calling Shape constructor 
        super(color); 
        System.out.println("Rectangle constructor called"); 
        this.length = length; 
        this.width = width; 
    } 
      
    @Override
    double area() { 
        return length*width; 
    } 
  
    @Override
    public String toString() { 
        return "Rectangle color is " + super.color +  
                           "and area is : " + area(); 
    } 
  
} 
public class Test  
{ 
    public static void main(String[] args) 
    { 
        Shape s1 = new Circle("Red", 2.2); 
        Shape s2 = new Rectangle("Yellow", 2, 4); 
          
        System.out.println(s1.toString()); 
        System.out.println(s2.toString()); 
    } 
} 

/*
Advantages of Abstraction

It reduces the complexity of viewing the things.
Avoids code duplication and increases reusability.
Helps to increase security of an application or program as only important details are provided to the user.
*/