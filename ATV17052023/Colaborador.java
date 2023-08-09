package ATV17052023;

import javax.swing.JOptionPane;

public class Colaborador {

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
    private String cargo;

public void solicitarDados(){
	this.setID(interger.parseInt(JOptionPane.showInputDialog(“Informe o ID do Colaborador: “)));
this.setnome(JOptionPane.showInputDialog(“Informe o Nome do Colaborador: “));
this.setlogradouro (JOptionPane.showInputDialog(“Informe o Logradouro do Colaborador: “));
this.setnumero(interger.parseInt(JOptionPane.showInputDialog(“Informe o Número do Colaborador: “)));
this.setcep(interger.parseInt(JOptionPane.showInputDialog(“Informe o CEP do Colaborador: “)));
this.setbairro (JOptionPane.showInputDialog(“Informe o Bairro do Colaborador: “));
this.setcidade (JOptionPane.showInputDialog(“Informe a Cidade do Colaborador: “));
this.setuf (JOptionPane.showInputDialog(“Informe a UF do Colaborador: “));
this.settelefone(interger.parseInt(JOptionPane.showInputDialog(“Informe o Telefone do Colaborador: “)));
this.setcpf_cnpj(interger.parseInt(JOptionPane.showInputDialog(“Informe o CPF/CNPJ do Colaborador: “)));
this.setcargo (JOptionPane.showInputDialog(“Informe o cargo do Colaborador: “));
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

    void setID(int telefone) {
        This.telefone = telefone;
    }Public

    int getcpf_cnpj(){
	Return this.cpf_cnpj;
}Public

    void setID(int cpf_cnpj) {
        This.cpf_cnpj = cpf_cnpj;
    }

Public String

    getcargo(){
	Return this.cargo;
}Public

    void setcargo(String cargo) {
        This.cargo = cargo;
    }
}
