class Vehicle:
    def __init__(self, price: str, color: str, model: str):
        self.price = price
        self.color = color
        self.model = model

    def get_vehicle(obj):
        """returns attributes of the obj"""
        return obj.__dict__


if __name__ == "__main__":
    car1 = Vehicle(price='$500', color='Red', model='008x5')
    print(Vehicle.get_vehicle(car1))
