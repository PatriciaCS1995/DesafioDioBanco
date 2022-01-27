package projetoBanco;

public interface InterfaceConta {
	
	void sacar (double valorSaque); 
	
	void imprimirExtrato();

	void depositar(double valorTransferencia);
	
	void transferir(double valorTransferencia, InterfaceConta contaDestino);
 
}
