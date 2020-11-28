package Otim;
/**
 *
 * @author OGERISON
 */
 public class Car extends Vehicle
    {
        boolean wintertires = false;
        Car (boolean winter){
            wintertires = winter;
        }
        public String toString()
        {
            return "THIS VEHICLE IS "+Color+", HAS WINTER TYRES: "+wintertires;  
        }
    }
