
public class TesteContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta (1234, 9876543);
		
		conta.deposita(200);
		
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(570);
		
		System.out.println(conta.getAgencia());
		
		System.out.println("O total de contas é: "+Conta.getTotal());
		
		
	}

}
