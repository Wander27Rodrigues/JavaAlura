
public class TesteFuncionario {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		
		Gerente nico = new Gerente();
		nico.setNome("Nico");
		nico.setCpf("034279102-88");
		nico.setSalario(3000);
		
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
	}

}
