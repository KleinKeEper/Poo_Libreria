package vistaControl;

import utils.leer;

public class Index {

	private static PersonaIndex personaIndex;
	private static AutorIndex autorIndex;
	private static GeneroLiterarioIndex generoLiterarioIndex;
	private static LibroIndex libroIndex;
	private static PrestamoIndex prestamoIndex;
	private static ClienteIndex clienteIndex;

	public static void menu() {
		System.out.println("\t --- MENU PRINCIPAL ---");
		System.out.println("1. Gestionar Personas");
		System.out.println("2. Gestionar Autores");
		System.out.println("3. Gestionar Generos Literarios");
		System.out.println("4. Gestionar Libros");
		System.out.println("5. Gestionar Clientes");
		System.out.println("6. Prestamos");
		System.out.println("6  Salir");
	}

	public static void main(String[] args) {
		int opcion;

		do {
			menu();
			System.out.print("Ingrese una opcion valida: ");
			opcion = leer.entero();
			switch (opcion) {
			case 1:
				personaIndex.menuPersona();
				break;
			case 2:
				autorIndex.menuAutor();
				break;
			case 3:
				generoLiterarioIndex.menuGenero();
				break;
			case 4:
				libroIndex.menuLibro();
				break;
			case 5:
				clienteIndex.menuCliente();
				break;
			case 6:
				prestamoIndex.menuPrestamo();
				break;
			default:
				break;
			}
		} while (opcion != 7);

	}
}
