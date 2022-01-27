package projetoBanco;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Conta implements InterfaceConta {

	private static final int AGENCIA_PADRAO = 0001;

	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta (Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public Conta() {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}

	@Override
	public void sacar(double valorSaque) {
		this.saldo -= valorSaque;

	}
	
	@Override
	public void transferir(double valorTransferencia, InterfaceConta contaDestino) {
		contaDestino.depositar(valorTransferencia);
	}
	
	@Override
	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	} 
	
	protected void imprimirInfoComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Titular: %s", this.cliente.getSobreNome()));
		System.out.println(String.format("Titular: %d", this.cliente.getIdade()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("N�mero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

}
