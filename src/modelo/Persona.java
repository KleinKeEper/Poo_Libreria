package modelo;

public class Persona {
	private int id_persona;
    private String nombre_persona;
    private String apellido_persona;
    private String telefono;
    private String dni;
    private int edad;
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persona(int id_persona, String nombre_persona, String apellido_persona, String telefono, String dni, int edad) {
		super();
		this.id_persona = id_persona;
		this.nombre_persona = nombre_persona;
		this.apellido_persona = apellido_persona;
		this.telefono = telefono;
		this.dni = dni;
		this.edad = edad;
	}
	public int getId_persona() {
		return id_persona;
	}
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	public String getNombre_persona() {
		return nombre_persona;
	}
	public void setNombre_persona(String nombre_persona) {
		this.nombre_persona = nombre_persona;
	}
	public String getApellido_persona() {
		return apellido_persona;
	}
	public void setApellido_persona(String apellido_persona) {
		this.apellido_persona = apellido_persona;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
    
    
}
