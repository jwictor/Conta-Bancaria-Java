package ContaBancaria;

public class Caixa {


	
	 int numeroConta;
	private double saldo;
	 int cpf;
	
	
	
	
	//Metodo construtor
	
	public void ContaBancaria(int numeroConta) {
		this.setNumeroConta(numeroConta); 
	}
	public void ContaBancaria(double saldo) {
		this.saldo= saldo; 
	}
	public void ContaBancaria1(int cpf) {
		this.cpf= cpf; 
	}	
	
	public void numeroConta(int numeroConta) {
	   int digitos = 123;
	   System.out.print("O numero da sua conta e:"+ digitos);
		
	}
	public void cpf(double cpf) {
		int numero= 123355;
		System.out.print("CPF" + numero);
		
	}
	
	
	//Metodo de positar
	
	public void depositar(double valorDeposito) {
		double deposito = 500;
		if(valorDeposito > 0) {
			deposito = this.getSaldo()+valorDeposito;
			this.setSaldo(deposito);
			System.out.print("seu depoito foi de:" + deposito);
		}else {
			System.out.println("este não e um valor valido");
		}
		
	}
	 //Metodo Sacar
	public void sacar(double valorSaque) {
		double saque = 20;
		if(valorSaque < this.getSaldo()) {
			saque = this.getSaldo() - valorSaque;
			this.setSaldo(saque);
			System.out.print("valor" + saque);
		}else {
			System.out.println("este não e um valor valido");
		}
		
	}
	
	
	
	
	
	//Metodos Get an Set
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldosaldo) {
		this.saldo = saldo;
	}
}
