import java.util.ArrayList;
import java.util.List;

public class RepositorioDeFiguras {
	
	List<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();
	
	public void adicionar(FiguraGeometrica figura) {
		figuras.add(figura);
	}
	
	public void remover(int indice) {
		if (indice < figuras.size()) {
			figuras.remove(indice);			
		}
	}
	
	public void remover(FiguraGeometrica figura) {
		figuras.remove(figura);
	}
	
	public void exporTodas() {
		for (FiguraGeometrica figuraGeometrica : figuras) {
			System.out.println("Area: " + figuraGeometrica.getArea());
			System.out.println("Perímetro: " + figuraGeometrica.getPerimetro());
			System.out.println("-------------------------------------------------------");
		}
	}

}
