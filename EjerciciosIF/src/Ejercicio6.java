import java.util.Scanner;

public class Ejercicio6 {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce primer número");
        double numero= scanner.nextInt();
        System.out.println("Introduce segundo número");
        double numero1= scanner.nextInt();
        System.out.println("Introduce tercer número");
        double numero2= scanner.nextInt();

        double resto=1/numero;
        double resto1=1/numero1;
        double resto2=1/numero2;

        if ((numero<= 100 && numero>= -100) && (numero1<=100 && numero1>=-100)&&(numero2<=100 && numero2>=-100)){

            double resultado= resto1+resto+resto2;
            System.out.println("el resultado es "+resultado);


        }else System.out.println("Alguno de los números no está entre -100 y 100");

    }

}
