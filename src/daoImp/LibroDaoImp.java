package daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import config.bd.ConectaBd;
import dao.LibroDao;
import modelo.Autor;
import modelo.Libro;

public class LibroDaoImp implements LibroDao {

	ConectaBd cb = new ConectaBd();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	Libro autor = new Libro();
	
	
	@Override
	public ArrayList<List> listarLibro() {
		String query = "select l.id_libro , l.nombre_libro as \"libro\", l.editorial , g.nombre_genero as \"genero\", p.nombre as \"nombre\", l.estado\n"
				+ "from libro l , autor a , generos_litearios g, persona p\n"
				+ "where l.id_genero_literario = g.id_genero_literario and l.id_autor = a.id_autor and a.id_persona = p.id_persona";
		ArrayList<List> libros = new ArrayList<>();
		
		try {
			con = cb.getConnection();
			ps = con.prepareStatement(query);
            rs = ps.executeQuery();
		
            while (rs.next()) {
				List libro = new ArrayList<>();

				libro.add(rs.getInt("id_libro"));
				libro.add(rs.getString("libro"));
				libro.add(rs.getString("editorial"));
				libro.add(rs.getString("genero"));
				libro.add(rs.getString("nombre"));
				libro.add(rs.getString("estado"));
				
				libros.add(libro);
				
			}
            
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
		return libros;
		// TODO Auto-generated method stub
	}

	@Override
	public boolean agregarLibro(Libro l) {
		// TODO Auto-generated method stub
		

		String query = "insert into libro (nombre_libro, editorial, codigo, estado, id_autor, id_genero_literario) values ( "
				+ "'" + l.getNombre_libro() + "' ,"
				+ "'" + l.getEditorial() + "' ,"
				+ "'" + l.getCodigo() + "' ,"
				+ "'" + l.getEstado() + "' ,"
				+ l.getId_autor() + ","
				+ l.getId_genero_literario()  + ")";
		
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
	public boolean eliminarLibro(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
