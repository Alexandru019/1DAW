
public class TestCachimbas {

	public static void main(String[] args) {
		 CachimbaDeRosca Rosca1 = new CachimbaDeRosca("Wookah", "Walnut", 220, "45221887-K");
		 CachimbaDeRosca Rosca2 = new CachimbaDeRosca("HUME", "Zebrium", 260, "72332634-L");
		 CachimbaDeRosca Rosca3 = new CachimbaDeRosca ("Kayah", "SPN480", 80, "34998128-M");

		 CachimbaDeGoma Goma1 = new CachimbaDeGoma ("Karma", "White 1.0", 180);
		 CachimbaDeGoma Goma2 = new CachimbaDeGoma ("HookahLex", "Tauro", 210);
		 CachimbaDeGoma Goma3 = new CachimbaDeGoma ("Aladdin", "MVP 360", 70);

		 ArrayCachimbas AlmacenCachimbas = new ArrayCachimbas();
		 AlmacenCachimbas.addCachimba (Rosca1);AlmacenCachimbas.addCachimba(Rosca2);AlmacenCachimbas.addCachimba (Rosca3);
		 AlmacenCachimbas.addCachimba (Goma1);AlmacenCachimbas.addCachimba(Goma2);AlmacenCachimbas.addCachimba (Goma3);
		 AlmacenCachimbas.imprimirCachimbas();
		 System.out.println();
		 Rosca2.MaterialMastil();Rosca2.MaterialBase();
		 System.out.println();
		 Goma2.MaterialBase();Goma2.MaterialMastil();
		 System.out.println();
		 System.out.println("Hora de ver como se reparan las cachimbas segun su clase:");
		 Rosca1.reparar();
		 System.out.println();
		 Goma3.reparar();
		 
	}

}
