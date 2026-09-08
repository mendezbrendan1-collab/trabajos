import java.util.*;

public class prueba3{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        double estat;
        System.out.println("Ingrese su nombre: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = leer.nextInt();
        System.out.println("Ingrese su estatura: ");
        estat = leer.nextDouble();

        System.out.println("Tu nombre es: " + nombre+ ", tu edad es: " + edad + ", y tu estatura es: " + estat);
        
    }
}
