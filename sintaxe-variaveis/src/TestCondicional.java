
public class TestCondicional {
	
	//escreve "main", clica ctrl + espa�o : autocomplete. "sysout" no outro.
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int idade = 16;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Pode entrar");
		} else if(quantidadePessoas >=2) {
				System.out.println("Voc� tem menos de 18 anos, mas pode entrar por estar acompanhado");
			} else {
			System.out.println("Voc� tem menos de 18 anos");
			System.out.println("N�o pode entrar");
			}
	}
}