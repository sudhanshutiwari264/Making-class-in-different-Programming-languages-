class Vehicle{
	float price;
	String color;
	String model;
  
  public Vehicle(float p,String c,String m)
	{
		price = p;
		color = c;
		model = m;
	}
  
	void display()
	{
	  System.out.println("Car Details.....");
	  System.out.println("Price is : " +price);
	  System.out.println("Color is : " +color);
	  System.out.println("Model is : " +model);
	}
}

public class ClassInJava{
public static void main(String [] args){
	Vehicle car1 = new Vehicle(500,"Red","008x5");
	car1.display();
	}
}
