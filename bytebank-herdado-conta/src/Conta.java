public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas é "+total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma conta "+this.numero);
	}
	
	public Conta() {
		
	}
	
	public void deposita(double valor){
		if (valor > 0){
			this.saldo += valor;
		}
	}
	
	public boolean saca (double valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere (double valor, Conta contaDestino) {
		
		if (this.saca(valor)) {
			contaDestino.deposita(valor);
			return true;
		}
		
		return false;
		
	}
	
	//Esconde o atributo saldo
	public double getSaldo(){
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero){
		if (numero <= 0) {
			System.out.println("Número inválido");
			return;
		}
		this.numero = numero;
	
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Angência inválido");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

}
