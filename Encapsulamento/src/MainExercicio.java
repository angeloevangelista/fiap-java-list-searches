import exercicio.*;

public class MainExercicio {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1234567, 500);

        System.out.printf("Saldo: %s\n", conta.getSaldo());

        conta.sacar(200);

        System.out.printf("Saldo: %s\n", conta.getSaldo());

        conta.depositar(100);

        System.out.printf("Saldo: %s\n", conta.getSaldo());

        conta.sacar(10).sacar(10).sacar(10).sacar(20);

        System.out.printf("Saldo: %s\n", conta.getSaldo());
    }
}
