import java.util.Scanner;

public class operaciones{

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingresa tu año de nacimiento");
        int naci = leer.nextInt();
        int edad = 2026 - naci;

        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu edad es: " + edad);

	}

}