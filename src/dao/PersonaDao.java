package dao;

import java.util.List;

import modelo.Persona;



public interface PersonaDao {
	
	public List listarPersona();
    public boolean insertarPersona(Persona persona);
    public boolean eliminarPersona(int id);
    public Persona buscarPersona(int id);

}
