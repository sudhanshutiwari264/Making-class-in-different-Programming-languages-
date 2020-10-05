class Vehicle {
  price: number;
  color: string;
  model: string;

  constructor(thePrice: number, theColor: string, theModel: string) {
    this.price = thePrice;
    this.color = theColor;
    this.model = theModel;
  }

  showDetails() {
    console.log(`Price: ${this.price}`);
    console.log(`Color: ${this.color}`);
    console.log(`Model: ${this.model}`);
  }
}

let carOne = new Vehicle(500, 'Red', '008x5');
carOne.showDetails();
