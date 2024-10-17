package buscas;

public class BuscaSequencialIndexada {
    public static int buscar(int[] valores, int valorParaProcurar, int tamanhoDoBloco) {
        // tamanho lista 10
        // tamanho bloco 4

        // quantidade de indices = 10 / 4 => 3

        int quantidadeDeBlocos = (int)Math.ceil((double)valores.length / (double)tamanhoDoBloco);

        int[] listaDeIndices = new int[quantidadeDeBlocos];

        for (int i = 0; i < quantidadeDeBlocos; i++) {
            listaDeIndices[i] = valores[i * tamanhoDoBloco];
        }

        int indiceDoBlocoEscolhido = 0;

        for (int i = 0; i < quantidadeDeBlocos; i++) {
            if (listaDeIndices[i] > valorParaProcurar) {
                break;
            }

            indiceDoBlocoEscolhido = i;
        }

        int inicio = indiceDoBlocoEscolhido * tamanhoDoBloco;
        int fim = Math.min(inicio + tamanhoDoBloco, valores.length);

        for (int i = inicio; i < fim; i++) {
            if (valores[i] == valorParaProcurar) {
                return i;
            }
        }

        return -1;
    }
}
