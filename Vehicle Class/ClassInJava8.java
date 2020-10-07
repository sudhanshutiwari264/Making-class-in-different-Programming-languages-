Class Vehicle{
String price, color, model;
  Vehicle(String price,String color,String model){
    this.price=price;
    this.color=color;
    this.model=model;
  }
  void getDetails(){
    System.out.println("price "+this.price +" \ncolor as "+this.color+" \nmodel as "+this.model);
  }
  public static void main(String args[]){
    Vehicle car1= new Vehicle("500$", "Red", "008x5");
    car1.getDetails();
  }
}
