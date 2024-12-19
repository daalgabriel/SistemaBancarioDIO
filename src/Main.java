import Banco.Banco;
import Banco.Cliente;
import Banco.Conta;
import Banco.ContaCorrente;
import Banco.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        
        //Criar banco
        Banco xp = new Banco("XP");

        //Criar Cliente
        Cliente dal = new Cliente("Dal", "23555688944");

        //Criar contas
        Conta cc = new ContaCorrente(dal);
        Conta cp = new ContaPoupanca(dal);

        //Adicionar contas do banco
        xp.adicionarConta(cp);
        xp.adicionarConta(cc);

        //Listar contas do banco
        xp.listarContas();

        //Operações
        double valorDeposito = cc.depositar(250);
        if (valorDeposito > 0) {
            System.out.println(String.format("\nDEPÓSITO DE R$ %.2f NA CONTA %s REALIZADO COM SUCESSO", valorDeposito, cc.getConta()));
        }else{
            System.out.println("Valor inválido...");
        }

        double valorSaque = cc.sacar(50);
        if (valorSaque > 0) {
            System.out.println(String.format("\nSAQUE DE R$ %.2f NA CONTA %d REALIZADO COM SUCESSO", valorSaque, cc.getConta()));
        }else{
            System.out.println("Saldo insuficiente ou valor inválido.");
        }

        double valorTransferir = cc.transferir(25, cp);
        if (valorTransferir> 0) {
            System.out.println(String.format("\nTRANSFERENCIA DE R$ %.2f DA CONTA %d PARA A CONTA %d REALIZADO COM SUCESSO", valorTransferir, cc.getConta(), cp.getConta()));

        }else{
            System.out.println("Ocorreu uma falha na sua transferência..");
        }
        cc.mostrarSaldo();
        cp.mostrarSaldo();


    }
}
