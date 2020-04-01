
public class PruebaHumano {

	public static void main(String[] args) {
		Humano hm1=new Humano("Elsa",(byte)16);
		Humano hm2=new Humano("Lucia",(byte)19);
		hm1.setNombre("Lucia");
		hm1.setEdad((byte) 19);
		System.out.println(hm1.getNombre());
		System.out.println(hm2.getNombre());
		System.out.println(hm1.equals(hm2));

	}

}
