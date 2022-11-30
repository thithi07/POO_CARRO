import javax.swing.JOptionPane;

public class TesteCarro {

	public static void main(String[] args) {

		Carro carro1 = new Carro("azul", "Porshe");
		Carro carro2 = new Carro("vermelho", "Ferrari");

		carro1.setModelo("Maserati");
		carro1.setCor("Preto");

		carro2.setModelo("BMW");
		carro2.setCor("Laranja");

		System.out.printf("O modelo do carro1 é: %s \n", carro1.getModelo());
		System.out.printf("A cor do carro1 é: %s \n", carro1.getCor());

		System.out.printf("O modelo do carro2 é: %s \n", carro2.getModelo());
		System.out.printf("A cor do carro2 é: %s \n", carro2.getCor());
	}

}
