package buzón;
import buzón.correo.Correo;
public class pruebaBuzon {

	public static void main(String[] args) {
		Buzon b=new Buzon();
		b.añade(new Correo("Mensaje1"));
		Correo c=new Correo("Mensaje 2");
		b.añade(c);
		System.out.println("Por leer "+b.porLeer());
		b.muestraNoLeidos();
		System.out.println("Por leer "+b.porLeer());
	}

}
