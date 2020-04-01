import java.awt.Color;
public class PruebaFiguras {
	public static void main (String [] args){
		 double[] Lados = {3d,4d};
		 ConjuntoDeFiguras c = new ConjuntoDeFiguras();
		 c.anyade(new Rectangulo(Lados, Color.green));
		 c.anyade(new Circulo(5,Color.red));
		 c.imprimeTodo();
	}
}
