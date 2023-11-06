import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        /*Ejercicio 4. Hágase un programa que convierta segundos en horas, minutos y segundos.
        *Número de segundos: 24973
        *Horas: 6
        *Minutos: 56
        *Segundos: 13
         */
        // 3600 segundos en 1 hora
        //60 minutos en 1 hora
        //60 segundos en 1 minuto

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce segundos ");
        int segundos= scanner.nextInt(); //Los segundos que se quieran convertir

        System.out.println("Las horas son "+segundos/3600);

        int resto= segundos%3600; //resto horas

        int resto1=resto/60; // minutos

        System.out.println("Los minutos son " + resto1);

        System.out.println("Los segundos son "+resto);

    }
}
