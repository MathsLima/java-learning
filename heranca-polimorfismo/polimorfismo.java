package arrays.heranca;

import arrays.heranca.conta;
import arrays.heranca.contaPoupanca;

public class polimorfismo {
    public static void main(String[] args) {

        conta x = new conta(1020, "Alex", 1000);
        conta y = new contaPoupanca(1023, "Maria", 1000, 0.01);

        x.saque(50);
        y.saque(50);

        System.out.println(x.getSaldo());
        System.out.println(y.getSaldo());
    }
}
