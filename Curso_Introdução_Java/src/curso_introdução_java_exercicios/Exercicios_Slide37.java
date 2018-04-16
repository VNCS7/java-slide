package curso_introdução_java_exercicios;

public class Exercicios_Slide37 {

	public static void main(String[] args) {
				
		/* 11) Crie uma variável inteira com um valor qualquer e verifique se o valor desta variável é menor que 15 ou maior que 100*/
	
			int ex11 = 101;
		
				if (ex11 == 100)
					System.out.println("15) MAIOR QUE 15 E IGUAL A 100");
				else if (ex11 == 15)
					System.out.println("15) IGUAL A 15 E MENOR QUE 100");
				else if (ex11 < 15 && ex11 < 100)
					System.out.println("15) MENOR QUE 15 e MENOR QUE 100");
				else if (ex11 > 15 && ex11 > 100)
					System.out.println("15) MAIOR QUE 15 e MAIOR QUE 100");
				else if (ex11 > 15 || ex11 < 100 )
					System.out.println("15) MAIOR QUE 15 E MENOR QUE 100");
				
		/* 12) Crie uma variável com valor de ponto flutuante com um valor qualquer e verifique se o valor desta variável está entre 1.99 e 5.99, inclusive*/
		
			double ex12 = 2.55;
			
				if(ex12 >=1.99 && ex12 <=5.99)
					System.out.println("\n12) NÚMERO ESTÁ ENTRE 1.99 E 5.99");
				else
					System.out.println("\n12) NÚMERO NÃO ESTÁ ENTRE 1.99 E 5.99");
			
		/* 13) agora compare se o valor das duas variáveis acima são iguais */
			
			if(ex11 == ex12) System.out.println("\n13) VALORES IGUAIS");
			else System.out.println("\n13) VALORES DIFERENTES");
			
		/* 14) Calcule o valor da multiplicação de um int por um double, atribuindo o valor a um int*/
			
			int ex14_1=10, ex14_f = 0; 
			double ex14_2=0.5;
			ex14_f=(int) (ex14_1*ex14_2);
			System.out.println("\n14) "+ex14_1+" X "+""+ex14_2+" = "+ex14_f);
		
	}

}
