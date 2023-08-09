package ATVconta;

public class Conta_corrente extends Conta {

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void usarChequeEspecial(double valor) {

        if (valor > c.get) {
            System.out.println("Não é possível realizar esta operação.");
        } else {
            debito(valor);
        }
    }
}
