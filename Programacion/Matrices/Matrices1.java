 	public class Matrices1 {
		public static void main(String[] args) {
			float[] Notas = {5.8f,6.2f,7.1f,5.9f,3.6f,9.9f,1.2f,10.0f,4.6f,5.0f};

			String[] Nombres = new String[10];
			Nombres[0]="Pedro";Nombres[1]="Ana";Nombres[2]="Luis";
			Nombres[3]="Luis";Nombres[4]="Juan";Nombres[5]="Eva";
			Nombres[6]="Mari";Nombres[7]="Fran";Nombres[8]="Luz";
			Nombres[9]="Sol";

 			for (int i=0;i<Nombres.length;i++)
 				System.out.println(Nombres[i] + " : " + Notas[i]);

 			System.out.println();

 			byte Aprobados = 0;
 			String NombresAprobados = new String();
 			for (int i=0;i<Nombres.length;i++)
 				if (Notas[i]>=5.0){
 					Aprobados++;
 					NombresAprobados = NombresAprobados+" "+Nombres[i];
 				}
 			System.out.println("Aprobados: " + Aprobados);
 			System.out.println("Aprobados:" + NombresAprobados);

 		}
	 }
