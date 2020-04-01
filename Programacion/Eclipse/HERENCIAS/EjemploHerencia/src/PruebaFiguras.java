    	import java.awt.Color;
    
    	public class PruebaFiguras {
    		public static void main(String[] args) {
    			int[] Posicion = {10,20};
    			double[] Lados = {50d,100d};
    			Circulo MiCirculo = new Circulo(3d,Color.red,Posicion);
    			Rectangulo
      			MiRectangulo = new Rectangulo(Lados,Color.blue,Posicion);
    
    		System.out.println(MiCirculo.DimeRadio());
    			int[] Centro = MiCirculo.DimeCentro();
    			System.out.println(Centro[0]);
    			System.out.println(Centro[1]);
    
    			System.out.println(MiRectangulo.DimeColor());
     
    		}
    	}
