package arrays.heranca;

public class contaEmpresarial extends conta {
    private double limite;

    // constutor com argumentos
    public contaEmpresarial(Integer numero, String titular, double saldo, double limite) {
        super(numero, titular, saldo); // chama o construtor da classe conta com o super
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void emprestimo(double valorEmprestimo) {
        if (valorEmprestimo <= limite) {
            saldo += valorEmprestimo - 10.0; // 10 e a taxa
        }
    }
}