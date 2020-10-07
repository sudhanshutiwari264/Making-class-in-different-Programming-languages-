# Making the Vehicle class
class Vehicle

  def initialize(params={price: nil, color: nil, model: nil})
    @price = params[:price]
    @color = params[:color]
    @model = params[:model]
  end

  def display
    put "Price: #{@price}"
    put "Color: #{@color}"
    put "Model: #{@model}"
  end

end

# Initializing a new Vehicle object
car1 = Vehicle.new({price: 500, color: 'Red', model: '008x5'})

# calling the display method from the Vehicle class from car1
car1.display

