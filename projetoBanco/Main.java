package projetoBanco;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Patricia");
		cliente.setSobreNome("Carvalho");
		cliente.setIdade(26);
		
		Conta cc = new ContaCorrente(cliente);
		cc.depositar(500);
		
		Conta cp = new ContaPoupanca(cliente);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
