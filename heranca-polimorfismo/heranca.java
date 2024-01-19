package arrays.heranca;

import arrays.heranca.conta;
import arrays.heranca.contaPoupanca;

public class heranca {
    public static void main(String[] args) {
        conta contaNova = new conta(1000, "Matheus", 0.0);
        contaPoupanca novaContaPoupanca = new contaPoupanca(1001, "Maria", 0, 500);

        // upcasting - objeto da subclasse para a super classe
        conta contaNova2 = novaContaPoupanca; // atribui a contaPoupanca na classe conta
        conta contaNova3 = new contaEmpresarial(1002, "Jose", 0, 200); // atribui o banco na classe conta
        conta contaNova4 = new contaPoupanca(1003, "Maria", 0, 0.01); // atribui uma nova contaPoupanca na classe conta

        // downcasting - objeto da super classe para as subclasses
        contaEmpresarial novaConta5 = (contaEmpresarial) contaNova3;

    }
}
