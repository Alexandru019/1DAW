
public class Main {

	public static void main(String[] args) {
		SerVivo ObjetoX =new SerVivo((byte)3);
		SerVivo ObjetoY =new SerVivo((byte)5);
		Humano ObjetoA =new Humano((byte)34,"Homero");
		Humano ObjetoB =new Humano((byte)9,"Bart");
		System.out.println("El humano mayor ordenado alfabeticamente por el nombre es :\n"+ObjetoA.mayor(ObjetoB));
		System.out.println("¿Los humanos son iguales? "+ObjetoX.equals(ObjetoY));
	}

}
