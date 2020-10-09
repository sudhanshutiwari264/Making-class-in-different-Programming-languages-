class Internal(object):
    def __init__(self, seatbelt, ac):
        self.seatbelt = seatbelt
        self.ac = ac


class External(object):
    def __init__(self, color, model):
        self.color = color
        self. model = model


class Others(object):
    def __init__(self, price, mileage, year):
        self.price = price
        self.mileage = mileage
        self.year = year


class Vehicle(Internal, External, Others):
    def __init__(self, seatbelt, ac, color, model, price, mileage, year, type):
        self.type = type

        Internal.__init__(self, seatbelt, ac)
        External.__init__(self, color, model)
        Others.__init__(self, price, mileage, year)
        print("Vehicle Type: {}, \nSeatbelt: {}, \nAC: {}, \nColor: {}, \nModel: {}, \nPrice: ${}, \nMileage: {} km/l, \nYear: {}".format(self.type, self.seatbelt, self.ac, self.color, self. model, self.price, self.mileage, self.year))


vehicle1 = Vehicle(True, True, "Yellow", "QWE916XCV", "129999", "36.76", "2020", "Car")
