import java.util.Scanner;



    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String Nomproducto;
        double precio, preciotot;

        System.out.println("Ingresa el nombre del producto");
        Nomproducto = leer.nextLine();
        System.out.println("Ingresa el precio del producto");
        precio = leer.nextDouble();
        preciotot = precio * 1.16; 
        System.out.println("El precio total del producto " + Nomproducto + " con IVA es: " + preciotot);

        leer.close();
    }
