using System;

namespace classmobile
{
    class Mobile
    {
        //class member 
        private string name;  
        private int price;     
        private string color;

        
        public void display()
        {
            Console.WriteLine("Mobile Name : " + name);
            Console.WriteLine("Mobile Price : " + price);
            Console.WriteLine("Mobile color : " + color);
        }

        //main method
        static void Main(string[] args)
        {
            // Object instantiation 
            Mobile samsung = new Mobile();
            samsung.name = "Samsung";
            samsung.price = 18000;
            samsung.color = "white";
            samsung.display();

        }
    }
}
