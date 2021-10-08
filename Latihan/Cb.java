import java.util.Scanner; 
public class Cb {    
    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);        
        System.out.println("Please enter the value for radius");        
        double r = in.nextDouble();        
        //Calling the method circleArea()        
        double calcArea = circleArea(r);        
        System.out.println("The Area is: "+calcArea);   
     }    
        public static double circleArea(double radius){        
            double area = 3.142*Math.pow(radius,2);        
            return area;   
         } 
        } 

