using System;

namespace MyApplication
{
  class Vehicle
  {
    string color = "red";
    string price = "500$";
    string model = "008x5";

    static void Main(string[] args)
    {
      Vehicle car1 = new Vehicle();
      Console.WriteLine(car1.price);
      Console.WriteLine(car1.color);
      Console.WriteLine(car1.model);
      
    }
  }
}