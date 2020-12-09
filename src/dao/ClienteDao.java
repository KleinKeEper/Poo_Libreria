package dao;

import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;

public interface ClienteDao {

	public ArrayList<List> listarCliente();
	public boolean agregarCliente(Cliente c);
	public boolean eliminarAutor(int id);
}
