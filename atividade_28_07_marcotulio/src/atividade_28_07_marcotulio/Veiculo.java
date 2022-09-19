package atividade_28_07_marcotulio;

public class Veiculo {
	protected String marca1 = "Ford";
	protected String marca2 = "Volkswagen";
	public void buzina1() {
	    System.out.println("Tuut, tuut!");
	  }
	  public void buzina2() {
	    System.out.println("Vruum, vruum!");
	  }
}

	class Carro extends Veiculo {
	  private String modelName1 = "Mustang";
	  private String modelName2 = "Jetta";
	  public static void main(String[] args) {

	    Carro carroVeloz1 = new Carro();
	    carroVeloz1.buzina1();
	    System.out.println(carroVeloz1.marca1 + " " + carroVeloz1.modelName1 + "\n");

		Carro carroVeloz2 = new Carro();
		carroVeloz2.buzina2();
		System.out.println(carroVeloz2.marca2 + " " + carroVeloz2.modelName2);
	  }
}