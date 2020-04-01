
public class CachimbaDeRosca extends Cachimbas{
	private String TipoRosca;
	public CachimbaDeRosca(String marca, String modelo, int precio,String rosca) {
		super(marca, modelo, precio);
		TipoRosca=rosca;
	}

	public void reparar() {
		System.out.println("--Arreglar Cachimba de rosca--\n-Asegurar la base\n-Quitar la vieja rosca\n-Cambiar la rosca por una de tipo "+TipoRosca);
	}

	public String getTipoRosca() {
		return TipoRosca;
	}

	public void setTipoRosca(String tipoRosca) {
		TipoRosca = tipoRosca;
	}

	public void MaterialMastil() {
		if(getMarca()=="Wookah" || getMarca()=="MrWood" || getMarca()=="HUME") {
		System.out.println("El material del mástil de la cachimba "+getMarca()+" "+getModelo()+" es de madera");
	}else {
		System.out.println("El material del mástil de la cachimba "+getMarca()+" "+getModelo()+" es de acero V2A");
	}
	}

	public void MaterialBase() {
		if(getMarca()=="HUME") {
			System.out.println("El material de la cachimba "+getMarca()+" "+getModelo()+" la base es de plástico");
		}else {
			if(getMarca()=="Wookah") 
				System.out.println("El material de la cachimba "+getMarca()+" "+getModelo()+" la base es de cristal de Bohemia");
			else
				System.out.println("El material de la cachimba "+getMarca()+" "+getModelo()+" la base es de cristal");
		}
		
	}
	public void MostrarDatos() {
		System.out.println("Marca: "+getMarca()+"\n Modelo: "+getModelo()+"\n Precio: "+getPrecio()+"\n Rosca: "+TipoRosca);
		}
	

}
