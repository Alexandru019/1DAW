import java.awt.Color;
	public class Rectangulo extends Figura {

		private double[] Lados = new double[2];

		Rectangulo(double[] Lados) {
			EstableceLados(Lados);
		}

		Rectangulo(double[]Lados, Color color) {
			super(color);
			EstableceLados(Lados);
		}

		Rectangulo(double[] Lados, Color color, int[] Posicion) {
			super(color, Posicion);
			EstableceLados(Lados);
		}

		public void EstableceLados(double[] Lados) {
			this.Lados[0] = Lados[0];
			this.Lados[1] = Lados[1];
		}
 
		public String DimeLados() {
			return Lados[0]+" "+Lados[1];
		}
		public double areaTotal() {
			return Lados[0]*Lados[1];
		}

		public double Perimetro() {
			return 2d*Lados[0] + 2d*Lados[1];
		}
 	}