package curso_introdução_java_exercicios;

public class Exercicios_Slide27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 7) Calcula a área de uma circuferência com raio 12, onde PI=3.1415 e área = PI * r² */
		double PI = 3.1415, area=0; int raio=12;
		area = PI *Math.pow(raio, 2);
		System.out.println("7) Área de uma circunferência de raio 12 é igual a: "+area);
		
		/* 8) Calcule o resto da divisão de 99 por 4. */
		int restinho = 99 % 4;
		System.out.println("\n8) Resto da divisão de 99/4: "+restinho);
		
		/* 9) Divida um número por 2 sem utilizar o operador /. */
		int ex9=10;
		double divisao = ex9*0.5;
		System.out.println("\n9) 10 divido por 2 é: "+divisao);
		
		/* 10) Multiplique um número por 8, sem utilizar o operador *. */
		int ex1o = 1;
		ex1o = 1+1+1+1+1+1+1+1;
		System.out.println("\n10) 1x8 = "+ex1o);
	}

}
