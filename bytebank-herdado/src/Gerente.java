//Gerente � um Funcionario, gerente herda a class funcionario

public class Gerente extends Funcionario {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de grana do gerente");
		return super.getSalario();
	}
		
	
	
	
	
		

}
