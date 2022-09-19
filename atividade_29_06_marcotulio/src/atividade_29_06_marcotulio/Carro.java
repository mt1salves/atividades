package atividade_29_06_marcotulio;

public class Carro {
	
	private long codigo;
	private boolean acelerar;
	private boolean freioAcionado;
	private boolean estercar;
	private float anguloVolante;
	private float velocidadeAtual;
	private float velocidadeMaxima;

	// Constructor1
	public Carro() {
		this.codigo = 0;
		this.acelerar = false;
		this.freioAcionado = false;
		this.estercar = false;
		this.anguloVolante = 0;
		this.velocidadeAtual = 0;
		this.velocidadeMaxima = 0;
	}

	// Constructor2
	public Carro(long codigo, boolean acelerar /* boolean a */, boolean freioAcionado, boolean estercar,
			float anguloVolante, float velocidadeAtual, float velocidadeMaxima) {
		this.codigo = codigo;
		this.acelerar = acelerar; // acelerar = a;
		this.freioAcionado = freioAcionado;
		this.estercar = estercar;
		this.anguloVolante = anguloVolante;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	// Constructor3
	public Carro(long codigo, boolean acelerar /* boolean a */) {
		this.codigo = codigo;
		this.acelerar = acelerar; // acelerar = a;
	}
	
	public long getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	
	public boolean getAcelerar() {
		return this.acelerar;
	}
	
	public void setAcelerar(boolean acelerar) {
		this.acelerar = acelerar;
	}

	public boolean getFreioAcionado() {
		return this.freioAcionado;
	}
	
	public void setFreioAcionado(boolean freioAcionado) {
		this.freioAcionado = freioAcionado;
	}

	public boolean getEstercar() {
		return this.estercar;
	}
	
	public void setEstercar(boolean estercar) {
		this.estercar = estercar;
	}

	public float getAnguloVolante() {
		return this.anguloVolante;
	}
	
	public void setAnguloVolante(float anguloVolante) {
		this.anguloVolante = anguloVolante;
	}
	
	public float getVelociadeAtual() {
		return this.velocidadeAtual;
	}
	
	public void setVelocidadeAtual(float velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public float getVelocidadeMaxima() {
		return this.velocidadeMaxima;
	}
	
	public void setVelocidadeMaxima(float velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void imprimir() {
		System.out.println("Código: " + this.codigo + " Aceleração: " + getAcelerar() + " Frenagem: " + this.freioAcionado + " Esterceamento: "
				+ this.estercar + " Ângulo: " + this.anguloVolante + " Velocidade atual: " + this.velocidadeAtual
				+ " Velocidade máxima: " + this.velocidadeMaxima);
	}

}
