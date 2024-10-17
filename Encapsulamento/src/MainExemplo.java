import utils.ProgressaoGeometrica;

public class MainExemplo {
    public static void main(String[] args) {
        ProgressaoGeometrica pg = new ProgressaoGeometrica(2);

        for (int i = 0; i < 4; i++) {
            System.out.println(pg.pegarProximoValor());
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(pg.pegarProximoValor());
        }

        pg.setValorIncremental(6);

        for (int i = 0; i < 4; i++) {
            System.out.println(pg.pegarProximoValor());
        }


        // ContaBancaria
        //  - numero
        //  - saldo
        //
        //  - sacar()
        //  - depositar()
    }
}