import java.util.Scanner;

public class libreria {
    
    public static void main(String[] args) {
        float preciobase=100,preciofinal=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de paginas del libro: ");
        float paginas = scanner.nextFloat();


       if(paginas<=100){
        preciofinal=preciobase+paginas;
        System.out.println("El precio final del libro es: " + preciofinal);
       }
       else if(paginas>100 && paginas<=200){

        preciofinal=preciobase+100+(paginas*0.8f);


        System.out.println("El precio final del libro es: " + preciofinal);
       }else if(paginas>200){

        preciofinal=preciobase+100+80+(paginas*0.5f);

        System.out.println("El precio final del libro es: " + preciofinal);
    }

    }
}
