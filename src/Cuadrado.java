import java.util.Scanner;

public class Cuadrado {
	
	
	
    public static void main(String[] args) {
        Scanner KeyBoard = new Scanner(System.in);// Se manda a llamar la funcion Scanner para la entrada de teclado
        
        
        System.out.print("Ingrese el número de lados del cuadrado: "); // Solicita al usuario que ingrese el numero de lados 
        int sides = KeyBoard.nextInt();// Se lee el valor de lados (sides) ingresado por el usuario
        System.out.println();//Salto de linea 
        

        for (int i = 1; i <= sides; i++) {
            for (int j = 1; j <= sides; j++) {
                System.out.print(" *"); // Se imprime un asterisco y un espacio en cada posición del cuadrado
            }
            
            System.out.println(); // Salto de línea después de imprimir cada fila del cuadrado
        }
        
        KeyBoard.close(); // Cierre de Scanner 
    } 
}
