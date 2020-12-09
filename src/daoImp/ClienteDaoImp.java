package daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import config.bd.ConectaBd;
import dao.ClienteDao;
import modelo.Autor;
import modelo.Cliente;

public class ClienteDaoImp  implements ClienteDao{

	
	ConectaBd cb = new ConectaBd();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	Cliente cliente = new Cliente();
	
	@Override
	public ArrayList<List> listarCliente() {
		// TODO Auto-generated method stub
		String query = "select c.id_cliente, p.nombre, p.apellido, p.dni from cliente c , persona p \n"
				+ "where c.id_persona = p.id_persona";
		ArrayList<List> clientes = new ArrayList<>();
		
		try {
			con = cb.getConnection();
			ps = con.prepareStatement(query);
            rs = ps.executeQuery();
		
            while (rs.next()) {
				List cliente = new ArrayList<>();

				cliente.add(rs.getInt("id_cliente"));
				cliente.add(rs.getString("nombre"));
				cliente.add(rs.getString("apellido"));
				cliente.add(rs.getString("dni"));
				clientes.add(cliente);				
			}
            
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
		return clientes;
		}

	@Override
	public boolean agregarCliente(Cliente c) {
		// TODO Auto-generated method stub
		String query = "insert into cliente (id_persona) values ( " + c.getId_persona() + ")";
		System.out.println(query);
		try {
			con = cb.getConnection();
			ps = con.prepareStatement(query);
            ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
			// TODO: handle exception
		}
		return true;
	}

	@Override
	public boolean eliminarAutor(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
