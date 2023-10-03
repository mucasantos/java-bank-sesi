package application;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta minhaConta = new Conta(1234, "Palhaço do Mal", 245, 3500, 1000, "10/10/1910");
		Conta contaAmigo = new Conta(1235, "Palhaço do Bem", 245, 6900, 2000, "10/10/1900");
		


		//Teste Transferir
		if (contaAmigo.transferePara(minhaConta, 210.00)) {
			System.out.println("Operação efetuada com sucesso!!");
		} else {
			System.out.println("Erro ao tranferir...Verifique o saldo...!!");
		}

		System.out.println("Saldo atual: " + minhaConta.getSaldo());

		// TODO: Adicionar mensagem caso o cliente não consiga sacar ou uma
		// mensagem de sucesso!

		//Teste sacar
		if (minhaConta.sacar(201.00)) {
			System.out.println("Operação efetuada com sucesso!!");
		} else {
			System.out.println("Erro...Verifique o saldo...!!");
		}

		System.out.println("Saldo depois de sacar: " + minhaConta.getSaldo());

		minhaConta.depositar(1234.12);

		System.out.println("Saldo depois de depositar: " + minhaConta.getSaldo());
		System.out.println(minhaConta.recuperaDadosParaImpressao());
		System.out.println(contaAmigo.recuperaDadosParaImpressao());

	}
}
