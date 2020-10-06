#include <bits/stdc++.h>
using namespace std;

class Vehicle
{
private:
    int price;
    string colour,model;
public:
    Vehicle(int p,string c,string m)
    {
        price = p;
        colour = c;
        model = m;
    }
    void DisplayData(void)
    {
    cout<<"Price = "<<price<<endl;
    cout<<"Color = "<<colour<<endl;
    cout<<"Model = "<<model<<endl;
    }
};
int main() 
{
	Vehicle car1(500,"Red","008x5");
	car1.DisplayData();
	return 0;
}
