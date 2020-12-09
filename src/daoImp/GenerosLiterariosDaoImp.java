package daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import config.bd.ConectaBd;
import dao.Genero_LiterarioDao;
import modelo.Genero_liteario;

public class GenerosLiterariosDaoImp implements Genero_LiterarioDao {

	ConectaBd cn = new ConectaBd();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	Genero_liteario genero_litearios = new Genero_liteario();
	
	
	@Override
	public List listarGenerosLiterarios() {
		// TODO Auto-generated method stub
		ArrayList<Genero_liteario> generos = new ArrayList<>();
		String query = "select * from generos_litearios";
		
		try {
			con = cn.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				Genero_liteario genero_liteario  = new Genero_liteario();	
				genero_liteario.setId_genero_literario(rs.getInt("id_genero_literario"));
				genero_liteario.setNombre_genero(rs.getString("nombre_genero"));
				generos.add(genero_liteario);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		return generos;
	}

	@Override
	public boolean insertarGeneros(Genero_liteario genero) {
		// TODO Auto-generated method stub
		String query = "insert into generos_litearios(nombre_genero) values ( '" + genero.getNombre_genero()  + "')";
		try {
			con = cn.getConnection();
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
	public boolean eliminarGeneros(int id) {
		// TODO Auto-generated method stub
		String query = "delete from generos_literarios where id_genero_literario = " + id;
		
		try {
			con = cn.getConnection();
			ps = con.prepareStatement(query);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
			// TODO: hadle exception
		}
		return true;
	}

}
