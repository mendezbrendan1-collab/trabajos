import java.util.Scanner;


public class num_mayor {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;

        System.out.println("Ingresa el primer número:");
        num1 = leer.nextInt();

        System.out.println("Ingresa el segundo número:");
        num2 = leer.nextInt();

        System.out.println("El numero mayor es: "+(num1>num2?num1:num2));

        leer.close();
    }
}
