#Making class vehicle:
class vehicle:
  
  def __init__(self,price,color,model):
    self.price = price
    self.color = color
    self.model = model
  def Show_details(self):
    print("Self.color = ",self.color)
    print("Self.price = ",self.price)
    print("Self.model = ",self.model)
    
CarOne = vehicle(500,"Blue","RX100") 
#calling Show_details function from the vehicle class for CarOne 
CarOne.Show_details()
