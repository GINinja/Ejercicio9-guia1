import java.util.Scanner;
/**
 * Planeador de presupuesto para paseo.
 *
 * @author (GINinja)
 * @version (08012019)
 */
public class Paseo
{public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
         // calcular numero de buses
        System.out.println("Ingrese la cantidad de estudiantes gordos:");
        double estxl = input.nextDouble();
        System.out.println("Ingrese la cantidad de estudiantes flacos:");
        double estm = input.nextDouble();
        double capacidadBus = 60;
        
        double cantidadBus = ((estxl*2)+estm)/capacidadBus;
        System.out.println("La cantidad de buses necesaria es: "+ cantidadBus);;
        
       // Calcular el numero de comidas a servir
       
       System.out.println("Ingrese la cantidad de dias:");
       double dias = input.nextInt();
       double cantidadComidas = (dias*((estxl*5)+(estm*3)));
       System.out.println("La cantidad de comidas a servir: "+ cantidadComidas); 
        
       // Calcular precio de las comidas
    
       double precioalimento = 10000;
       double Alimentos = cantidadComidas * precioalimento;
       
       System.out.println("El precio total de las comidas es: "+ Alimentos);;
       
       // Calcular numero de habitaciones
       double capacidadhabitacion = 4;
       double ocupacion = (estxl + estm)/capacidadhabitacion;
       
       System.out.println("La cantidad de habitaciones necesarias es: "+ ocupacion);;
       // Calcular precio de alojamiento por noche
    
       double precionoche = 25000;
       double totalnoche = ocupacion * precionoche;
       
       System.out.println("El precio de alojamiento por noche es:"+ totalnoche);
       
       // Calcular el precio total de alojamiento
       
       double totalalojamiento = totalnoche * dias;
       
       System.out.println("El precio total de alojamiento es:"+ totalalojamiento);
       
}
}