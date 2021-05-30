//Gerente é um Funcionario, gerente herda a class funcionario

public class Designer extends Funcionario {
			
	public double getBonificacao() {
		System.out.println("chamando metodo do Designer");
		return 200;
	}		

}