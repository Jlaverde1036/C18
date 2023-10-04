package B2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;
public class Ejercicio5 {
    public static void main(String[] args)
    {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        List<Integer> numerosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Números pares: " + numerosPares);

        List<Integer> numerosDuplicados = numeros.stream()
                .map(numero -> numero * 2)
                .collect(Collectors.toList());


        System.out.println("Números duplicados: " + numerosDuplicados);



        int suma = numeros.stream()
                .map(numero -> numero * 2)
                .mapToInt(Integer::intValue)
                .sum();


        System.out.println("Suma de números duplicados: " + suma);


        Optional<Integer> maxNumero = numerosDuplicados.stream()
                .max(Integer::compareTo);


        if (maxNumero.isPresent()) {
            System.out.println("Número más grande: " + maxNumero.get());
        } else {
            System.out.println("La lista está vacía.");
        }

    }

}


