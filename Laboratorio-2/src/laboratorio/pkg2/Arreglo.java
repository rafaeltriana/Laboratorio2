package laboratorio.pkg2;

import java.util.Scanner;

public class Arreglo {

    int media;
    int varianza;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros;
        System.out.print("Porfavor Ingrese el tamaño del arreglo: ");
        numeros = teclado.nextInt();
        int[] array = new int[numeros];
        for (int x = 0; x < array.length; x++) {
            array[x] = (int) (Math.random() * 20) + 1;
            System.out.println(array[x]);

        }
        Operaciones m = new Operaciones();
        while(true){
            
                System.out.println("Seleccione la opción que desee");
                System.out.println("1 - Ordenar");
                System.out.println("2 - Media ");
                System.out.println("3 - Varianza");
                System.out.println("3 - Desviacion Estandar");
                

                String opcion = teclado.nextLine();
               
                float resultado;
                switch (opcion)
                {
                    case "1":
                         

                         
                        break;
                    case "2":
                        System.out.println(m.media);
                         
                        break;
                    case "3":
                        
                        break;
                    
                    default:
                        System.out.println("La opción seleccionada no es correcta");
                }
       
        }
    }
 }
  
