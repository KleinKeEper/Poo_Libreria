package modelo;

public class Autor {

	private int id_autor;    
    private String nacionalidad;
    private int id_persona;
	
    public Autor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Autor(int id_autor, String nacionalidad, int id_persona) {
		super();
		this.id_autor = id_autor;
		this.nacionalidad = nacionalidad;
		this.id_persona = id_persona;
	}

	public int getId_autor() {
		return id_autor;
	}

	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getId_persona() {
		return id_persona;
	}

	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	
    
    
    
}
