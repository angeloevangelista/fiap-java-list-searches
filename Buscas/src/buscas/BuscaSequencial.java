package buscas;

public class BuscaSequencial {
    public static int buscar(int[] valores, int valorParaProcurar) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == valorParaProcurar) {
                return i;
            }
        }

        return -1;
    }
}
