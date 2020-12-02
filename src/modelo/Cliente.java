package modelo;

public class Cliente {

	 private int id_cliente;
	 private int id_persona;
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cliente(int id_cliente, int id_persona) {
		super();
		this.id_cliente = id_cliente;
		this.id_persona = id_persona;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public int getId_persona() {
		return id_persona;
	}
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	
	 
	 
}
