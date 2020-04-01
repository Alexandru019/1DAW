
public class CachimbaDeGoma extends Cachimbas{
	public CachimbaDeGoma(String marca, String modelo, int precio) {
		super(marca, modelo, precio);
	}

	public void reparar() {
		System.out.println("--Arreglar Cachimba de Goma--\n-Asegurar la base\n-Quitar la vieja Goma\n-Cambiar la Goma");
	}
	public void MaterialMastil() {
		if(getMarca()=="Karma" || getMarca()=="Regal") {
		System.out.println("El material del mástil de la cachimba "+getMarca()+" "+getModelo()+" es de madera");
	}else {
		System.out.println("El material del mástil de la cachimba "+getMarca()+" "+getModelo()+" es de acero V2A");
	}
	}

	public void MaterialBase() {
		if(getMarca()=="VIDShisha") {
			System.out.println("El material de la cachimba "+getMarca()+" "+getModelo()+" la base es de plástico");
		}else {
			if(getMarca()=="HookahLex") 
				System.out.println("El material de la cachimba "+getMarca()+" "+getModelo()+" la base es de cristal de Bohemia");
			else
			System.out.println("El material de la cachimba "+getMarca()+" "+getModelo()+" la base es de cristal");
		}
		
	}
	public void MostrarDatos() {
		System.out.println("Marca: "+getMarca()+"\n Modelo: "+getModelo()+"\n Precio: "+getPrecio());
		}
}
