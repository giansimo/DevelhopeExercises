import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("Calcolo iterativo");
        System.out.println(FactorialUtils.factorialIterative(5));


        System.out.println("Calcolo ricorsivo");
        System.out.println(FactorialUtils.factorialRecursive(5));

        System.out.println("Fibonacci iterativo");
        System.out.println(FibonacciUtils.fibonacciIterative(15));


        System.out.println("Fibonacci ricorsivo");
        System.out.println(FibonacciUtils.fibonacciRecursive(5));

        System.out.println("Fibonacci sequenza iterativa");
        System.out.println(FibonacciUtils.fibonacciSeqIterative(45));


        System.out.println("Fibonacci sequenza ricorsiva");
        System.out.println(FibonacciUtils.fibonacciSeqRecursive(45));

        int dimArray = 1000000;
        int numIteration = 10000;
        int[] array = new int[dimArray];
        Random rand = new Random();

        // Popola l'array con numeri casuali
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(dimArray);  // Genera numeri casuali tra 0 e 999999
        }

        // Ordina l'array
        Arrays.sort(array);

        List<Integer> arrayList = Arrays.stream(array).boxed().collect(Collectors.toList());


        Long timeMsInBSIterative = System.currentTimeMillis();

        for (int i = 0; i < numIteration; i++){
            int currentRandomTarget = rand.nextInt(dimArray);   // numero casuale (potrebbe non essere presente nella lista)
            currentRandomTarget = arrayList.get(rand.nextInt(arrayList.size())); // Sceglie un target casuale dall'ArrayList

            int idx = BinarySearchUtils.binarySearchIterative(array, currentRandomTarget);
            System.out.println("Target trovato alla posizione: " + idx);
        }
        Long timeMsOutBSIterative = System.currentTimeMillis();

        Long timeMsInBSRecursive = System.currentTimeMillis();
        for (int i = 0; i < numIteration; i++){
            int currentRandomTarget = rand.nextInt(dimArray);   // numero casuale (potrebbe non essere presente nella lista)
            currentRandomTarget = arrayList.get(rand.nextInt(arrayList.size())); // Sceglie un target casuale dall'ArrayList

            int idx = BinarySearchUtils.binarySearchRecursive(array, 0, dimArray, currentRandomTarget);
            System.out.println("Iterazione num: {0} Target trovato alla posizione: {1}"
                    .replace("{0}", String.valueOf(i))
                    .replace("{1}", String.valueOf(idx)));
        }
        Long timeMsOutBSRecursive = System.currentTimeMillis();



        Long timeMsInLinearSearch = System.currentTimeMillis();
        for (int i = 0; i < numIteration; i++){
            int currentRandomTarget = rand.nextInt(dimArray);   // numero casuale (potrebbe non essere presente nella lista)
            currentRandomTarget = arrayList.get(rand.nextInt(arrayList.size())); // Sceglie un target casuale dall'ArrayList

            int idx = arrayList.indexOf(currentRandomTarget);
            System.out.println("Iterazione num: {0} Target trovato alla posizione: {1}"
                    .replace("{0}", String.valueOf(i))
                    .replace("{1}", String.valueOf(idx)));

            /*  Implementazione manuale di ciò che viene fatto con l'indexOf
            for (int j = 0; j < arrayList.size(); j++){
                if (currentRandomTarget == arrayList.get(j)){

                    System.out.println("Iterazione num: {0} Target trovato alla posizione: {1}"
                            .replace("{0}", String.valueOf(i))
                            .replace("{1}", String.valueOf(j)));
                    break;
                }
            }
             */

        }
        Long timeMsOutLinearSearch = System.currentTimeMillis();

        // BS Iterative
        System.out.print("Ricerca binaria iterativa effettuata su " + numIteration);
        System.out.println(" iterazioni completata in " + (timeMsOutBSIterative - timeMsInBSIterative) + " ms");

        // BS Recursive
        System.out.print("Ricerca binaria ricorsiva effettuata su " + numIteration);
        System.out.println(" iterazioni completata in " + (timeMsOutBSRecursive - timeMsInBSRecursive) + " ms");

        // Linear Search
        System.out.print("Ricerca lineare iterativa effettuata su " + numIteration);
        System.out.println(" iterazioni completata in " + (timeMsOutLinearSearch - timeMsInLinearSearch) + " ms");
    }
}