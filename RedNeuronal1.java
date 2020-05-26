/*
*Implemente un algoritmo que le permita:
1) Desplegar el nombre de tu paper.
2) Qué es una red neuronal.
3) Cuáles son los elementos que conforman una red neuronal.
4) Cómo utilizaron la redneuronal en el proyecto que usted ha selecionado.
5) Cómo utilizaria usted la red neuronal como mejoramineto al proyecto propuesto.
6) En qué cosistio el entrenamineto utilizando la red neuronal, e idique 
el algoritmo utilizado.
 */
package redneuronal1;

/**
 *
 * @author FERNANDO PADILLA 
 */
import java.util.Scanner;
public class RedNeuronal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);
        System.out.println("1- Ingrese nombre de su paper:");
        String item1=objeto.nextLine();
        
        System.out.println("2- ¿Qué es una red neuronal?");
        String item2=objeto.next();
        
        System.out.println("3- Cuáles son los elementos que conforman una red neuronal.");
        String item3=objeto.next();
        
        System.out.println("4- Cómo utilizaron la redneuronal en el proyecto que usted ha selecionado.");
        String item4=objeto.next();
        
        System.out.println("5- Cómo utilizaria usted la red neuronal como mejoramineto al proyecto propuesto.");
        String item5=objeto.next();
        
        System.out.println("6- En qué cosistio el entrenamineto utilizando la red neuronal, e idique"
                + "el algoritmo utilizado.");
        String item6=objeto.next();
        
    }
    
}
