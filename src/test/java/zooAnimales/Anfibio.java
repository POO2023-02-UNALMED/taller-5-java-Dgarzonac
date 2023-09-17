package zooAnimales;


public class Anfibio extends Animal{
	static int ranas;
	static int salamandras;
	String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre,int edad,String habitat,String  genero, String colorPiel, boolean venenoso){
		super(nombre, edad, habitat, genero);
		this.setVenenoso(venenoso);
	}
	
	public Anfibio crearRana(String nombre,int edad, String  genero){
		ranas++;
		return new Anfibio(nombre,edad,"selva",genero, "rojo", true);

	}
	public Anfibio crearSalamandra(String nombre,int edad, String  genero){
		salamandras++;
		return new Anfibio(nombre,edad,"selva", genero, "negro y amarillo", false);
	}
	
	public static int cantidadAnfibios(){
		return (ranas+salamandras) ;
	}
	
	public String movimiento(){
		return "saltar";
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
}
