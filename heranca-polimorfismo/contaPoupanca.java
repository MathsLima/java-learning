package arrays.heranca;

public class contaPoupanca extends conta {

    private double taxaJuros;

    public contaPoupanca() {
        super();
    }

    public contaPoupanca(Integer numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuro() {
        return taxaJuros;
    }

    public void setTaxaJuro(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void atualizaSaldo() {
        saldo += saldo * taxaJuros;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

}
