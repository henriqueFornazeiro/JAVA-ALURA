
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		//POPULAR = "SETAR" OBJETOS
//		
//		cliente.nome="José";
//		cliente.cpf="2222222222";
//		cliente.profissao="programador";

		//COM GETTERS E SETTER (ENCAPSULAMENTO):
		
		cliente.setNome("Braufagelio");
		cliente.setCpf("12345678910");
		cliente.setProfissao("Programador");
		
		
		Conta conta = new Conta(2727, 272727);
//		contaCliente.deposita(100);
//		
		//ASSOCIA O CLIENTE A CONTA
//		contaCliente.setTitular = cliente;
//		System.out.println(contaCliente.titular.nome);
//		System.out.println(contaCliente.titular);

		//COM GETTERS E SETTER (ENCAPSULAMENTO):
		conta.setTitular(cliente);
		
		System.out.println(conta.getAgencia());
		
	}

}
