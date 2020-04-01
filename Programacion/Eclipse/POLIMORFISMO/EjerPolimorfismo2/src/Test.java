public class Test {
 public static void main (String[] arg){

 Animal anim= new Perro("simon") ;
 System.out.println("Constructor Animal, nombre del animal: "+anim.getNombre());
 Perro perro = (Perro) anim;
System.out.println("Constructor perro, nombre : "+perro.getNombre());
 Animal animalPolimorfico= new Perro("paco");
 System.out.println("Constructor Animal, nombre del animal: "+animalPolimorfico.getNombre());
 Perro perro1 = (Perro) animalPolimorfico;
System.out.println("Constructor perro, nombre: "+perro1.getNombre());
 Animal gat=new Gato("mimi");
 System.out.println("Constructor Animal, nombre del animal: "+gat.getNombre());
Gato gato = (Gato) gat;
 System.out.println("Constructor gato, nombre: "+gato.getNombre());
 anim.tipoAnimal();
animalPolimorfico.tipoAnimal();
gat.tipoAnimal();
}
}