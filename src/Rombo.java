import java.util.Scanner;

public class Rombo {

   
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Se manda a llamar la funcion Scanner para la entrada de teclado

        
        System.out.print("Ingresa la Altura del rombo: "); // Solicita al usuario que ingrese la altura(weight) del rombo
        int weight = scanner.nextInt();// Se lee el valor de altura del rombo ingresado por el usuario
        System.out.println();//Salto de linea

        
        for (int i = 0; i <= weight; i++) {  // Imprime la mitad superior del rombo
            for (int j = weight - i; j > 0; j--) {  // Imprime espacios en blanco antes de los asteriscos
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {  // Imprime asteriscos en cada fila de la mitad superior
                System.out.print(" *");
            }
            
            System.out.println(); // Cambio de línea después de imprimir cada fila
        }
        
        for (int i = 0; i <= weight; i++) { // Imprime la mitad inferior del rombo
            for (int j = 0; j <= i; j++) {  // Imprimir espacios en blanco antes de los asteriscos
                System.out.print(" ");
            }
            for (int k = weight - i - 1; k > 0; k--) {// Imprimir asteriscos en cada fila de la mitad inferior
                System.out.print(" *");
            }
            
            System.out.println();// Cambio de línea después de imprimir cada fila
        }

        scanner.close(); // Cierre el objeto Scanner
    }
}