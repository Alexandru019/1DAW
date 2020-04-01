     import java.awt.Color;
    
    	public class Circulo extends Figura {
    		private double Radio;
     
    		Circulo(double Radio) {
    			EstableceRadio(Radio);
    		}
     
    		Circulo(double Radio,Color color) {
    			super(color);
    			EstableceRadio(Radio);
    		}
    
    		Circulo(double Radio, Color color, int[] Posicion) {
    		super(color, Posicion);
    			EstableceRadio(Radio);
    		}
    
    		public void EstableceRadio(double Radio) {
    			this.Radio = Radio;
    		}
     
    		public double DimeRadio() {
    			return Radio;
    		}
    	}