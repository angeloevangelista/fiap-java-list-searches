package utils;

public class ProgressaoGeometrica {
    private int valorAtual;
    private int fatorIncremental;

    public ProgressaoGeometrica(int fatorIncremental) {
        this.valorAtual = 1;
        this.fatorIncremental = fatorIncremental;
    }

    public int pegarProximoValor() {
        this.valorAtual = this.valorAtual * this.fatorIncremental;

        return this.valorAtual;
    }

    public int getValorAtual() {
        return this.valorAtual;
    }

    public void setValorIncremental(int novoValor) {
        if (novoValor < this.fatorIncremental) {
            System.out.println("Voce deve usar um valor incremental maior do que o anterior caso dewseje atualiza-lo");
            return;
        }

        this.fatorIncremental = novoValor;
    }
}
