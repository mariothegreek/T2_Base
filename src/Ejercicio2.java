import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Declaramos Scanner para poder escribir por teclado.
        System.out.println("Introduce numero 1");
        int numero1= scanner.nextInt(); //Aquí es donde se pondrá el valor en consola por el teclado.
        System.out.println("Introduce numero 2");
        int numero2 = scanner.nextInt();
        System.out.println("Introduce numero 3");
        int numero3 = scanner.nextInt();
        System.out.println("Introduce numero 4");
        int numero4 = scanner.nextInt();
        System.out.println("Introduce numero 5");
        int numero5 = scanner.nextInt();


        System.out.println(numero1+" "+numero2+" "+numero3+" "+numero4+" "+numero5);
        //1 2 3 4 5


        int aux=numero1; // Creamos y asignamos a aux el valor de numero1.

        numero1=numero2;
        numero2=numero3;
        numero3=numero4;
        numero4=numero5;
        numero5=aux;

        System.out.println(numero1+" "+numero2+" "+numero3+" "+numero4+" "+numero5);
        //2 3 4 5 1 Rotamos numeros hacia la izquierda

        int aux1=numero5; //No deja definir la misma variable para aux, pongo aux1

        numero5=numero4;
        numero4=numero3;
        numero3=numero2;
        numero2=numero1;
        numero1=aux1;

        System.out.println(numero1+" "+numero2+" "+numero3+" "+numero4+" "+numero5);
        //1 2 3 4 5 vuelta al orden de origen
    }
}
