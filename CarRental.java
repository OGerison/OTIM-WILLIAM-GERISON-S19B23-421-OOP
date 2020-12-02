package Otim;
/**
 *
 * @author OGERISON
 */
    public class CarRental 
    {
    
    public static class Truck extends Vehicle
    {
       boolean Trailer = false; 
       Truck(String truckcolor,boolean trucker){
           this.Color = truckcolor;
           Trailer = trucker;
       }
        public String toString()
        {
           return "THIS VEHICLE IS: "+Color+", HAS TRAILER: "+Trailer;  
        }
    } 
    public static class Garage
    {        
        Vehicle newvehicle = new Car("RED", true);
        Vehicle newtruck = new Truck("BLACK",true);
       public String setVehicle(Vehicle parked)
        {
            return parked.toString();
        }
         public String toString(String newvehicle, String newtruck) 
    {
        return newtruck.toString()+newvehicle.toString();  
    }
}
    public static class GarageTester
    {
        public String getExample()
        {
            Truck truck = new Truck("YELLOW", false);
            truck.Color = "ORANGE";
            truck.Trailer = false;         
            Garage garage = new Garage();
            return garage.setVehicle(truck);
        }
    }
    public static class Customer
    {   
        String name;
        String address;
    }
    public static class CarRentalContract
    {
        Customer customer = new Customer();
        Vehicle vehicle = new Car("BLACK", false); 
        CarRentalContract(String name,String address)
        {
            customer.name = name;
            customer.address = address;
        }     
        public String toString()
        {
           return customer.name +" : "+vehicle.toString();  
        }
    }
    public static class carRental
    {
        String rent[] = new String[1]; 
        void addContract(CarRentalContract c1)
        {         
            for(int i=0; i<rent.length; i++)
            {
                rent[i] = c1.toString(); 
            }
        }      
        String displayContracts()
        {         
            if(rent.length > 0)
            {
               for (String allCurrentContracts : rent)
               {
                    System.out.println(allCurrentContracts);
               } 
            }
            else
            {            
                return "NO CAR RENTAL CONTRACT(S).";
            }
            return "";
        }
    }
    public static void main(String[] args)
    {
        
        Car car = new Car("WHITE", true);
        System.out.println(car.toString());   
        
        Truck truck = new Truck("GREEN", true);
        System.out.println(truck.toString());
        
        GarageTester garagetester = new GarageTester();
        System.out.println(garagetester.getExample());
        System.out.println("\n");
        
        CarRentalContract carrentcontract = new CarRentalContract("OTIM","BERN");     
        carRental carrental = new carRental();
        carrental.addContract(carrentcontract);
         
        System.out.println("MY CONTRACTS:" + " \n");
        System.out.println(carrental.displayContracts());  
    } 
}




