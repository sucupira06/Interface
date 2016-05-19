
public class Circunferencia implements FiguraGeometrica {

	private double raio;
	
	public Circunferencia(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double getArea() {
		return Math.PI * raio * raio;
	}

	@Override
	public double getPerimetro() {
		return 2 * Math.PI * raio;
	}
	
	public double getRaio() {
		return raio;
	}

}
