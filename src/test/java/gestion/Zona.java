package gestion;

import zooAnimales.*;
import java.util.List;

public class Zona {
	private String nombre;
	private  Zoologico zoo;
	private List< Animal> animales;
	
	public Zona(String nombre, Zoologico zoo){
		this.nombre=nombre;
		this.zoo=zoo;
	}
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

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
}
