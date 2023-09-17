package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal {
	static int iguanas;
	static int serpientes;
	String colorEscamas;
	private int largoCola;
	private List<Reptil> reptiles = new ArrayList<>();
	
	public Reptil(String nombre,int edad,String habitat,String  genero, String colorEscamas, int largoCola){
		super(nombre, edad, habitat, genero);
		this.largoCola=largoCola;
		reptiles.add(this);
	}
	
	public static Reptil crearIguana(String nombre,int edad,String genero){
		iguanas++;
		return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
	}
	public static Reptil crearSerpiente(String nombre,int edad,String genero){
		serpientes++;
		return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
	}
	public String movimiento(){
		return "reptar";
	}
	public static int cantidadReptiles(){
		return (iguanas+serpientes) ;
	}
	public int getLargCola(){
		return largoCola;
	}
	public void setLargoCola(int largoCola){
		this.largoCola=largoCola;
	}
}
