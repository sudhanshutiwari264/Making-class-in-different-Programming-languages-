#Making class vehicle:
class Tree:
  
  def __init__(self,height,width,age):
    self.height = height
    self.width = width
    self.age = age
  def Show_details(self):
    print("Self.age = ",self.age)
    print("Self.width = ",self.width)
    print("Self.height = ",self.height)
    
Apple = ("10 meter","1.5 meter",5)
#calling Show_details function from the vehicle class for CarOne 
Apple.Show_details()
