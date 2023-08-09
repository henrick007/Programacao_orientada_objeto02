package ATV17052023;

import javax.swing.JOptionPane;

public class Fornecedores {

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
    private String nome_fantasia;
    private String wabsite;

public void solicitarDados(){
	this.setID(interger.parseInt(JOptionPane.showInputDialog(“Informe o ID do fornecedor: “)));
this.setnome (JOptionPane.showInputDialog(“Informe o Nome do fornecedor: “));
this.setlogradouro (JOptionPane.showInputDialog(“Informe o Logradouro do fornecedor: “));
this.setnumero(interger.parseInt(JOptionPane.showInputDialog(“Informe o Número do fornecedor: “)));
this.setcep(interger.parseInt(JOptionPane.showInputDialog(“Informe o CEP do fornecedor: “)));
this.setbairro (JOptionPane.showInputDialog(“Informe o Bairro do fornecedor: “));
this.setcidade (JOptionPane.showInputDialog(“Informe a Cidade do fornecedor: “));
this.setuf (JOptionPane.showInputDialog(“Informe a UF do fornecedor: “));
this.settelefone(interger.parseInt(JOptionPane.showInputDialog(“Informe o Telefone do fornecedor: “)));
this.setcpf_cnpj(interger.parseInt(JOptionPane.showInputDialog(“Informe o CPF/CNPJ do fornecedor: “)));
this.setnome_fantasia (JOptionPane.showInputDialog(“Informe o Nome Fantasia do fornecedor: “));
this.setwabsite (JOptionPane.showInputDialog(“Informe o Wabsite do fornecedor: “));
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

    getnome_fantasia (){
	Return this.nome_fantasia;
}Public

    void setnome_fantasia(String nome_fantasia) {
        This.nome_fantasia = nome_fantasia;
    }

Public String

    getwabsite (){
	Return this.wabsite;
}Public

    void setwabsite(String wabsite) {
        This.wabsite = wabsite;
    }
}
