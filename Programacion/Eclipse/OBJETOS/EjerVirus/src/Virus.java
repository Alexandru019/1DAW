
public class Virus {
	private int codVirus;
	private static int contador=0;
	
	
	public Virus(int a) {
		this.codVirus=a;
		contador++;
	}
	
	public int NumeroVirus() {
		return this.codVirus;
	}
	
	public static int getVirusCount() {
		return contador;
	}
}
