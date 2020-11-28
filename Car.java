package Otim;
/**
 *
 * @author OGERISON
 */
 public class Car extends Vehicle
    {
        boolean wintertires = false;
         Car (String carcolor,boolean winter){
            this.Color = carcolor;
            wintertires = winter;
        }
        }
        public String toString()
        {
            return "THIS VEHICLE IS "+Color+", HAS WINTER TYRES: "+wintertires;  
        }
    }
