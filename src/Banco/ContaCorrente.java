package Banco;
public class ContaCorrente  extends Conta {

    public ContaCorrente(Cliente cliente){
       super(cliente);
    }

    public void mostrarSaldo(){
        System.out.println("\nExtrato Conta Corrente");
        super.informarComuns();
    }

}
