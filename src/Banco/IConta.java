package Banco;
public interface IConta {
    //metódo depositar
    double depositar(double valorDeposito);
 
    //metódo sacar
    double sacar(double valorSaque); 

    //metódo transferir
    double transferir(double valorTransferir, Conta destinatirio);

    //metódo mostrar saldo
    void mostrarSaldo();

}
