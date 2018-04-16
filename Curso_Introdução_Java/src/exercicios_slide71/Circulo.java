package exercicios_slide71;

public class Circulo {
	final double PI = 3.14;
	Double raio=15.d;
	Double area = 0.d;
	
	void AreaCirculo() {
		area = PI * Math.pow(raio,2);
		System.out.println("\n¡rea do circulo de raio "+raio+" È igual a: "+area);
		
	}

}
