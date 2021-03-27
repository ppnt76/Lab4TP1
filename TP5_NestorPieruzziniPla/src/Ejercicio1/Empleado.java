package Ejercicio1;

public class Empleado 
{
	//atributos
 private final int id;
 private String nombre;
 private int edad;
 private static int cont=1000;
 //constructores
 public Empleado()
 {
	 cont++;
	 this.id=cont;
	 this.nombre="Sin Nombre";
	 this.edad=99;
 }
 public Empleado(String nombre, int edad)
 {
	cont++;
	this.id=cont;
	this.nombre=nombre;
	this.edad=edad;
 }
 //metodo
 public static int DevuelveElProximoID()
 {
	 return cont+1;
 }
@Override
public String toString()
{
	return "Id Empleado=" + id + ", Nombre=" + nombre + ", Edad=" + edad;
}
//getters y setters
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

 
}
