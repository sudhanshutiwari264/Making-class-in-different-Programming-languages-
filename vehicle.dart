// Define the class
class Vehicle{
  double price;
  String color;
  String model;
  
  //Constructor
  Vehicle(double price,String color,String model){
    this.price = price;
    this.color = color;
    this.model = model;
  }
  
  // Method for printing details
  void printVehicleDetails(){
    print("Price : ${this.price}");
    print("Color: " + this.color);
    print("Model: " + this.model);
  }
}

void main() {
  Vehicle car1 = new Vehicle(500, "Red" ,"008x5");

  car1.printVehicleDetails();
}

