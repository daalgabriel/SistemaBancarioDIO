package Banco;
public class ContaPoupanca extends Conta {


    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }


    public void mostrarSaldo(){
        System.out.println("\nExtrato Conta Poupança");
        super.informarComuns();
    }

}
