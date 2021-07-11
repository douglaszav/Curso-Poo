<?php
require_once('account.php');
class Car {
    public $id;
    public $license;
    public $driver;
    public $passenger;

    public function __construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }
    
//método
    public function printDataCar() {
        echo "Licencia: $this->license Driver: ".$this->driver->name;
    }
}

//método más legible
    public function printDataCar() {
        echo "
            Licencia: $this->license 
            Driver: {$this->driver->name} 
            Número de pasajeros: $this->passenger
        

        ";
    }


//Inicio de GET Y SET
public function getPassenger() {
    return $this->passenger;
}

public function setPassenger($passenger) {
        
    if ($passenger == 4) {
        $this->passenger = $passenger;
    }
    else {
        echo "Necesitas asignar 4 pasajeros";
    }

}

