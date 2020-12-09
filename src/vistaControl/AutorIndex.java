package vistaControl;

import java.util.ArrayList;
import java.util.List;

import daoImp.AutorDaoImp;
import modelo.Autor;
import utils.leer;

public class AutorIndex {
	
	public static void listarAutor() {
		// TODO Auto-generated method stub
		AutorDaoImp autorDaoImp = new AutorDaoImp();
		ArrayList<List> autores = autorDaoImp.listarAutor();
		System.out.println("\t --- AUTORES ---");
		System.out.println("ID\tNOMBRE\tEDAD\tNACIONALIDAD");
		
		for (int i = 0; i < autores.size(); i++) {
			
			System.out.println(autores.get(i).get(0) 
					+ "\t" + autores.get(i).get(1)
					+ "\t" + autores.get(i).get(2) 
					+ "\t" + autores.get(i).get(3) 
					);
		}
		
		
	}

	
	public static void eliminarAutor() {
		// TODO Auto-generated method stub
		
	}
	
	public static void agregarAutor() {
		// TODO Auto-generated method stub
		AutorDaoImp autorDaoImp = new AutorDaoImp();
		
		System.out.println("\t--- AGREGAR AUTOR ---");
		leer.saltoLinea(1);
		PersonaIndex personaIndex = new PersonaIndex();
		personaIndex.listarPersona();
		
		leer.saltoLinea(1);
		System.out.print("Ingresar el id de la persona: ");
		int id = leer.entero();
		System.out.print("Nacionalidad: ");
		String nacionalidad = leer.cadena();
		
		
		if (autorDaoImp.agregarAutor(new Autor(0, nacionalidad, id))) 
			System.out.println("Ingresado Correctamente !!!");
		else 
			System.out.println("No se agrego el registro!!!");
		
	}
	
	private static void crearAutor() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void menuAgregarAutor() {
		System.out.println("\tMENU AGREGAR");
		System.out.println("1. Agregar autor");
		System.out.println("2. Crear nuevo autor");	
		System.out.println("3. Regresar");	
	}
	
	public static void menu() {
		leer.saltoLinea(1);
		System.out.println(" ---- MENU AUTORES ----");
		System.out.println("1. Listar Autores ");
		System.out.println("2. Agregar Autores");
		System.out.println("3. Eliminar Autores");
		System.out.println("4. Regresar ");

		
	}
	
	
	public static void  menuAgregar() {
		// TODO Auto-generated method stub
		int op;
		
		do {
			menuAgregarAutor();
			System.out.print("Ingrese una opcion valida: ");
			op = leer.entero();
			switch (op) {
			case 1:
				agregarAutor();
				break;
			case 2:
				crearAutor();
				break;
			default:
				break;
			}
			
			
		} while (op != 3);
	}
	
	


	public static void  menuAutor() {
		// TODO Auto-generated method stub
		int opcion;
		
		do {
			menu();
			System.out.print("Ingrese una opcion valida: ");
			opcion = leer.entero();
			switch (opcion) {
			case 1:
				listarAutor();
				break;
			case 2:
				menuAgregar();
				break;
			case 3:
				eliminarAutor();
				break;
			default:
				break;
			}
			
			
		} while (opcion != 4);
	}

		

	
	
}
