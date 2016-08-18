package pe.edu.upc.view;

import pe.edu.upc.entity.Frutra;
import pe.edu.upc.entity.Mermelada;

public class appFruta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frutra f=new Frutra("Amarillo", "Dulce");
		Mermelada mer=new Mermelada("Rojo","Acido",1,"Vidrio");
		
		System.out.println(f.toString());
		f.SoyunMetodoObjeto();
		
		System.out.println(mer.toString());
		mer.SoyunMetodoObjeto();
		
		Frutra.LugarOrigen="Tierra";
		Frutra.SoyunMetodoGlobal();
	}

}
