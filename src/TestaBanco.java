
public class TestaBanco {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo";
		paulo.cpf = "033.103.122-33";
		paulo.profissao = "Dev";
	
		Conta contaDoConta = new Conta();
		contaDoConta.deposita(100);
		
		
		contaDoConta.titular = paulo;
		System.out.println(contaDoConta.titular.nome);
		System.out.println(contaDoConta.titular);
		System.out.println(paulo);
	}

}
