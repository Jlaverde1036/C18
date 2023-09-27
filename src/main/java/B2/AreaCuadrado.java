package B2;

import java.util.Scanner;

public class AreaCuadrado {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de un lado del cuadrado");
        float lado = scanner.nextFloat();

        CalcularArea(lado);
    }

    private static void CalcularArea(float lado) {
        System.out.println("El area del cuadrado es:"+lado*lado);
    }
}
