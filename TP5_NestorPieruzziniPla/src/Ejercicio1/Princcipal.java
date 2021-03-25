package Ejercicio1;

public class Princcipal 
{

	public static void main(String[] args)
	{
		System.out.println("A--Func Devuelve el proximo ID lamando a la Clase metodo Statico");
		System.out.println(Empleado.DevuelveElProximoID());
		System.out.println("-------------------------------------------");
		System.out.println("B--Constructor sin Parametros");
		Empleado emp=new Empleado();
		System.out.println("toString");
		System.out.println(emp.toString());		
		System.out.println("-------------------------------------------");
		System.out.println("C--Func Devuelve el proximo ID lamando a la Clase metodo Statico");
		System.out.println(Empleado.DevuelveElProximoID());
		System.out.println("-------------------------------------------");
		System.out.println("D--Vector o array");
		Empleado[]vEmp=new Empleado[3];
		vEmp[0]=new Empleado("Armando",22);
		vEmp[1]=new Empleado("Esteban",32);
		vEmp[2]=new Empleado("Quito",44);
		for (Empleado empleado : vEmp) 
		{
			System.out.println(empleado.toString());			
		}
		System.out.println("-------------------------------------------");
		System.out.println("E--Func Devuelve el proximo ID lamando a la Clase metodo Statico");
		System.out.println(Empleado.DevuelveElProximoID());
		System.out.println("-------------------------------------------");
		System.out.println("F--Constructor con Parametros");
		Empleado emp1=new Empleado("Aldo",55);
		System.out.println("toString");
		System.out.println(emp1.toString());	
	}

}
