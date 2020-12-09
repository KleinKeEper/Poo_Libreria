package dao;

import java.util.List;

import modelo.Genero_liteario;
import modelo.Persona;

public interface Genero_LiterarioDao {

	public List listarGenerosLiterarios();
    public boolean insertarGeneros(Genero_liteario genero);
    public boolean eliminarGeneros(int id);
	
	
}
