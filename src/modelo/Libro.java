package modelo;

public class Libro {
	private int id_libro;
    private String nombre_libro;
    private String editorial;
    private int codigo;
    private String estado;
    private int id_genero_literario;
    private int id_autor;
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Libro(int id_libro, String nombre_libro, String editorial, int codigo, String estado,
			int id_genero_literario, int id_autor) {
		super();
		this.id_libro = id_libro;
		this.nombre_libro = nombre_libro;
		this.editorial = editorial;
		this.codigo = codigo;
		this.estado = estado;
		this.id_genero_literario = id_genero_literario;
		this.id_autor = id_autor;
	}
	public int getId_libro() {
		return id_libro;
	}
	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}
	public String getNombre_libro() {
		return nombre_libro;
	}
	public void setNombre_libro(String nombre_libro) {
		this.nombre_libro = nombre_libro;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getId_genero_literario() {
		return id_genero_literario;
	}
	public void setId_genero_literario(int id_genero_literario) {
		this.id_genero_literario = id_genero_literario;
	}
	public int getId_autor() {
		return id_autor;
	}
	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}

    
    
    
}
