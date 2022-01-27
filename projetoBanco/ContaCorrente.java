package projetoBanco;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	public void pagamento (double valorBoleto, double taxa) {
		this.saldo -= (valorBoleto + taxa);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("---------------------------");
		System.out.println("Extrato da Conta Corrente: ");
		imprimirInfoComuns();
	}
}
