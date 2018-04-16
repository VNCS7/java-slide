package curso_introdução_java_exemplos;

public class EstringExemplos_Slide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Isto é uma String do Java";
		String xyz = new String("Isto é uma String do Java");
		
		if(str == xyz) System.out.println("IGUAL");
		else System.out.println("DIFERENTE");
		//Resultado será: DIFERENTE, pois o IF compara os endereços das variáveis na memória e não o conteudo.

		if(str.equals(xyz)) {
			//MANEIRA CORRETA DE SE COMPARAR O CONTEÚDO DAS STRINGS
		}
		
		System.out.println("\nTamanho da String: "+str.length());
		System.out.println("\nSubString: "+str.substring(0,10));
		System.out.println("\nCaracter na posição 5: "+str.charAt(5));
		
		
		//String str = "Isto é uma String do Java";
		
		String[] palavras = str.split(" ");
		// O método split quebra a String e várias outras, pelo separador desejado
		
		int i = str.indexOf("uma"); //Retorna o índice da palavra na String
		System.out.println("\níndice da palavra na string: "+i);
		
		if(str.startsWith("Olá")|| str.endsWith("Mundo!")) {
			//Testa o começo e o fim da String - retorna boolean
		}
		
		str = str.trim(); //Elimina os espaços em branco no início e fim
		System.out.println("\n"+str);
		
		str = str.replace('a','@'); //Substitiu os caracteres
		System.out.println("\n"+str);
		
		str = str.replaceAll("String","Cadeia de caracteres"); //Substitui uma palavra (usa expressões regulares)
		System.out.println("\n"+str);
	}

}
