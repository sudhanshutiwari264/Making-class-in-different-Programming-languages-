class Vehicle {
   private int price;
   private String color;
   private String model;
	
   void setprice(int Vprice) {
      price = Vprice;
   }
	
   void setcolor(String Vcolor) {
      color = Vcolor;
   }
   
   void setmodel(String Vmodel) {
      model = Vmodel;
   }
	
   int getprice() {
      return this.price;
   }
	
   String getcolor() {
      return this.color;
   }
   
    String getmodel() {
      return this.model;
   }
	
   static void main(String[] args) {
      Vehicle v1 = new Vehicle();
      v1.setprice(10000);
      v1.setcolor("Blue");
      v1.setmodel("GT")
		
      println(v1.getprice());
      println(v1.getcolor());
      println(v1.getmodel());
   } 
}
