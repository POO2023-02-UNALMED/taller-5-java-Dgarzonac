package zooAnimales;

import gestion.*;

public class Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
	}
	public Animal(){
	}

	public String movimiento(){
		return "desplazarse";
	} 
	public static String totalPorTipo(){return "Mamiferos: "+Mamifero.cantidadMamiferos()+"\n" + "Aves: "+Ave.cantidadAves()+"\n" + "Reptiles: "+Reptil.cantidadReptiles()+"\n" + "Peces: "+Pez.cantidadPeces()+"\n" + "Anfibios: "+Anfibio.cantidadAnfibios();}
	
	public String toString (){
		if (zona!=null){
			return "Mi nombre es " + this.nombre +  ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " + this.genero + ", la zona en la que me ubico es " +  this.getZona().getNombre() + ", en el " + this.zona.getZoo().getNombre();
		}else {
			return "Mi nombre es " + this.nombre +  ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " + this.genero ;
			
		}
	}

	public int getTotalAnimales() {
		return totalAnimales;
	}

	public void setTotalAnimales(int totalAnimales) {
		this.totalAnimales = totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
}
