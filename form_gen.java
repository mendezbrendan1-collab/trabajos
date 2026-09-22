import java.util.Scanner;

public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);
    double num1,num2,num3,resultado;
    System.out.println("Ingresa los numeros para la formula general");
    System.out.println("Ingresa el primer número");
    num1 = leer.nextDouble();
    System.out.println("Ingresa el segundo número");
    num2 = leer.nextDouble();
    System.out.println("Ingresa el tercer número");
    num3 = leer.nextDouble();
    
    if (num1 == 0) {
        System.out.println("El primer número no puede ser cero.");
        return;
    }

    double x1=(-num2 + Math.sqrt(Math.pow(num2, 2) - 4 * num1 * num3)) / (2 * num1);
    double x2=(-num2 - Math.sqrt(Math.pow(num2, 2) - 4 * num1 * num3)) / (2 * num1);

    System.out.println("El resultado de x1 es: " + x1);
    System.out.println("El resultado de x2 es: " + x2);
    leer.close();
    }