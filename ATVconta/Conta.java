package ATVconta;

public class Conta {

    private int numero;
    private double saldo;
    private double juros;

    public double getjuros() {
        return juros;

    }

    public int getnumero() {
        return numero;
    }

    public double getsaldo() {
        return saldo;
    }

    public void setjuros(double juros) {
        this.juros = juros;
    }

    public void setnumero(int numero) {
        this.numero = numero;
    }

    public void debito(double valor) {
        this.saldo -= valor;
    }

    public void credito(double valor) {
        this.saldo += valor;
    }
}
