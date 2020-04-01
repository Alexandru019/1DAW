
public class Main {

	public static void main(String[] args) {
		SerVivo X=new SerVivo ((byte) 3);
		SerVivo Y=new SerVivo ((byte) 5);
		Humano human1=new Humano((byte)34,"Homer");
		Humano human2=new Humano((byte) 9,"Bart");
		System.out.println(human1.mayor(human2));
		System.out.println("hola");
	}

}
