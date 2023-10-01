package B2;

import java.util.Scanner;

public class Promedio {

    public static void main(String[] args){
        double notas[] = new double[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.println("ingrese su nota"+ (i+1)+":");
            notas[i] = sc.nextDouble();
        }
        double suma = 0;
        for (int i = 0; i < 5; i++){
            suma += notas[i];
        }
        double promedio = suma / 5;

        System.out.println("su promedio es:"+promedio);

        sc.close();
    }

}
