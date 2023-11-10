import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce primer digito");
            int numero1 = scanner.nextInt();

            System.out.println("Introduce segundo digito");
            int numero2 = scanner.nextInt();

        System.out.println("Introduce tercer digito");
        int numero3 = scanner.nextInt();

        if(numero1 == numero2 + numero3){
            System.out.println("Numero 1 es la suma");
        } else if(numero2== numero1+numero3){
            System.out.println("Numero 2 es la suma");
        } else
        System.out.println("Numero 3 es la suma");

    }
}
