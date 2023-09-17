package zooAnimales;

public class Pez extends Animal{
	static int salmones;
	static int bacalaos;
	String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre,int edad,String habitat,String  genero, String colorEscamas, int cantidadAletas){
		super(nombre, edad, habitat, genero);
		this.setCantidadAletas(cantidadAletas);
	}
	
	
	public Pez crearSalmon(String nombre,int edad,String genero){
		salmones++;
		return new Pez(nombre, edad, "oceano", genero, "rojo", 6); 
	}
	public Pez crearBacalao(String nombre,int edad,String genero){
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
}
