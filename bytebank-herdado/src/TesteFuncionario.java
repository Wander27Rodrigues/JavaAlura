
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario nico = new Gerente();
		
		nico.setNome("Nico");
		nico.setCpf("034279102-88");
		nico.setSalario(3000);
		
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
	}

}
