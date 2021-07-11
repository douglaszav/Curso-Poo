import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial; 
    Integer passenger;
    
       public UberVan(String license, Account driver, Map<String, Map<String,Integer>> typeCarAccepted, 
        ArrayList<String> seatsMaterial){
            super(license, driver);
            this.typeCarAccepted = typeCarAccepted;
            this.seatsMaterial = seatsMaterial;
        }

        public UberVan(String license, Account driver){
            super(license, driver);
        }

        //sobreescritura de infromación
       @Override
       public void setPassenger(Integer passenger) {
        if(passenger == 6){
            this.passenger = passenger;
        }
        else{
            System.out.println("Error, los pasajeros tienen que ser 6");
        }
       } 


    }



