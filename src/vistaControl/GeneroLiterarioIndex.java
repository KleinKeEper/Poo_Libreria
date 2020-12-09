package vistaControl;

import java.util.ArrayList;
import java.util.List;

import daoImp.GenerosLiterariosDaoImp;
import modelo.Genero_liteario;
import utils.leer;

public class GeneroLiterarioIndex {

	
	
	
	public static void EliminarGeneros() {
		// TODO Auto-generated method stub
		
	}
	
	public static void AgregarGeneros() {
		// TODO Auto-generated method stub
		
	}
	
	public static void listarGeneros() {
		GenerosLiterariosDaoImp generosLiterariosDaoImp = new GenerosLiterariosDaoImp();
		List<Genero_liteario> generos = generosLiterariosDaoImp.listarGenerosLiterarios(); 
		System.out.println("\t--- GENEROS LITERARIOS --");
		leer.saltoLinea(1);
		System.out.println("ID\tGENEROS");
		for (Genero_liteario genero_liteario : generos) {
			System.out.println(genero_liteario.getId_genero_literario()
					+ "\t" + genero_liteario.getNombre_genero());
		}
		
		
		
		// TODO Auto-generated method stub
		
	}
	
	public static void menu() {
		leer.saltoLinea(1);
		System.out.println(" ---- MENU GENEROS LITERARIOS ----");
		System.out.println("1. Listar Genero Literario ");
		System.out.println("2. Agregar Genero literario ");
		System.out.println("3. Eliminar Genero Literario ");
		System.out.println("4. Regresar ");

		
	}
	
	public static void menuGenero() {
		// TODO Auto-generated method stub
		int opcion;
		
		do {
			menu();
			System.out.print("Ingrese una opcion valida: ");
			opcion = leer.entero();
			switch (opcion) {
			case 1:
				listarGeneros();
				break;
			case 2:
				AgregarGeneros();
				break;
			case 3:
				EliminarGeneros();
				break;

			default:
				break;
			}
			
			
		} while (opcion != 4);
		
		
		
	}


}
