class main {
 public static void main(String[] args) {       
        System.out.println("Hola");
        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AMQ123"), "ASJ123", "ASJ231");
       // car.passengenger = 4;
       uberX.setPassenger(4);
       uberX.printDataCar();
    
       //Información que ya no es necesaria
       /*
        Car car2 = new Car("QWE567", new Account("Andres Herrera", "QWE567"));
        car2.passengenger = 3;
        car2.printDataCar();*/

        UberVan uberVan = new UberVan("123RQ", new Account("Andres Herrera", "AMQ123"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }
}