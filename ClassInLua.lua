local Vehicle = {}

function Vehicle:new(obj)
    local obj = obj or {}
    setmetatable(obj, self)
    self.__index = self
    

    function obj:display()
      print(self["name"] .. " is a " .. self["color"] .. " colored car that costs $" + self["price"])
    end
    return obj
end


local car1 = Vehicle.new({["model"]="008x5", ["price"]=500, ["color"]="Red"})
car1:display()