package main

import "fmt"

// Creating struct or Class Attributes
type Vehicle struct {
	model string
	color string
	price int
}

// Creating method for printing Vehicle info
func (v Vehicle) printVehicleInfo() {
	fmt.Println("Model : ", v.model)
	fmt.Println("Color : ", v.color)
	fmt.Println("Price : $", v.price)
	fmt.Println("")
}

func main() {
	// Creating Object
	// First Approach
	v1 := Vehicle{"008x5", "Red", 500}
	//Second Approach
	v2 := Vehicle{model: "008x5", color: "Red", price: 500}

	v1.printVehicleInfo()
	v2.printVehicleInfo()
}
