package modelo;

public class Genero_liteario {

	private int id_genero_literario;
    private String nombre_genero;
	public Genero_liteario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Genero_liteario(int id_genero_literario, String nombre_genero) {
		super();
		this.id_genero_literario = id_genero_literario;
		this.nombre_genero = nombre_genero;
	}
	public int getId_genero_literario() {
		return id_genero_literario;
	}
	public void setId_genero_literario(int id_genero_literario) {
		this.id_genero_literario = id_genero_literario;
	}
	public String getNombre_genero() {
		return nombre_genero;
	}
	public void setNombre_genero(String nombre_genero) {
		this.nombre_genero = nombre_genero;
	}
    
    
	
}
