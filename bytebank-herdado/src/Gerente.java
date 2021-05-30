//Gerente é um FuncionarioAutenticavel, gerente herda a class FuncionarioAutenticavel

public class Gerente extends Funcionario{
	
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de grana do gerente");
		return super.getSalario();
	}
		

}
