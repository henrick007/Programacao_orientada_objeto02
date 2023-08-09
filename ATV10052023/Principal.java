package ATV10052023;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        veiculo.solicitarDados();

        Onibus onibus = new Onibus();
        onibus.solicitarDados();

        Carro carro = new Carro();
        carro.solicitarQntAssentos();

        JOptionPane.showMessageDialog(null, "Placa do veículo: " + veiculo.getPlaca(), "Veiculo",
                JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Ano do veículo: " + veiculo.getAno(), "Veiculo",
                JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Quantidade de assentos do onibus: " + onibus.getqntAssentos(), "Onibus",
                JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Quantidade de assentos do carro: " + carro.getQntDeAssentos(), "Carro",
                JOptionPane.PLAIN_MESSAGE);
    }
}
