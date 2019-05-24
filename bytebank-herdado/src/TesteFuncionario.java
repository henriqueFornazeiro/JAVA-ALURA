
public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario func = new Funcionario();
		
		func.setNome("Henrique");
		func.setSalario(1600.00);
		func.setCpf("462.133.048-94");
		
		System.out.println(func.getNome());
		System.out.println(func.getSalario());
		System.out.println(func.getCpf());
		System.out.println(func.getBonificacao());
		
	}

}
