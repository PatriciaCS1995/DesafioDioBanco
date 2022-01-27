package projetoBanco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("---------------------------");
		System.out.println("Extrato da Conta Poupança: ");
		imprimirInfoComuns();
	}

	@Override
	public void depositar(double valorTransferencia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(double valorTransferencia, InterfaceConta contaDestino) {
		// TODO Auto-generated method stub
		
	}

}
