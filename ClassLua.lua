local Computer = {}

function Computer:new(obj)
    local obj = obj or {}
    setmetatable(obj, self)
    self.__index = self
    

    function obj:turnOn()
      print(self["name"] .. " has turned on!")
    end
    return obj
end


local newPC = Computer.new({["name"]="Testing Computer"})
newPC:turnOn()