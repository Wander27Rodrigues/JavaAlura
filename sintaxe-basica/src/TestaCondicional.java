
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 20;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("voc� tem mais de 18 anos");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("voc� n�o tem 18, mas pode entrar," 
			+ "pois est� acompanhado");
			} else {
				System.out.println("infezlimente voc� n�o pode entrar");
			}

		}
	}
}
