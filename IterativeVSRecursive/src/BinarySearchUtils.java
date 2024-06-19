public class BinarySearchUtils {

    // [0, 3, 5, 7, 10, 15, 20, 35]
    // 4
    public static int binarySearchIterative(int[] array, int target) {
        int inizio = 0;
        int fine = array.length - 1;

        while (inizio <= fine) {
            int medio = inizio + (fine - inizio) / 2;

            // Controlla se il target è presente a metà
            if (array[medio] == target) {
                return medio;
            }

            // Se il target è maggiore, ignora la metà sinistra
            if (array[medio] < target) {
                inizio = medio + 1;
            } else { // Se il target è minore, ignora la metà destra
                fine = medio - 1;
            }
        }

        // Se l'elemento non è presente nell'array
        return -1;
    }

    public static int binarySearchRecursive(int[] array, int inizio, int fine, int target) {
        if (inizio <= fine) {
            int medio = inizio + (fine - inizio) / 2;

            // Controlla se il target è presente a metà
            if (array[medio] == target) {
                return medio;
            }

            // Se il target è maggiore, ignora la metà sinistra
            if (array[medio] < target) {
                return binarySearchRecursive(array, medio + 1, fine, target);
            } else { // Se il target è minore, ignora la metà destra
                return binarySearchRecursive(array, inizio, medio - 1, target);
            }
        }
        // Se l'elemento non è presente nell'array
        return -1;
    }
}
