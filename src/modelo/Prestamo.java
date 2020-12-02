package modelo;

public class Prestamo {
	
	 private int id_prestamo;
	    private String f_prestamo;
	    private String f_devolucion;
	    private String estado;
	    private int id_cliente;
	    private int id_libro;
		public Prestamo() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Prestamo(int id_prestamo, String f_prestamo, String f_devolucion, String estado, int id_cliente,
				int id_libro) {
			super();
			this.id_prestamo = id_prestamo;
			this.f_prestamo = f_prestamo;
			this.f_devolucion = f_devolucion;
			this.estado = estado;
			this.id_cliente = id_cliente;
			this.id_libro = id_libro;
		}
		public int getId_prestamo() {
			return id_prestamo;
		}
		public void setId_prestamo(int id_prestamo) {
			this.id_prestamo = id_prestamo;
		}
		public String getF_prestamo() {
			return f_prestamo;
		}
		public void setF_prestamo(String f_prestamo) {
			this.f_prestamo = f_prestamo;
		}
		public String getF_devolucion() {
			return f_devolucion;
		}
		public void setF_devolucion(String f_devolucion) {
			this.f_devolucion = f_devolucion;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		public int getId_cliente() {
			return id_cliente;
		}
		public void setId_cliente(int id_cliente) {
			this.id_cliente = id_cliente;
		}
		public int getId_libro() {
			return id_libro;
		}
		public void setId_libro(int id_libro) {
			this.id_libro = id_libro;
		}
	    
	    
	    

}
