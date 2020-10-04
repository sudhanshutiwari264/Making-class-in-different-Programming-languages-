class Vehicle {
    constructor(price, color, model) {
        this.price = price;
        this.color = color;
        this.model = model;
    };
    vehicleDetails() {
        console.log(`Color: ${this.color}`);
        console.log(`Price: ${this.price}`);
        console.log(`Model: ${this.model}`);
    };
};

let car = new Vehicle(500, 'Red', '008x5');
return console.log(car.vehicleDetails());