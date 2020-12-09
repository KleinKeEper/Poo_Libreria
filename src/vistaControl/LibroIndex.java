package vistaControl;

import java.util.ArrayList;
import java.util.List;

import daoImp.AutorDaoImp;
import daoImp.LibroDaoImp;
import modelo.Autor;
import modelo.Libro;
import utils.leer;

public class LibroIndex {

	
	
	private static void eliminarLibro() {
		// TODO Auto-generated method stub
		
	}


	private static void agregarLibro() {
		// TODO Auto-generated method stub
		LibroDaoImp libroDaoImp = new LibroDaoImp();
		
		System.out.println("\t--- AGREGAR LIBRO ---");
		leer.saltoLinea(1);
		System.out.print("Nombre Libro: ");
		String nombre_libro = leer.cadena();
		System.out.print("Editorial: ");
		String editorial = leer.cadena();
		System.out.print("Codigo: ");
		String codigo = leer.cadena();
		System.out.print("Estado: ");
		String estado = leer.cadena();
		
		AutorIndex autorIndex = new AutorIndex();
		autorIndex.listarAutor();
		leer.saltoLinea(1);
		System.out.print("Ingresar el id de la autor: ");
		int id_autor = leer.entero();
		leer.saltoLinea(1);
		
		GeneroLiterarioIndex generoLiterarioIndex = new GeneroLiterarioIndex();
		generoLiterarioIndex.listarGeneros();
		System.out.print("Ingresar id del genero: ");
		int id_genero_literario = leer.entero();
		
		if (libroDaoImp.agregarLibro(new Libro(0, nombre_libro, editorial, codigo, estado, id_genero_literario, id_autor))) 
			System.out.println("Ingresado Correctamente !!!");
		else 
			System.out.println("No se agrego el registro!!!");
	}


	private static void listarLibro() {
		// TODO Auto-generated method stub
		LibroDaoImp libroDaoImp = new LibroDaoImp();
		ArrayList<List> libros = libroDaoImp.listarLibro();
		System.out.println("\t --- LIBROS ---");
		System.out.println("ID\tLIBRO\tEDITORIAL\tGENERO\tAUTOR\tESTADO");
		
		for (int i = 0; i < libros.size(); i++) {
			
			System.out.println(libros.get(i).get(0) 
					+ "\t" + libros.get(i).get(1)
					+ "\t" + libros.get(i).get(2) 
					+ "\t" + libros.get(i).get(3) 
					+ "\t" + libros.get(i).get(4) 
					+ "\t" + libros.get(i).get(5) 
					);
		}
		
		
	}

	
	public static void menu() {
		leer.saltoLinea(1);
		System.out.println(" ---- MENU LIBROS ----");
		System.out.println("1. Listar Libros ");
		System.out.println("2. Agregar Libros");
		System.out.println("3. Eliminar Libros");
		System.out.println("4. Regresar ");
	}
	
	
	public static void menuLibro() {
		// TODO Auto-generated method stub
		
		int opcion;
		
		do {
			menu();
			System.out.print("Ingrese una opcion valida: ");
			opcion = leer.entero();
			switch (opcion) {
			case 1:
				listarLibro();
				break;
			case 2:
				agregarLibro();
				break;
			case 3:
				eliminarLibro();
				break;
			default:
				break;
			}
			
			
		} while (opcion != 4);
		
	}


	

}
