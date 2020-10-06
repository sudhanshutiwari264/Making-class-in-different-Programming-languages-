public class VehicleProgram{
  int Price;
  String Color;
  String Model;
  public void print(int p,String c,String m)
  {
  this.Price=p;
  this.Color=c;
  this.Model=m;
  System.out.println("Price ="+Price+"\nColor ="+Color+"\nModel ="+Model);
  }
  public static void main(String[] args){
  VehicleProgram v=new VehicleProgram();
  v.print(500,"Red","008x5");
  }
  }
 
