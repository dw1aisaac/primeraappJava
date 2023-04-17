package holaMundo;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A partir de aquí irá el código
		
		// declarar variables
		int numero1;
		int numero2,numero3;
		
		float numeroReal;
		double numeroReal2; // mayor precisión que float
		
		boolean esPrimo;    // valores lógicos
		
		esPrimo = true;
		numeroReal2 = 12.25;
		numero1 = 4;
		numero1 = numero1 + 5;
		numeroReal2 = Math.pow(3, 5);    // potencia 3 elevado a 5
		esPrimo = numero1 < 3;
		
		// comparar si dos valores son iguales con ==, distintos !=
		
		
		
		// Para "escribir" teclear syso + ctrl (izq) + espacio. Hace un println
		// Con print -> Sin salto de línea
		// Con println -> Con salto de línea 
		
		System.out.print("Hola Mundo");		
		System.out.println("Hola Mundo");
		
		// Pedimos numero por teclado y lo mostramos
		System.out.println("Introducir número: ");
		// Leer por teclado
		Scanner teclado = new Scanner(System.in);
		numero1 = teclado.nextInt();    // asignamos el valor introducido a una variable
		numero1 = numero1 + 1;
		System.out.println(numero1);
				

	}

}
