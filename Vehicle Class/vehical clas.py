class Vehicle:

    def __init__(self, price, color, model):
        self.price = price
        self.color = color
        self.model = model

    def display(self):
        print("Price : ", self.price, "$")
        print("Color : ", self.color)
        print("Model : ", self.model)


# inheritance
class carCompany(Vehicle):
    def __init__(self):
        super().__init__(price, color, model)

    def changeModel(self, model):
        self.model = model

    def changeColor(self, color):
        self.color = color

    def changePrice(self, price):
        self.price = price

