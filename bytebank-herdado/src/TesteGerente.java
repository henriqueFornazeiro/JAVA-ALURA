
public class TesteGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g1 = new Gerente ();
		g1.setNome("Braufagelio");
		g1.setCpf("123.456.789-10");
		g1.setSalario(5000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2111);
		boolean autenticou = g1.autentica(2111);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		
	}

}
