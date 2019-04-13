/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulos;

import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author santi
 */
public class Triangulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            int x = 0;
            int y = 0;
            int z = 0;
            
            Scanner reader = new Scanner(System.in);
                    
            System.out.println("Ingrese x: ");   
            x = reader.nextInt();
            System.out.println("Ingrese y: ");
            y = reader.nextInt();
            System.out.println("Ingrese z: ");
            z = reader.nextInt();
         
           if( (x<=0) || (y<=0) || (z<=0) ){
                  System.out.println("Los lados de un triangulo no pueden ser 0 o negativos");         
                  return;
           }  
          
           if (x==y && x==z) {
            System.out.println("El Triangulo es Equilatero");
        }
           else if (x==y || x==z || z==y){
               System.out.println("El Triangulo es Isoceles");
           }
           else
               System.out.println("El Triangulo es Escaleno");
    }
}
