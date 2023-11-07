import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el año");
        int numero= scanner.nextInt();

        if (numero%4==0){
            System.out.println("Es un año bisiesto");
        }else System.out.println("No es un año bisiesto");
    }
}
