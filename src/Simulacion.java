import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;  // Calculadora para dos valores

public class Simulacion{

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce primer valor ");
        int numero1= scanner.nextInt();
        System.out.println("Introduce segundo valor ");
        int numero2= scanner.nextInt();

        System.out.println(numero1+numero2);
        System.out.println(numero1-numero2);
        System.out.println(numero1*numero2);
        System.out.println((double)numero1/numero2);
        System.out.println(numero1%numero2);

    }
}
