//construtor - obrigatoriedade

public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getAge());
		
		conta.setAgencia(1232123);
		
		Conta conta2 = new Conta(1337, 24226);
		Conta conta3 = new Conta(1337, 24226);
		
		System.out.println(Conta.getTotal());
	}

}
