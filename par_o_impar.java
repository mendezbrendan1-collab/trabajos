

public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int numero;

    System.out.println("Ingresa un número entero:");
    numero = leer.nextInt();

    if (numero % 2 == 0) {
        System.out.println("El número " + numero + " es par.");
    } else {
        System.out.println("El número " + numero + " es impar.");
    }

    leer.close();
}