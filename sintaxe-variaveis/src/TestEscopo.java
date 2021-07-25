

public class TestEscopo {
	public static void main(String[] args) {
		System.out.println("testando escopo");
		
		int quantidadePessoas = 3;
		
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}
		System.out.println(acompanhado);
	}
	
}
