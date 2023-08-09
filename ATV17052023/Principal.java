package ATV17052023;

import javax.swing.JOptionPane;

public class Principal {

    Public
    static void main(String[] args){
    associados associados = new associados();
	associados.solicitarDados();

	colaborador colaborador = new colaborador();
	colaborador.solicitarDados();

	fornecedores fornecedores = new fornecedores();
	fornecedores.solicitarDados();

	JOptionPane.showMessageDialog(null, “Dados do Associado: “ + associados.getassociado(), “associado”, JOptionPane.PLAIN_MESSAGE);
	JOptionPane.showMessageDialog(null, “Dados do Colaborador: “ + colaborador.getcolaborador(), “colaborador”, JOptionPane.PLAIN_MESSAGE);
	JOptionPane.showMessageDialog(null, “Dados do Fornecedor: “ + fornecedores.getfornecedores(), “fornecedores”, JOptionPane.PLAIN_MESSAGE);
}
}
