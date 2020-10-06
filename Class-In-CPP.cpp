#include<bits/stdc++.h>
using namespace std;

class Vehicle {
private:
    double price;
    string color;
    string model;

public:
    Vehicle(double price, string color, string model) {
        this->price = price;
        this->color = color;
        this->model = model;
    }

    int getPrice() {
		return price;
	}

	void setPrice(int price) {
		this->price = price;
	}

	string getColor() {
		return color;
	}

	void setColor(string color) {
		this->color = color;
	}

	string getModel() {
		return model;
	}
	
	void setModel(string model) {
		this->model = model;
	}

    void showDetails() {
        cout << "Vehicle model: " << this->model << endl;
        cout << "Vehicle color: " << this->color << endl;
        cout << "Vehicle price: $" << this->price << endl;
    }
};
int main() {
    Vehicle car1(500, "Red", "008x5");
    car1.showDetails();
}

