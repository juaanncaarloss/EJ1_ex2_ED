public class Cliente {
  private int id;
  private String nombre;

public Cliente(int id, String nombre) {
  this.id = id;
  this.nombre = nombre;
}

public void alquilar() {
  System.out.println(nombre + " ha alquilado una película");
  }
}

