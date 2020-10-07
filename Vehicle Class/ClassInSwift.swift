import Foundation

class Vehicle: NSObject {

    /// these initialized with default values
    var engine: String = "008x5"
    var price: Int = 500
    var color: String = "red"

    /// print out the values
    func displayAttributes() {
        print("engine: \(self.engine), price: \(self.price), color: \(self.color)")
    }
}

let car1 = Vehicle() /// create a default Vehicle
car1.displayAttributes() /// output: engine: 008x5, price: 500, color: red
