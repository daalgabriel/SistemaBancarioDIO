package Banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome){
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {  
        this.nome = nome;
    }

    //método para adicionar uma conta ao banco
    public void adicionarConta(Conta conta) {
        contas.add(conta);

    }

    //método para listar todas as contas do banco
    public void listarContas(){
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
        } else {
            System.out.println("\n### CONTAS CADASTRADAS NO BANCO ###");
            for(Conta conta : contas){
                System.out.println(String.format("Conta: %d | Cliente: %s", conta.numeroConta, conta.cliente.getNome()));
            }
        }
    }
    

}
