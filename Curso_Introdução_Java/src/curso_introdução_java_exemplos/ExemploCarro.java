package curso_introdução_java_exemplos;

public class ExemploCarro {
	public static void main(String[] args) {
		
		Carro umCarro = new Carro();
		
		umCarro.modelo = "Gol";
		umCarro.cor = "Preto";
		umCarro.motor = "1.0";
		
		System.out.println("Modelo do carro: "+umCarro.modelo);
		System.out.println("Cor do carro: "+umCarro.cor);
		System.out.println("Motor do carro: "+umCarro.motor+"\n");
		
		umCarro.ligar();
		umCarro.mudarMarcha();
		umCarro.acelerar();
		umCarro.brecar();
		umCarro.desligar();
		
		umCarro = null;
		
	}

}
