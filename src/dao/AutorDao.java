package dao;

import java.util.ArrayList;
import java.util.List;

import modelo.Autor;
import modelo.Libro;

public interface AutorDao {
	
	public ArrayList<List> listarAutor();
	public boolean agregarAutor(Autor a);
	public boolean eliminarAutor(int id);

}
