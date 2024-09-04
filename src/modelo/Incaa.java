package modelo;

import java.util.ArrayList;
import java.util.List;

public class Incaa {
	private List <Pelicula> catalogo;

	public List<Pelicula> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}

	public Incaa(List<Pelicula> catalogo) {
		super();
		this.catalogo = catalogo;
	}




	public boolean agregarPelicula(String pelicula)throws Exception {
		int i=0;
		while(i<catalogo.size()) {
			if(catalogo.get(i).getPelicula().equals(pelicula)) {
				throw new Exception("la pelicula ya existe");	
			}
			i++;
		}
		Pelicula p=new Pelicula(pelicula);
		return catalogo.add(p);
	}

	public Pelicula traerPelicula(int idPelicula) {
		int i = 0;
		Pelicula p = null;
		while (i < catalogo.size() && p == null) {
			if (catalogo.get(i).getIdPelicula() != idPelicula) {
				p = null;

			} else {
				p = catalogo.get(i);

			}
			i++;
		}
		return p;
	}
	public List<Pelicula> traerPelicula(String partePelicula){
		List<Pelicula> lisPeli = new ArrayList<Pelicula>();
		for (int i=0;i<catalogo.size();i++) {
			if(catalogo.get(i).getPelicula()==partePelicula) {
				lisPeli.add(catalogo.get(i));
		}		
	}
		return lisPeli;
	}
	

	public void modificarPelicula(int idPelicula, String Pelicula)throws Exception {
		Pelicula p=new Pelicula(null);
		p=traerPelicula(idPelicula);
		if(p == null) {
			throw new Exception("no existe la pelicula");	
		}
		else {
			p.setPelicula(Pelicula);
		}
		}
	public boolean eliminarPelicula(int idPelicula)throws Exception {
		Pelicula p=new Pelicula(null);
		p=traerPelicula(idPelicula);
		if(p == null) {
			throw new Exception("no existe la pelicula");	
		}
		else {
			return catalogo.remove(p);
		}
		
	}
	
}





