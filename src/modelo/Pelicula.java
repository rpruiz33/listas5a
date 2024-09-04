package modelo;

public class Pelicula {
	//preguntar profe si se puede hacer lo del contador estatico
private static int contador=1;
private int idPelicula;
private String pelicula;


public int getIdPelicula() {
	return idPelicula;
}
public void setIdPelicula(int idPelicula) {
	this.idPelicula = idPelicula;
}
public String getPelicula() {
	return pelicula;
}
public void setPelicula(String pelicula) {
	this.pelicula = pelicula;
}


@Override
public String toString() {
	return "Pelicula [idPelicula=" + idPelicula + ", pelicula=" + pelicula + "]";
}
public Pelicula( String pelicula) {
	super();
	this.idPelicula = contador++;
	this.pelicula = pelicula;
}

public boolean equals(Pelicula p) {
	return p.getPelicula()== pelicula ;
}

}
