
public class Vehicle {
	
	int price;
	String colour;
	String model;
	
	public Vehicle(int price, String colour, String model) {
		this.price = price;
		this.colour = colour;
		this.model = model;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

public void display()
{
	System.out.println("price: "+price);
	System.out.println("colour: "+colour);
	System.out.println("model: "+model);
	
}

	public static void main(String[] args) {
		
		Vehicle car1=new Vehicle(500,"Red","008x5");
		car1.display();

		
	}

	
}
