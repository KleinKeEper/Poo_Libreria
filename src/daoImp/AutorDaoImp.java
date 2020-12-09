package daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import config.bd.ConectaBd;
import dao.AutorDao;
import modelo.Autor;
import modelo.Libro;

public class AutorDaoImp implements AutorDao {

	
	ConectaBd cb = new ConectaBd();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	Autor Autor = new Autor();
	
	
	@Override
	public ArrayList<List> listarAutor() {
		// TODO Auto-generated method stub
		String query = "select a.id_autor , p.nombre, p.edad, a.nacionalidad\n"
				+ "from autor a , persona p\n"
				+ "where a.id_persona = p.id_persona";
		ArrayList<List> autores = new ArrayList<>();
		
		try {
			con = cb.getConnection();
			ps = con.prepareStatement(query);
            rs = ps.executeQuery();
		
            while (rs.next()) {
				List autor = new ArrayList<>();

				autor.add(rs.getInt("id_autor"));
				autor.add(rs.getString("nombre"));
				autor.add(rs.getInt("edad"));
				autor.add(rs.getString("nacionalidad"));
				autores.add(autor);
				
			}
            
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
		return autores;
	}

	@Override
	public boolean agregarAutor(Autor a) {
		// TODO Auto-generated method stub
		
		String query = "insert into autor (nacionalidad, id_persona) values ( "
				+ "'" + a.getNacionalidad() + "' ,"
				+ a.getId_persona()  + ")";
		
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
