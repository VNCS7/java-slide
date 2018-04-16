package curso_introdução_java_exercicios;

public class Exercicios_Slide18 {
	public static void main(String args[]) {
		
		/* 3) Declare uma variável do tipo String com a frase "Curso de Java". */
		String ex3 = "Curso de Java";
		System.out.println("03) "+ex3);
		
		/* 4) Concatene na variável criada acima a frase " - Exemplo String". */
		String ex4 = " - Exemplo String";
		String ex4_f = ex3+ex4;
		System.out.println("\n04) "+ex4_f);
		
		/* 5) Imprima na tela (console) o número de caracteres da String. */
		System.out.println("\n05) Tamanho da String: "+ex4_f.length());
		
		/* 6) Cria uma nova String, pegando o pedaço da primeira String que compreenda a frase "Exemplo String". */
		String ex6 = ex4_f.substring(16, 30);
		System.out.println("\n06) Fragmento da string: "+ex6);
		
	}

}
