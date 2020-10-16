class Vehicle:
    def __init__(self, year, make, speed):
        self.__yearmodel = year
        self.__make = make
        self.__speed = 0

    def set_year_model(self, year):
        self.__yearmodel = year

    def set_make(self, make):
        self.__make = make

    def set_speed(self, speed):
        self.__speed = 0

    def get_year_model(self):
        return self.__yearmodel

    def get_make(self):
        return self.__make

    def get_speed(self):
        return self.__speed

    #methods
    def accelerate(self):
        self.__speed +=5

    def brake(self):
        self.__speed -=5

    def get_speed(self):
        return self.__speed
    
    def main():
    
    year = input('Enter the vehicle year: ')
    make = input('Enter the vehicle make: ')
    speed = 0

    v1 = Vehicle(year, make, speed)
    v1.accelerate()
    print('The current speed is: ', v1.get_speed())
    v1.brake()
    print(' speed after brake is: ', v1.get_speed())