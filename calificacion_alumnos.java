import java.util.Scanner;

public class calificacion_alumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        double suma = 0, promedio;

        int i;
        for (i = 1; i <= 5; i++) {
            System.out.println("Ingrese el nombre del alumno " + i + ":");
            String nombre = scanner.next();

            System.out.println("Ingrese la calificacion del alumno " + i + ":");
            int calificacion = sc.nextInt();

            suma += calificacion;
        }
        promedio = suma / 5;
        System.out.println("El promedio de las calificaciones es: " + promedio);
        sc.close();
        scanner.close();
    }
}