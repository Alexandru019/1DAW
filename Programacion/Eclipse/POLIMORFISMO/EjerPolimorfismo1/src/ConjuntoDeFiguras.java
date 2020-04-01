import java.util.Arrays;

public class ConjuntoDeFiguras {
 private Figura[]A;
 static private int posicion=0;
 ConjuntoDeFiguras(){
 A = new Figura[10];
 }
 
 void anyade(Figura f){ 
	 A[posicion]=f;
	 posicion++;
 }

public void imprimeTodo() {
	for(int i=0;i<posicion;i++) {
		System.out.println("Color: "+A[i].DimeColor());
		if(A[i] instanceof Rectangulo) {
			System.out.println("Lados: "+((Rectangulo)A[i]).DimeLados());
			System.out.println("Area Total: "+((Rectangulo)A[i]).areaTotal());
		}else {
			if(A[i] instanceof Circulo) {
				System.out.println("Radio: "+((Circulo)A[i]).DimeRadio());
				System.out.println("Area Total: "+((Circulo)A[i]).areaTotal());
			}
		}
	}
}
 
}
