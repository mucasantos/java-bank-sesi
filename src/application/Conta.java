package application;

public class Conta {
	// Atributos da conta
	// mudando o modo de visualização

	int numero;
	String titular;
	int agencia;
	double saldo;
	double limite;
	String dataDeAbertura;
	
	boolean sacar(double quantidade) {		
		if (this.saldo < quantidade) {
			return false;
		} else {
			this.saldo -= quantidade;
			return true;
		}
	}
	
	void depositar(double quantidade) {
		this.saldo += quantidade;
	}
	boolean transferePara(Conta destino, double valor) {
		// Verifica se temos saldo disponível
		if (this.saldo > valor) {
			// Atualizar o saldo, fazendo o saque
			this.saldo -= valor;
			// Efetua a transferência
			destino.saldo += valor;
			return true;
		} else {
			return false;
		}
	}
}
