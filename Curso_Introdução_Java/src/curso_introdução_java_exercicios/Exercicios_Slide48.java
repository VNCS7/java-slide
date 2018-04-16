package curso_introdução_java_exercicios;

public class Exercicios_Slide48 {
	public static void main(String args[]) {

		// 18) Faça o cálculo do valor da variável x mais y, inteiros, sem utilizaro operador +.
	
		int x=25,y=50,resultado=0;
		resultado = x-(-y);
		System.out.println("18) Resultado: "+resultado);
	
		
		/* 19) Verifique o valor de X, imprimindo uma mensagem correspondendo quando for maior, menor ou igual a 10, 
		   sem usar a cláusula IF().
		*/
		
		System.out.println( x == 10 ? "\n19) 'X' É IGUAL A 10" : x>10? "\n19) 'X' É MAIOR QUE 10" : "\n19) 'X' É MENOR QUE 10");
	
		
		/*	20) Faça a soma de todos os valor (inteiros) entrados como argumento do programa e exiba na tela 
			a mensagem: "A soma dos valores é = <valor>".
		*/
		
		//TENDI FOI NADA!
		int ex20 = x+y+resultado;
		System.out.println("\n20) A soma dos valores é = "+ex20); // é isso?
			
	}

}
