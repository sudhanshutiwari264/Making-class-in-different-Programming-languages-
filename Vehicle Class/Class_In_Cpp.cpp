#include <iostream>
#include <fstream>
#include <iomanip>
#include <functional>
#include <algorithm>
#include <string>
#include <cstdlib>
#include <sstream>
using namespace std;
//Vehicle Class
class Vehicle {
public:
   string model; // model
   string color;  // color
   int	price;  // price
public:
//Sets to default values
Vehicle() {
   model = " ";
   color = " ";
   price= 0;
}
Vehicle(string model, string color, int price) {
   model = model;
   color = color;
   price = price;
}
void setModel(string model) {
   model = model;
}
void setColor(string color) {
   color = color;
}
void setPrice(int price) {
   price = price;
}
string getModel() {
   return model;
}
string getColor() {
   return color;
}
int getPrice() {
   return price;
}
};
//creating objects
int main()
{
	Vehicle Car1;
	Car1.model = "008x5";
	Car1.color ="Red";
    Car1.price = 500;
    cout<<Car1.model<<endl;
    cout<<Car1.color<<endl;
    cout<<Car1.price;
    return 0;
}
