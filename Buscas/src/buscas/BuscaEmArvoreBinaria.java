package buscas;

import buscas.binary.*;

public class BuscaEmArvoreBinaria {
    public static Node buscar(Node node, int valorParaProcurar) {
        if (node == null || node.value == valorParaProcurar) {
            return node;
        }

        if (node.value < valorParaProcurar) {
            return buscar(node.right, valorParaProcurar);
        }

        return buscar(node.left, valorParaProcurar);
    }
}
