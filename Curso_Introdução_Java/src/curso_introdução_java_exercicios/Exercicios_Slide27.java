package curso_introdu��o_java_exercicios;

public class Exercicios_Slide27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 7) Calcula a �rea de uma circufer�ncia com raio 12, onde PI=3.1415 e �rea = PI * r� */
		double PI = 3.1415, area=0; int raio=12;
		area = PI *Math.pow(raio, 2);
		System.out.println("7) �rea de uma circunfer�ncia de raio 12 � igual a: "+area);
		
		/* 8) Calcule o resto da divis�o de 99 por 4. */
		int restinho = 99 % 4;
		System.out.println("\n8) Resto da divis�o de 99/4: "+restinho);
		
		/* 9) Divida um n�mero por 2 sem utilizar o operador /. */
		int ex9=10;
		double divisao = ex9*0.5;
		System.out.println("\n9) 10 divido por 2 �: "+divisao);
		
		/* 10) Multiplique um n�mero por 8, sem utilizar o operador *. */
		int ex1o = 1;
		ex1o = 1+1+1+1+1+1+1+1;
		System.out.println("\n10) 1x8 = "+ex1o);
	}

}
