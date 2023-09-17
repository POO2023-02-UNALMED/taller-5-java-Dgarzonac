package gestion;

import zooAnimales.*;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
public class Zona {
	private String nombre;
	private static Zoologico zoo;
	private List< Animal> animales = new ArrayList<>();
	
	public Zona(){	
	}
	
	public void agregarAnimales(Animal animal){
		animales.add(animal);
	}
	
	public int cantidadAnimales(){
		return 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static Zoologico getZoo() {
		return zoo;
	}
}
