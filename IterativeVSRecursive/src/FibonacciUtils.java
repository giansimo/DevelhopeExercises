import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciUtils {

    public static int fibonacciIterative(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int fib0 = 0;
        int fib1 = 1;
        int fibonacci = 1;

        for (int i = 2; i <= n; i++) {
            fibonacci = fib0 + fib1;
            fib0 = fib1;
            fib1 = fibonacci;
        }

        return fibonacci;
    }

    // Assolutamente inefficiente ma OK per stampare/ricreare la sequenza di Fibonacci
    public static List<Integer> fibonacciSeqIterative(int n){
        ArrayList<Integer> fibonacciSeq = new ArrayList<>();
        for (int i = 0; i < n; i++){
            fibonacciSeq.add(fibonacciIterative(i));
        }
        return fibonacciSeq;
    }

    public static int fibonacciRecursive(int n){
        if (n == 0) {
            return 0;
        }
        else if ( n == 1){
            return 1;
        }
        else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }


    // Assolutamente inefficiente (anche peggio del precedente) ma OK
    // per stampare/ricreare la sequenza di Fibonacci
    public static List<Integer> fibonacciSeqRecursive(int n){
        ArrayList<Integer> fibonacciSeq = new ArrayList<>();
        for (int i = 0; i < n; i++){
            fibonacciSeq.add(fibonacciRecursive(i));
        }
        return fibonacciSeq;
    }
}
