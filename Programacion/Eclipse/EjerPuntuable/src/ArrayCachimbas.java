
public class ArrayCachimbas {
private Cachimbas[] AlmacenCachimbas;
	
	public ArrayCachimbas() {
		this.AlmacenCachimbas = new Cachimbas [6];
	}
	public void addCachimba(Cachimbas Cachimbeira) {
		for (int i=0;i<6;i++) {
			if(AlmacenCachimbas[i] instanceof CachimbaDeGoma || AlmacenCachimbas[i] instanceof CachimbaDeRosca) {
				
			}else {
				AlmacenCachimbas[i]=Cachimbeira;
				i=6;
			}
		}
	}
	public void imprimirCachimbas() {
		for(int i=0;i<6;i++) {
			if(AlmacenCachimbas[i] instanceof CachimbaDeGoma || AlmacenCachimbas[i] instanceof CachimbaDeRosca) {
				((Cachimbas) AlmacenCachimbas[i]).MostrarDatos();
			}
		}
	}

}
