class Vehicle:
    def __init__(self, price: str, color: str, model: str):
        self.price = price
        self.color = color
        self.model = model


car1 = Vehicle(price='$500', color='Red', model='008x5')
print(car1.__dict__)