
public class TestVariable {
	
	public static void main(String[] args) {
		System.out.println("Hello new test");
		
		
			//declarar vari�vel inteiro: tipo e nome. 
		int idade;
		idade = 37;
		System.out.println("A idade � "+ idade);
		
		
			//vari�vel real
		double salario;
		salario = 1250.90;
		System.out.println(salario);
		
		double divisao;
		divisao = 5/2;
		System.out.println(divisao);
		
			//forma correta em dividir n�mero real + Forma enxuta de declarar vari�vel
		double novaDivisao = 5.0/2;
		System.out.println(novaDivisao);
		
		
			//transformar double em inteiro, podendo perder alguma coisa.
		double salario2 = 1270.5;
		int valor = (int) salario2;
		System.out.println(valor);
		
			//outros tipos de dados
		//long numeroGrande = 99954546465L;
		//short valorPequeno = 99;
		//byte b = 127;
		
			//ponto flutuante
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total1 = valor1 + valor2;
		System.out.println(total1);
		
			//vari�vel caracter. S� pode conter uma palavra. N�o se usa aspas dupla.
		char letra = 'a';
		System.out.println(letra);
		
			//n�o � um tipo de vari�vel que nem os outros, referencia a objeto. 
		String palavra = "alura curso online";
		System.out.println(palavra);
		
	}

}
