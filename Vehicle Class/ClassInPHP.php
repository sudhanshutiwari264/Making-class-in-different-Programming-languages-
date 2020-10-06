<?php
  class Vehicle {
    private int $price;
    private string $color;
    private string $model;

    function __construct(int $price, string $color, string $model) {
      $this->price = $price;
      $this->color = $color;
      $this->model = $model;
    }

    public function vehicleDetails() {
      echo "Color: ".$this->color." ";
      echo "Price: ".$this->price." ";
      echo "Model: ".$this->model." ";
    }
  }

  $car = new Vehicle(500, "red", "008x5");
  $car->vehicleDetails();
