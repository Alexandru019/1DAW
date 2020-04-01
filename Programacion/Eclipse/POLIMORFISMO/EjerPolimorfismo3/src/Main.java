public class Main {
// Array de objetos SeleccionFutbol.
public static SeleccionFutbol[] integrantes = new SeleccionFutbol[3];
public static void main(String[] args) {
SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, 28489);
SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
SeleccionFutbol raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);
integrantes[0]= delBosque;
integrantes[1]= iniesta;
integrantes[2]= raulMartinez;
// CONCENTRACION
System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo metodo)");
for (int i=0; i<integrantes.length; i++) {
System.out.print(integrantes[i].getNombre() + " " + integrantes[i].getApellidos() + " -> ");
integrantes[i].concentrarse();
}
// VIAJE
System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo metodo)");
for (int i=0; i<integrantes.length; i++) {
System.out.print(integrantes[i].getNombre() + " " + integrantes[i].getApellidos() + " -> ");
integrantes[i].viajar();
}
// ENTRENAMIENTO
System.out.println("\nEntrenamiento: Todos los integrantes tienen su funcion en un entrenamiento(Especializaci�n)");
for (int i=0; i<integrantes.length; i++){
System.out.print(integrantes[i].getNombre() + " " + integrantes[i].getApellidos() + " -> ");
integrantes[i].entrenamiento();
}
// PARTIDO DE FUTBOL
System.out.println("\nPartido de Futbol: Todos los integrantes tienen su funcion en un partido (Especializaci�n)");
for (int i=0; i<integrantes.length; i++){
System.out.print(integrantes[i].getNombre() + " " + integrantes[i].getApellidos() + " -> ");
integrantes[i].partidoFutbol();
}
// PLANIFICAR ENTRENAMIENTO
System.out.println("\nPlanificar Entrenamiento: Solo el entrenador tiene el metodo para planificar un entrenamiento:");
System.out.print(delBosque.getNombre() + " " + delBosque.getApellidos() + " -> ");
((Entrenador) delBosque).planificarEntrenamiento();
// ENTREVISTA
System.out.println("\nEntrevista: Solo el futbolista tiene el metodo para dar una entrevista:");
System.out.print(iniesta.getNombre() + " " + iniesta.getApellidos() + " -> ");
((Futbolista) iniesta).entrevista();
// MASAJE
System.out.println("nMasaje: Solo el masajista tiene el metodo para dar un masaje:");
System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " -> ");
((Masajista) raulMartinez).darMasaje();
}
}
