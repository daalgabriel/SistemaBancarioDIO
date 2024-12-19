package Banco;

public abstract class Conta implements IConta {

    //Variavéis estáticas e constantes para config padrão
    protected static int SEQUENCIAL = 1;
    protected static final int AGENCIA_PADRAO = 1;

    protected int numeroConta;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;

    public int getConta(){
        return numeroConta;
    }

    public Conta(Cliente cliente){
        this.cliente = cliente;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL ++;
    }
    
    //metódo depositar
    public double depositar(double valorDeposito) {
        if (valorDeposito > 0){
            saldo += valorDeposito;
            return valorDeposito;
            
        }
                return 0;
    }

    //metódo sacar
    public double sacar(double valorSaque) {
        if (valorSaque > 0 && saldo >= valorSaque) {
            saldo -= valorSaque;
            return valorSaque;
        } return 0;
    }

    //metódo transferir
    public double  transferir(double valorTransferir, Conta destinatirio){
        if (valorTransferir > 0 && saldo >= valorTransferir) {
            this.sacar(valorTransferir);
            destinatirio.depositar(valorTransferir);
            return valorTransferir;
 
        } 
            return 0;
    }

    protected void informarComuns(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
    


}
