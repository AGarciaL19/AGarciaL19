/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Alberto
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner leer = new Scanner (System.in );
      double a,b,c; //Coeficientes para x^2, x y c
      double x1,x2,d; //Soluciones y determinante
      System.out.println("Introduce primer coeficiente (a): ");
      a= leer.nextFloat();
      System.out.println("Introduce el segundo coeficiente: (b): ");
      b= leer.nextFloat();
      System.out.println("Introduce el tercer coeficiente: (c) :");
      c= leer.nextFloat();
      
      //Calculamos el determinante
      d=((b*b)-4*a*c);
      if (d<0)
      System.out.println("No existen soluciones reales");
      else{
         x1=(-b+Math.sqrt(d))/(2*a); 
         x2=(-b-Math.sqrt(d))/(2*a);
          System.out.println("Solución: " + x1);
          System.out.println("Solución: " + x2);
      }
      
      
    }
    
}
