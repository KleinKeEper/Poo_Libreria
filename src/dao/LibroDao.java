package dao;

import java.util.ArrayList;
import java.util.List;

import modelo.Libro;

public interface LibroDao {

	public ArrayList<List> listarLibro();
	public boolean agregarLibro(Libro l);
	public boolean eliminarLibro(int id);
}
