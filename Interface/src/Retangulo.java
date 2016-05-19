
public class Retangulo implements FiguraGeometrica {

	private double base, altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double getArea() {
		return base * altura;
	}

	@Override
	public double getPerimetro() {
		return 2 * base + 2 * altura;
	}

}
