import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        System.out.println("Introduce número");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();


        int millares = numero / 1000;
        int restante = numero % 1000; //221
        int centenas = restante / 100;
        restante = restante % 100; //21
        int decenas = restante / 10;
        int unidades = restante % 10; //1


        if (numero <= 9999) {
            if (unidades == millares) {
                if (decenas == centenas) {
                    System.out.println("Es capicua");
                } else {
                    System.out.println("No es capicua");
                }
            } else {
                System.out.println("No es capicua");
            }
        }else{
            System.out.println("El número no tiene 4 dígitos");

        }
    }
}
