package pe.edu.upc.entity;

public class Frutra {
	//Atributos de instancia
	private String Color;
	private String Sabor;
	
	//Atributos de Clase
	public static String LugarOrigen="UPC";
	
	//Constructores
	public Frutra(String color, String sabor) {
		super();
		Color = color;
		Sabor = sabor;
	}
	
	public static void SoyunMetodoGlobal(){
		
	}
	
	public void SoyunMetodoObjeto(){
		
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getSabor() {
		return Sabor;
	}

	public void setSabor(String sabor) {
		Sabor = sabor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getColor();
	}

}
