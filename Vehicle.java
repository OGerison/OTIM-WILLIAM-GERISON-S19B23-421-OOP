package Otim;
/**
 *
 * @author OGERISON
 */
public class Vehicle 
   {
        String Color = "WHITE";
        String getColor(String color)
        {
            return color;
        }
        public String toString()
        {
            return "THIS VEHICLE IS: "+ getColor(Color);  
        }
}
   
