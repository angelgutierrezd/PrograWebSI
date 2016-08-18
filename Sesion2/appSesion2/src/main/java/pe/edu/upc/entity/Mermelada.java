package pe.edu.upc.entity;

public class Mermelada extends Frutra {
	
	protected int tiempo_Preparacion;
	protected String tipo_Envase;

	public Mermelada(String color, String sabor,
			int tiempo_Preparacion,String tipo_Envase) {
		super(color, sabor);
		// TODO Auto-generated constructor stub
		this.tiempo_Preparacion = tiempo_Preparacion;
		this.tipo_Envase = tipo_Envase;
	}

	public int getTiempo_Preparacion() {
		return tiempo_Preparacion;
	}

	public void setTiempo_Preparacion(int tiempo_Preparacion) {
		this.tiempo_Preparacion = tiempo_Preparacion;
	}

	public String getTipo_Envase() {
		return tipo_Envase;
	}

	public void setTipo_Envase(String tipo_Envase) {
		this.tipo_Envase = tipo_Envase;
	}
	
	

}
