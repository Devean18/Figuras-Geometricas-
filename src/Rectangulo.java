import java.util.Scanner;

public class Rectangulo {

    
	
	public static void main(String[] args) {
        Scanner KeyBoard = new Scanner(System.in);// Se manda a llamar la funcion Scanner para la entrada de teclado

        
        System.out.print("Ingrese el Alto del rectángulo: ");// Solicita al usuario que ingrese el alto (weight) del rectángulo
        int height = KeyBoard.nextInt();// Se lee el valor de altura ingresado por el usuario
        System.out.println();//Salto de linea
        

        System.out.print("Ingrese el Ancho del rectángulo: ");// Solicita al usuario que ingrese el ancho (widht) del rectángulo
        int width = KeyBoard.nextInt();
        System.out.println();

        
        for (int i = 1; i < height; i++) {
            for (int j = 1; j < width; j++) {
                System.out.print("* "); // Se Imprime asterisco seguido de espacio
            }
            
            System.out.println(); // Cambio de línea después de imprimir una fila
        }

        KeyBoard.close(); // Cierre de scanner
    }
}
