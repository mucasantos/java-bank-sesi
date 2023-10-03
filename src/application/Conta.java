package application;

public class Conta {
	// Atributos da conta
	// mudando o modo de visualização
	private int numero;
	private String titular;
	private int agencia;
	private double saldo;
	private double limite;
	private String dataDeAbertura;
	
	public Conta() {
		
	}
	
	public Conta(int numero, String titular, int agencia, double saldo, double limite, String dataDeAbertura) {
		this.numero = numero;
		this.titular = titular;
		this.agencia = agencia;
		this.saldo = saldo;
		this.limite = limite;
		this.dataDeAbertura = dataDeAbertura;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

	boolean sacar(double quantidade) {
		//Verificação se tem saldo suficiente 
		if (this.saldo < quantidade) {
			return false;
		} else {
			this.saldo -= quantidade; // o mesmo que this.saldo = this.saldo - quantidade
			return true;
		}
	}

	void depositar(double quantidade) {
		this.saldo += quantidade;// o mesmo que this.saldo = this.saldo + quantidade
	}

	// Retornar um valor (boolean)
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

	String recuperaDadosParaImpressao() {
		String dados = "\nTitular: " + this.titular;
		dados += "\nAbertura: " + this.dataDeAbertura;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nLimite: " + this.limite;
		return dados;
	}
}
