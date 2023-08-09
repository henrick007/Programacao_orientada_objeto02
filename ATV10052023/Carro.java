package ATV10052023;

import javax.swing.JOptionPane;

public class Carro {

    private int qntDeAssentos;

    public void solicitarQntAssentos() {
        this.setQntDeAssentos(
                Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de assentos do carro:")));
    }

    public int getQntDeAssentos() {
        return this.qntDeAssentos;
    }

    public void setQntDeAssentos(int qntDeAssentos) {
        this.qntDeAssentos = qntDeAssentos;
    }
}
