/*
Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) 
together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and
 can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

To achieve encapsulation in Java −
    (01)Declare the variables of a class as private.
    (02)Provide public setter and getter methods to modify and view the variables values.

*/


public class Encapsulate 
{ 
    // private variables declared  
    // these can only be accessed by  
    // public methods of class 
    private String geekName; 
    private int geekRoll; 
    private int geekAge; 
  
    // get method for age to access  
    // private variable geekAge 
    public int getAge()  
    { 
      return geekAge; 
    } 
   
    // get method for name to access  
    // private variable geekName 
    public String getName()  
    { 
      return geekName; 
    } 
      
    // get method for roll to access  
    // private variable geekRoll 
    public int getRoll()  
    { 
       return geekRoll; 
    } 
   
    // set method for age to access  
    // private variable geekage 
    public void setAge( int newAge) 
    { 
      geekAge = newAge; 
    } 
   
    // set method for name to access  
    // private variable geekName 
    public void setName(String newName) 
    { 
      geekName = newName; 
    } 
      
    // set method for roll to access  
    // private variable geekRoll 
    public void setRoll( int newRoll)  
    { 
      geekRoll = newRoll; 
    } 
} 

public class TestEncapsulation 
{     
    public static void main (String[] args)  
    { 
        Encapsulate obj = new Encapsulate(); 
          
        // setting values of the variables  
        obj.setName("Harsh"); 
        obj.setAge(19); 
        obj.setRoll(51); 
          
        // Displaying values of the variables 
        System.out.println("Geek's name: " + obj.getName()); 
        System.out.println("Geek's age: " + obj.getAge()); 
        System.out.println("Geek's roll: " + obj.getRoll()); 
          
        // Direct access of geekRoll is not possible 
        // due to encapsulation 
        // System.out.println("Geek's roll: " + obj.geekName);         
    } 
} 

/*
Benefits of Encapsulation
    (01)The fields of a class can be made read-only or write-only.
    (02)A class can have total control over what is stored in its fields.
*/