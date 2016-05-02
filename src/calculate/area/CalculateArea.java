/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate.area;
import java.util.Scanner
/**
 *
 * @author malikmbaye
 */
public class CalculateArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello! Welcome to the Area Calculatron. Please input your values as directed. ");
        System.out.println("Please input Square Height");
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        System.out.print("Sqaure Height = ")
                System.out.println(a);
        System.out.println("Please Input Triangle Height");
                double b = input.nextDouble();
                System.out.print("Triangle Height = ")
                System.out.println(b);
                System.out.print("Please Input Triangle Base");
                double c = input.nextDouble();
                System.out.print("Triangle Base = ")
                        System.out.println(c)
                System.out.println("Please Enter Circle Radius");
                double d = input.nextDouble();
                System.out.print("Circle Radius = ")
                        System.out.println(d);
        input.close();
        int SqA = a * a;
        double TriA = 0.5 * (b*c);
        double CircleA = 3.14159 * (d*d);
        System.out.println("Areas Displayed Below");
        System.out.print("Square Area = ")
        System.out.println(SqA);
        System.out.print("Triangle Area = ")
        System.out.println(TriA);
        System.out.print("Circle Area = ");
        System.out.println(CircleA);
        
               
               
        
        
                     
        
        // TODO code application logic here
    }
    
}
