package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal{
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	private List<Pez> peces = new ArrayList<>();
	
	public Pez(String nombre,int edad,String habitat,String  genero, String colorEscamas, int cantidadAletas){
		super(nombre, edad, habitat, genero);
		this.setCantidadAletas(cantidadAletas);
		peces.add(this);
	}
	
	public Pez(){}
	public static Pez crearSalmon(String nombre,int edad,String genero){
		salmones++;
		return new Pez(nombre, edad, "oceano", genero, "rojo", 6); 
	}
	public static Pez crearBacalao(String nombre,int edad,String genero){
		bacalaos++;
		return new Pez(nombre, edad, "oceano", genero, "gris", 6);
	}
	public String movimiento(){
		return "nadar";
	}
	public static int cantidadPeces(){
		return (salmones+bacalaos) ;
	}


	public int getCantidadAletas() {
		return cantidadAletas;
	}


	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
}
