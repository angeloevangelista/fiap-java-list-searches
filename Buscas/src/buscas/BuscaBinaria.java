package buscas;

public class BuscaBinaria {
    public static int buscar(int[] valores, int valorParaProcurar) {
        int low = 0;
        int high = valores.length;

        while (low <= high) {
            int middle = (low + high) / 2;

            if (valores[middle] == valorParaProcurar) {
                return middle;
            }

            if (valores[middle] < valorParaProcurar) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return -1;
    }
}
