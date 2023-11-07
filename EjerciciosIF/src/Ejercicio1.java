import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce primer digito");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce segundo digito");
        int numero2 = scanner.nextInt();

        if(numero1>numero2){
            System.out.println("El primero es mayor que el segundo");
        }else{System.out.println("El primero mo es mayor que el segundo");}
        }
    }
