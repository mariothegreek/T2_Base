import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce numero");
    int numero= scanner.nextInt();
        if (numero % 20 == 0 && numero <= 99 && numero >= -99) {
            System.out.println("Es multiplo de 20 y está entre -100 y 100");

        }else if ((numero%20==0) && (numero>100 || numero<-100)){
            System.out.println("Es multiplo de 20 y no está entre -100 y 100");

        }else if (numero%20!=0 && numero< 100 && numero> -100){
            System.out.println("No es multiplo de 20 pero esta entre -100 y 100");

        }else System.out.println("No es multiplo de 20 y no esta entre 100 y -100");

    }
}

