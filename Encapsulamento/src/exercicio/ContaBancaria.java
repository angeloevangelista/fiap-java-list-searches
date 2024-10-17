package exercicio;

public class ContaBancaria {
    private int numero;
    private double saldo;

    public ContaBancaria(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public ContaBancaria sacar(double quantidade) {
        if (quantidade < 0) {
            System.out.println("Voce nao pode sacar um valor negativo");
            return this;
        }

        if (this.saldo < quantidade) {
            System.out.println("Voce nao tem saldo suficiente");
            return this;
        }

        this.saldo = this.saldo - quantidade;

        return this;
    }

    public void depositar(double valorDoDeposito) {
        if (valorDoDeposito < 0) {
            System.out.println("Voce nao pode depositar um valor negativo");
            return;
        }

        this.saldo += valorDoDeposito;
    }
}
