using System;
public class Vehicle
{
	private int price;
	private string color;
	private string model;
	public Vehicle(int p,string c,string m)
	{
		price = p;
		color = c;
		model = m;
	}
	public void display()
	{
	Console.Write("Price = ");
	Console.Write(price);
	Console.Write("\n");
	Console.Write("Color = ");
	Console.Write(color);
	Console.Write("\n");
	Console.Write("Model = ");
	Console.Write(model);
	Console.Write("\n");
	}
}

public static class GlobalMembers
{
	internal static void Main()
	{
		Vehicle car0 = new Vehicle(500, "Red", "008x5");
		car0.display();
	}
}
