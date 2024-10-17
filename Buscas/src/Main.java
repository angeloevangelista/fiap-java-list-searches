import buscas.*;
import buscas.binary.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valores = Utils.getList(10);
        //int[] valores = new int[] {30, 20, 50, 10, 15, 5, 12, 80};

        System.out.print("Lista: ");
        Utils.printValues(valores);

        System.out.print("Digite o valor para buscar: ");
        int valorParaProcurar = scanner.nextInt();

        // buscarUsandoBuscaSequencialExaustiva(valores, valorParaProcurar);
        // buscarUsandoBuscaSequencial(valores, valorParaProcurar);
        // buscarUsandoBuscaSequencialIndexada(valores, valorParaProcurar, scanner);
        // buscarUsandoBuscaBinaria(valores, valorParaProcurar);
        // buscarUsandoArvoreBinaria(valores, valorParaProcurar);

        scanner.close();
    }

    public static void buscarUsandoBuscaSequencialExaustiva(int[] valores, int valorParaProcurar) {
        int[] ocorrencias = BuscaSequencialExaustiva.buscar(valores, valorParaProcurar);

        System.out.print("Índices encontrados: ");
        Utils.printValues(ocorrencias);
    }

    public static void buscarUsandoBuscaSequencial(int[] valores, int valorParaProcurar) {
        int indiceEncontrado = BuscaSequencial.buscar(valores, valorParaProcurar);

        System.out.printf("Índice encontrado: %s\n", indiceEncontrado);
    }

    public static void buscarUsandoBuscaSequencialIndexada(int[] valores, int valorParaProcurar, Scanner scanner) {
        int[] listaOrdenada = Utils.sort(valores);

        System.out.print("Lista ordenada: ");
        Utils.printValues(listaOrdenada);

        System.out.print("Digite o tamanho do bloco: ");
        int tamanhoBloco = scanner.nextInt();

        int indiceEncontrado = BuscaSequencialIndexada.buscar(valores, valorParaProcurar, tamanhoBloco);

        System.out.printf("Índice encontrado: %s\n", indiceEncontrado);
    }

    public static void buscarUsandoBuscaBinaria(int[] valores, int valorParaProcurar) {
        int[] listaOrdenada = Utils.sort(valores);

        System.out.print("Lista ordenada: ");
        Utils.printValues(listaOrdenada);

        int indiceEncontrado = BuscaBinaria.buscar(valores, valorParaProcurar);

        System.out.printf("Índice encontrado: %s\n", indiceEncontrado);
    }

    public static void buscarUsandoArvoreBinaria(int[] valores, int valorParaProcurar) {
        BinaryTree arvore = new BinaryTree();

        for (int valor : valores) {
            arvore.insert(valor);
        }

        System.out.print("Arvore: ");
        System.out.println(arvore);

        Node nodeEncontrado = BuscaEmArvoreBinaria.buscar(arvore.root, valorParaProcurar);

        if (nodeEncontrado == null) {
            System.out.println("Node não encontrado");
            return;
        }

        System.out.printf("Node encontrado: %s\n", nodeEncontrado);
        System.out.printf("Valor à esquerda: %s\n", nodeEncontrado.left != null ? nodeEncontrado.left.value : "NULL");
        System.out.printf("Valor à direita: %s\n", nodeEncontrado.right != null ? nodeEncontrado.right.value : "NULL");
    }
}