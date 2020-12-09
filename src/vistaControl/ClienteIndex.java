package vistaControl;

import java.util.ArrayList;
import java.util.List;

import daoImp.AutorDaoImp;
import daoImp.ClienteDaoImp;
import daoImp.LibroDaoImp;
import modelo.Autor;
import modelo.Cliente;
import utils.leer;

public class ClienteIndex {

	
	

	public static void listarCliente() {
		// TODO Auto-generated method stub
		ClienteDaoImp clienteDaoImp = new ClienteDaoImp();
		ArrayList<List> clientes = clienteDaoImp.listarCliente();
		System.out.println("\t --- CLIENTES ---");
		System.out.println("ID\tNOMBRE\tAPELLIDO\tDNI");
		
		for (int i = 0; i < clientes.size(); i++) {
			
			System.out.println(clientes.get(i).get(0) 
					+ "\t" + clientes.get(i).get(1)
					+ "\t" + clientes.get(i).get(2) 
					+ "\t" + clientes.get(i).get(3) 
					);
		}
		
	}



	public static void agregarCliente() {
		// TODO Auto-generated method stub
		
		ClienteDaoImp clienteDaoImp = new ClienteDaoImp();
		
		System.out.println("\t--- AGREGAR Cliente ---");
		leer.saltoLinea(1);
		PersonaIndex personaIndex = new PersonaIndex();
		personaIndex.listarPersona();
		
		leer.saltoLinea(1);
		System.out.print("Ingresar el id de la persona: ");
		int id_persona = leer.entero();
		
		
		if (clienteDaoImp.agregarCliente(new Cliente(0, id_persona))) 
			System.out.println("Ingresado Correctamente !!!");
		else 
			System.out.println("No se agrego el registro!!!");
		
		
	}



	public static void eliminarCliente() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void menu() {
		leer.saltoLinea(1);
		System.out.println(" ---- MENU CLIENTES ----");
		System.out.println("1. Listar Clientes ");
		System.out.println("2. Agregar Clientes");
		System.out.println("3. Eliminar Clientes");
		System.out.println("4. Regresar ");

		
	}
	
	
	
	public static void menuCliente() {
		// TODO Auto-generated method stub
		int opcion;
		
		do {
			menu();
			System.out.print("Ingrese una opcion valida: ");
			opcion = leer.entero();
			switch (opcion) {
			case 1:
				listarCliente();
				break;
			case 2:
				agregarCliente();
				break;
			case 3:
				eliminarCliente();
				break;
			default:
				break;
			}
			
			
		} while (opcion != 4);
	}


	
	


}
