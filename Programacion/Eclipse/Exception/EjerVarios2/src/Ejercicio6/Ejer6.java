package Ejercicio6;
import java.sql.Date;
import java.util.*;
public class Ejer6 {
	public static boolean Comprueba(int dia,int mes,int anyo) {
		GregorianCalendar fecha1 = new GregorianCalendar(); 
		boolean comprobado=true;
		System.out.println("Espera,estamos comprobando la fecha");
		Calendar fecha=Calendar.getInstance();
		if((dia >31 || dia<0) || (mes<1 || mes>12) || (anyo > fecha.get(Calendar.YEAR))) {
			comprobado=false;
		}
		if((dia >= fecha.get(Calendar.DATE)|| dia<0) && (mes<1 || mes>=fecha.get(Calendar.MONTH)) && (anyo > fecha.get(Calendar.YEAR))) {
			comprobado=false;
		}
		if((dia < 0 || dia > 30) && (mes != 1 || mes != 3 || mes != 5 || mes != 7 || mes != 8 || mes != 10 || mes != 12)) {
			comprobado=false;
		}
		if(!fecha1.isLeapYear(anyo)) {
				if((dia<0 || dia >28) && mes == 2) {
					comprobado=false;
			}
		}
		if(comprobado==false) {
			System.out.println("La fecha que ha introducido no es una fecha correcta");
		}
		if(comprobado==true)
			System.out.println("Fecha comprobada");
		return comprobado;
		
		}
	
	
	public static void main(String[] args) {
		Scanner Leer = new Scanner(System.in);
		GregorianCalendar fechaActual = new GregorianCalendar(); 
		int opcion=0;
		System.out.println("Hola Usuario");
		System.out.println("------MENU------");
		System.out.println("1.Devuelvo el numero de semanas que llevas vivo");
		System.out.println("2.Te digo en que estacion del año naciste");
		System.out.println("3.Devuelvo el numero de domingos entre dos fechas");
		System.out.println("Escribe el numero de la opcion");
		try {
		opcion=Leer.nextInt();
		int dia;int mes;int anyo;
		switch (opcion) {
			case 1:
				System.out.println("Introduce el dia que naciste");
				dia=Leer.nextInt();
				System.out.println("Introduce el mes en el que naciste");
				mes=Leer.nextInt();
				System.out.println("Introduce el año de tu nacimiento");
				anyo=Leer.nextInt();
				System.out.println();
				if(Comprueba(dia,mes,anyo)==true) {
					fechaActual.setMinimalDaysInFirstWeek(1);
					int a=fechaActual.get(Calendar.YEAR)-anyo;
					int b=0;
					int annio=fechaActual.get(Calendar.YEAR);
					int numSemanas=0;
					for(int i=0;i<a;i++) {
						fechaActual.set(Calendar.YEAR, annio);
						numSemanas+=fechaActual.getWeeksInWeekYear();
						annio=annio-1; 
					}
					if(fechaActual.get(Calendar.MONTH)<mes && dia==fechaActual.get(Calendar.DATE)) {
						b=mes-fechaActual.get(Calendar.MONTH);
						b=b*4;
					}else {
						if(fechaActual.get(Calendar.MONTH)>mes && dia==fechaActual.get(Calendar.DATE)) {
							b=fechaActual.get(Calendar.MONTH)-mes;
							b=b*4;
						}else {
							if(fechaActual.get(Calendar.MONTH)<mes && dia<fechaActual.get(Calendar.DATE)) {
								b=mes-fechaActual.get(Calendar.MONTH)-1;
								b=b*4;
							}else {
								if(fechaActual.get(Calendar.MONTH)>mes && dia<fechaActual.get(Calendar.DATE)) {
									b=fechaActual.get(Calendar.MONTH)-mes-1;
									b=b*4;
								}
							}
						}
					System.out.println("Llevas vivo un total de "+numSemanas+b+" aproximadamente"+12*53);
				}
				}
			break;
			case 2:
				System.out.println("Introduce el dia que naciste");
				dia=Leer.nextInt();
				System.out.println("Introduce el mes en el que naciste");
				mes=Leer.nextInt();
				System.out.println("Introduce el año de tu nacimiento");
				anyo=Leer.nextInt();
				System.out.println();	
				Date fecha11 = new Date (0,0,0);
				
			break;
			case 3:
				
			break;
			default:
				System.out.println("Opcion no correspondiente");
				break;
		}
		}catch(InputMismatchException e) {
			System.out.println("---No puedes introducir texto---");
				}
		

	}

}
