package curso_introdu��o_java_exercicios;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exercicios_Slide38 {
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		/* 15) Crie um programa que receba dois argumentos (nomes) e os exiba na ordem alfab�tica correta */
		
			ArrayList<String> Entradas = new ArrayList<String>();
		
			System.out.print("Insira um nome: ");
			String nome1 = entrada.next();
			System.out.print("Insira um nome: ");
			String nome2 = entrada.next();
			
			Entradas.add(nome1); Entradas.add(nome2);
			Collections.sort(Entradas);
			System.out.println("\nNomes em ordem alfab�tica "+Entradas);
			
			
			
			
		/* 16/17) Crie um programa que receba dois argumentos e calcule a �rea de um quadril�tero e exiba na tela com a seguinte mensagem:
			Lado A = 
			Lado B = 
			A �rea � = 
		 
			Incremente o programa de c�lculo de �rea(16) para exibir ao final a mensagem:
			"A figura � um quadrado" caso seja um quadrado,
			ou, "A figura � um ret�ngulo", caso seja um ret�ngulo. */
		
			System.out.println("\n16) \n");
			System.out.print("Digite o lado A: ");
			double ladoa = entrada.nextDouble();
			System.out.print("Digite o lado B: ");
			double ladob = entrada.nextDouble();
		
			double area = ladoa * ladob;
		
			System.out.println("\nLado A = "+ladoa+"\nLado B = "+ladob+"\nA �rea � = "+area);
			
			if(ladoa == ladob)
				System.out.println("\nA FIGURA � UM QUADRADO");
			else
				System.out.println("\nA FIGURA � UM RET�NGULO");

	}

}
