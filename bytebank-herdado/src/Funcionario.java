
//N�o pode instanciar dessa classe, porque ela virou abstract
public abstract class Funcionario {
	
	
	
	private String nome;
	private String cpf;
	private double salario;
	
	
	public Funcionario() {
		
	}
	
	// abstract no metodo = metodo sem corpo, n�o h� implementacao aqui e sim nos filhos
	public abstract double getBonificacao();
		
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
		

}
