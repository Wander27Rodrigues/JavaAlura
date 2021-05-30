//Gerente é um Funcionario, gerente herda a class funcionario

public class EditorVideo extends Funcionario {
			
	public double getBonificacao() {
		System.out.println("chamando metodo do editor");
		return super.getBonificacao() + 100;
	}		

}
