package arrays.heranca;

public class conta {
    private Integer numero;
    private String titular;
    protected double saldo; // protected pois vai ser utilizado na classe banco

    public conta(Integer numero, String titular, double saldo) {
        super();
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public conta() {
    }

    public Integer getNumer() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saque(double total) {
        saldo -= total;
    }

    public void deposito(double total) {
        saldo += total;
    }

    public double getSaldo() {
        return saldo;
    }
}
