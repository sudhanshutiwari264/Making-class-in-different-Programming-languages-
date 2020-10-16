using System;  
  public class Swapnum 
   {  
     public static void Main(string[] args)  
      {  
       int  a=11, b=10;            
       Console.WriteLine("Before swapping a= "+a+" b= "+b);    
       a=a*b;       
       b=a/b;       
       a=a/b;    
       Console.Write("After swapping a= "+a+" b= "+b);       
     }  
  }   