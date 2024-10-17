package buscas;

public class BuscaSequencialExaustiva {
    public static int[] buscar(int[] valores, int valorParaProcurar) {
        int[] ocorrencias = new int[valores.length];

        int contadorDeOcorrencias = 0;

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == valorParaProcurar) {
                ocorrencias[contadorDeOcorrencias] = i;
                contadorDeOcorrencias++;
            }
        }

        int[] ocorrenciasLimpas = new int[contadorDeOcorrencias];

        for (int i = 0; i < contadorDeOcorrencias; i++) {
            ocorrenciasLimpas[i] = ocorrencias[i];
        }

        return ocorrenciasLimpas;
    }
}
