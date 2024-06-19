public class FactorialUtils {

    //n! = n * (n-1)* (n-2)* (n-3)* (n-4)* (n-i)*
    //n! = n * (n-1)! = n * (n-1) * (n-2)! ..... * 1
    //5! = 5 * (4)! = 5 * 4 * 3! = 5 * 4 * 3 * 2! = 5 * 4 * 3 * 2 * 1! = 5 * 4 * 3 * 2 * 1
    public static int factorialIterative(int n){
        int risultato = 1;
        for (int i = 1; i <= n; i++)
            risultato *= i;
        return risultato;
    }

    public static int factorialRecursive(int n){
            if (n == 0 || n == 1)
                return 1;
            else
                return n * factorialRecursive(n - 1);
        }
}
