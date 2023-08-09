package ATV17052023;

import javax.swing.JOptionPane;

public class Associados {

    private int ID;
    private String nome;
    private String logradouro;
    private int numero;
    private int cep;
    private String bairro;
    private String cidade;
    private String uf;
    private int telefone;
    private int cpf_cnpj;
    private String situacao;
    private int num_associado;

public void solicitarDados(){
	this.setID(interger.parseInt(JOptionPane.showInputDialog(“Informe o ID do associado: “)));
this.setnome(JOptionPane.showInputDialog(“Informe o Nome do Associado: “));
this.setlogradouro(JOptionPane.showInputDialog(“Informe o Logradouro do Associado: “));
this.setnumero(interger.parseInt(JOptionPane.showInputDialog(“Informe o Número do Associado: “)));
this.setcep(interger.parseInt(JOptionPane.showInputDialog(“Informe o CEP do Associado: “)));
this.setbairro(JOptionPane.showInputDialog(“Informe o Bairro do Associado: “));
this.setcidade(JOptionPane.showInputDialog(“Informe a Cidade do Associado: “));
this.setuf(JOptionPane.showInputDialog(“Informe a UF do Associado: “));
this.settelefone(interger.parseInt(JOptionPane.showInputDialog(“Informe o Telefone do Associado: “)));
this.setcpf_cnpj(interger.parseInt(JOptionPane.showInputDialog(“Informe o CPF/CNPJ do Associado: “)));
this.setsituacao(JOptionPane.showInputDialog(“Informe a Situação do Associado: “));
this.setnum_associado(interger.parseInt(JOptionPane.showInputDialog(“Informe o Número de Associados: “)));
}

    Public

    int getID(){
	Return this.ID;
}Public

    void setID(int ID) {
        This.ID = ID;
    }

Public String

    nome(){
	Return this.nome;
}Public

    void setnome(String nome) {
        This.nome = nome;
    }

Public String

    getlogradouro(){
	Return this.logradouro;
}Public

    void setlogradouro(String logradouro) {
        This.logradouro = logradouro;
    }Public

    int getnumero(){
	Return this.numero;
}Public

    void setnumero(int numero) {
        This.numero = numero;
    }Public

    int getcep(){
	Return this.cep;
}Public

    void setID(int cep) {
        This.cep = cep;
    }

Public String

    getbairro(){
	Return this.bairro;
}Public

    void setbairro(String bairro) {
        This.bairro = bairro;
    }

Public String

    getcidade(){
	Return this.cidade;
}Public

    void setcidade(String cidade) {
        This.cidade = cidade;
    }

Public String

    getuf(){
	Return this.uf;
}Public

    void setuf(String uf) {
        This.uf = uf;
    }Public

    int gettelefone(){
	Return this.telefone;
}Public

    void settelefone(int telefone) {
        This.telefone = telefone;
    }Public

    int getcpf_cnpj(){
	Return this.cpf_cnpj;
}Public

    void setcpf_cnpj(int cpf_cnpj) {
        This.cpf_cnpj = cpf_cnpj;
    }

Public String

    getsituacao(){
	Return this.situacao;
}Public

    void setsituacao(String situacao) {
        This.situacao = situacao;
    }Public

    int getnum_associado (){
	Return this.num_associado;
}Public

    void setnum_associado(int num_associado) {
        This.num_associado = num_associado;
    }
}
