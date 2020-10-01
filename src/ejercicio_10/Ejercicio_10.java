package ejercicio_10;

import java.util.Scanner;

/**
 * 10. Pedir al usuario que introduzca un número entre el 1 y el 7 y mostrar por
 * pantalla si se trata de un día laborable o no laborable.
 *
 */
public class Ejercicio_10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia;

        System.out.print("Introduzca un día de la semana: ");
        dia = teclado.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Lunes es un día laboral.");
                break;
            case 2:
                System.out.println("Martes es un día laboral.");
                break;
            case 3:
                System.out.println("Miércoles es un día laboral.");
                break;
            case 4:
                System.out.println("Jueves es un día laboral.");
                break;
            case 5:
                System.out.println("Viernes es un día laboral.");
                break;
            case 6:
                System.out.println("Sábado es un día laboral.");
                break;
            case 7:
                System.out.println("Domingo es un día laboral.");
                break;
            default:
                System.out.println("Este dia no existe.");
                break;

        }

    }

}
