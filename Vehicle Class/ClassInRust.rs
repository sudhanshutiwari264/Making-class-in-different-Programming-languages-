struct Vehicle {
    price: u64,
    color: String,
    model: String
}

impl Vehicle {
    pub fn buy(model: String, price: u64, color: String) -> Vehicle {
        Vehicle {
            model: model,
            color: color,
            price: price
        }
    }

    pub fn drive(self) {
        println!("{} colored {} goes brrrrrrrr",self.color,self.model);
    }
}

fn main() {
    let car1 = Vehicle::buy(String::from("008x5"),500 ,String::from("Red"));
    car1.drive();
}