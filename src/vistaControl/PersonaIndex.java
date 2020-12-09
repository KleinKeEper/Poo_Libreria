package vistaControl;

import java.util.List;

import daoImp.PersonaDaoImp;
import modelo.Persona;
import utils.leer;

public class PersonaIndex {
	
	
	public static void listarPersona() {
		PersonaDaoImp personaDaoImp = new PersonaDaoImp();
		List<Persona> personas = personaDaoImp.listarPersona();
		leer.saltoLinea(1);
		System.out.println("\t## PERSONAS ##");
		leer.saltoLinea(1);
		System.out.println("\033[0;1mID" + "\tNOMBRE Y APELLIIDO\tEDAD\tDNI\t\tTELEFONO");
		for (Persona persona : personas) {
			System.out.println("\u001B[0m" + persona.getId_persona() 
			+ "\t" + darFormato( persona.getNombre_persona() + " " + persona.getApellido_persona())
			+ "\t" + persona.getEdad() 
			+ "\t" + persona.getDni() 
			+ "\t" + persona.getTelefono());
		}
	}

	private static void agregarPersona() {
		// TODO Auto-generated method stub
		PersonaDaoImp personaDaoImp = new PersonaDaoImp();
		leer.saltoLinea(1);
		System.out.println("\t ## AGREGAR PERSONAS ## ");
		leer.saltoLinea(1);
		System.out.print("Nombre: ");
		String nombre = leer.cadena();
		System.out.print("Apellido: ");
		String apellido = leer.cadena();
		System.out.print("Edad: ");
		int edad = leer.entero();
		System.out.print("DNI: ");
		String dni = leer.cadena();
		System.out.print("Telefono: ");
		String telefono = leer.cadena();
		
		if (personaDaoImp.insertarPersona(new Persona(0, nombre, apellido, telefono, dni, edad))) 
			System.out.println("Registro insertado correctamente");
		else 
			System.out.println("El Registro no se inserto correctamente !!!!");
		
	}
	
	
	private static void eliminarersona() {
		// TODO Auto-generated method stub
		listarPersona();
		PersonaDaoImp personaDaoImp = new PersonaDaoImp();
		System.out.print("Ingrese el id de registro a eliminar : ");
		int id = leer.entero();
		
		if(personaDaoImp.eliminarPersona(id))
			System.out.println("Registro eliminado correctamente !!!");
		else 
			System.out.println("El Registro no se pudo eliminar ");
	}
	
	
	
	public static void menu() {
		leer.saltoLinea(1);
		System.out.println(" ---- MENU PERSONA ----");
		System.out.println("1. Listar Persona ");
		System.out.println("2. Agregar Persona ");
		System.out.println("3. Eliminar Persona ");
		System.out.println("4. Regresar ");

	}

	public static  void menuPersona() {
		int opcion;
		do {
			menu();
			System.out.print("Ingrese una opcion valida: ");
			opcion = leer.entero();
			
			switch (opcion) {
			case 1:
				listarPersona();
				break;
			case 2:
				agregarPersona();
				break;
			case 3:
				eliminarersona();
				break;
			default:
				break;
			}
		} while (opcion != 4);

	}
	
	

	public static String darFormato(String cadena) {
		
		if (cadena.length() >= 21) {
			cadena = cadena.substring(0, 14) + "...";
		}else if (cadena.length() >= 18) {
			return cadena;
		} else if (cadena.length() >= 8 ) {
			cadena = cadena + "\t";
		} else {
			cadena = cadena + "\t\t";
		}
		return cadena;
	}

}




