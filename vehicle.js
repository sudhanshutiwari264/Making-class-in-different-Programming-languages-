// Defining the class
class Vehicle {
    // Constructor defines values that are used and stored within the class
    /**
     * @description A Vehicle Object
     * @param {Number} price Price of the vehicle
     * @param {String} color Color of the vehicle
     * @param {String} model Model of the vehicle
     */
    constructor(price, color, model) {
        // this. - refers to the class itself
        // Setting class values of price, color and model from paramters
        this.price = price;
        this.color = color;
        this.model = model;
    };
    // Creates new methord that can be used after initializing the class
    /**
     * @function
     * @description Logs out vehicle information to console
     */
    vehicleDetails() {
        // Function logs values
        console.log(`Color: ${this.color}`);
        console.log(`Price: ${this.price}`);
        console.log(`Model: ${this.model}`);
    };
};

module.exports.Vehicle = Vehicle

// initializing the class, passing values to be used later
let car = new Vehicle(500, 'Red', '008x5');
// Using the vehicleDetails that we defined before
console.log(car.vehicleDetails());
