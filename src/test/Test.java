package test;

import java.util.ArrayList;
import java.util.List;

import modelo.Incaa;
import modelo.Pelicula;
public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<Pelicula> lisPeli = new ArrayList<Pelicula>();
		Incaa i=new Incaa(lisPeli);
		try {
			
			i.agregarPelicula("aca1");
			i.agregarPelicula("harry");
			System.out.println(i.getCatalogo().toString());
		}catch ( Exception e ){
			System.out.println("Excepcion: " + e.getMessage());
		}
		try {
			System.out.println( i.traerPelicula(0));
			//System.out.println(i.traerPelicula(1));
		}catch(Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}
		
	System.out.println(i.traerPelicula("aca").toString());
	
	try {
		i.modificarPelicula(1, "roberto"); 
		System.out.println(i.getCatalogo().toString());
		}catch(Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		
			
	}
	try {
		i.eliminarPelicula(1); 
		System.out.println(i.getCatalogo().toString());
		}catch(Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		
			
	}
	
	}
}
