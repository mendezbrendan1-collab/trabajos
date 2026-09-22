import java.util.Scanner;

public class num_may_men_igual {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Ingresa el primer número:");
        num1 = leer.nextInt();
        System.out.println("Ingresa el segundo número:");
        num2 = leer.nextInt();
        System.out.println("Ingresa el tercer número:");
        num3 = leer.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("El numero mayor es: "+num1);
            System.out.println("El numero menor es: "+(num2<num3?num2:num3));
            System.out.println("El numero del medio es: "+(num2>num3?num2:num3));
        }
        else if(num2>num1 && num2>num3){
            System.out.println("El numero mayor es: "+num2);
            System.out.println("El numero menor es: "+(num1<num3?num1:num3));
            System.out.println("El numero del medio es: "+(num1>num3?num1:num3));
        }
        else if(num3>num1 && num3>num2){
            System.out.println("El numero mayor es: "+num3);
            System.out.println("El numero menor es: "+(num1<num2?num1:num2));
            System.out.println("El numero del medio es: "+(num1>num2?num1:num2));
        }
        else{
            System.out.println("Al menos dos números son iguales.");
        }

        leer.close();
    }
}
