package curso_introdu��o_java_exemplos;

public class EstringExemplos_Slide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Isto � uma String do Java";
		String xyz = new String("Isto � uma String do Java");
		
		if(str == xyz) System.out.println("IGUAL");
		else System.out.println("DIFERENTE");
		//Resultado ser�: DIFERENTE, pois o IF compara os endere�os das vari�veis na mem�ria e n�o o conteudo.

		if(str.equals(xyz)) {
			//MANEIRA CORRETA DE SE COMPARAR O CONTE�DO DAS STRINGS
		}
		
		System.out.println("\nTamanho da String: "+str.length());
		System.out.println("\nSubString: "+str.substring(0,10));
		System.out.println("\nCaracter na posi��o 5: "+str.charAt(5));
		
		
		//String str = "Isto � uma String do Java";
		
		String[] palavras = str.split(" ");
		// O m�todo split quebra a String e v�rias outras, pelo separador desejado
		
		int i = str.indexOf("uma"); //Retorna o �ndice da palavra na String
		System.out.println("\n�ndice da palavra na string: "+i);
		
		if(str.startsWith("Ol�")|| str.endsWith("Mundo!")) {
			//Testa o come�o e o fim da String - retorna boolean
		}
		
		str = str.trim(); //Elimina os espa�os em branco no in�cio e fim
		System.out.println("\n"+str);
		
		str = str.replace('a','@'); //Substitiu os caracteres
		System.out.println("\n"+str);
		
		str = str.replaceAll("String","Cadeia de caracteres"); //Substitui uma palavra (usa express�es regulares)
		System.out.println("\n"+str);
	}

}
