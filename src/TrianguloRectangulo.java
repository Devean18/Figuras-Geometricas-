import java.util.Scanner;

public class TrianguloRectangulo {

    
	
	public static void main(String[] args) {
        Scanner KeyBoard = new Scanner(System.in);// Se manda a llamar la funcion Scanner para la entrada de teclado
        
        
        System.out.print("Ingresa la Altura del triángulo: ");// Solicita al usuario que ingrese el alto (weight) del triangulo
        int height = KeyBoard.nextInt();// Se lee el valor de altura del triangulo ingresado por el usuario
        System.out.println();//Salto de linea
        
       
        for (int i = 1; i <= height; i++) { // Imprime el triángulo rectángulo
            for (int j = 1; j <= i; j++) { // Imprime asteriscos en cada fila del triángulo
                System.out.print(" *");
            }
            
            System.out.println(); // Cambiao de línea después de imprimir una fila
        }
        
        KeyBoard.close(); //Cierre del Scanner
    }
}