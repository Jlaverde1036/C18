package B2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class trabajo4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        try (PrintWriter writer = new PrintWriter(new FileWriter("log.txt"))) {
            do{
                System.out.println("ingresa el primero numero");
                num1=scanner.nextInt();
                System.out.println("ingresa el segundo numero");
                num2=scanner.nextInt();

                int producto = 0;
                int iteraciones=0;

                try{
                    while (producto <= 100){
                        producto = num1*num2;
                        writer.println("multiplicacion:"+ num1 +"*"+ num2+"="+producto);
                        num1++;

                    }
                    writer.println("numero de iteraciones:"+iteraciones);
                } catch (Exception e){
                    writer.println("Error:"+e.getMessage());
                }
                System.out.println("el resultado es mayor que 100");

               System.out.println("¿quieres ingresar nuevos numeros? (S/N):");


            } while (scanner.next().equalsIgnoreCase("S"));
        } catch (IOException e){
            System.err.println("error al escribir en el archivo registro:"+ e.getMessage());
        } catch (InputMismatchException e){
            System.err.println("Error: debes ingresar un numero valido");
        } finally {
            scanner.close();
        }
    }
}
