package daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;




import config.bd.ConectaBd;
import dao.PersonaDao;
import modelo.Persona;

public class PersonaDaoImp implements PersonaDao{

	ConectaBd cn = new ConectaBd();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	Persona Persona = new Persona();
	

	@Override
	public List listarPersona() {
		
		ArrayList<Persona> personas = new ArrayList<>();
		String query = "select * from persona";
		
		try {
			con = cn.getConnection();
			ps = con.prepareStatement(query);
			rs= ps.executeQuery();
			while(rs.next()) {
				Persona persona = new Persona();
				persona.setId_persona(rs.getInt("id_persona"));
				persona.setNombre_persona(rs.getString("nombre"));
				persona.setApellido_persona(rs.getString("apellido"));
				persona.setEdad(rs.getInt("edad"));
				persona.setDni(rs.getString("dni"));
				persona.setTelefono(rs.getString("telefono"));
				personas.add(persona);	
			}
			
			
		} catch (Exception e) {
			System.out.println("Error: Someting were wrong");
            System.out.println(e.getMessage());
			// TODO: handle exception
		}
		return personas;
	}

	@Override
	public boolean insertarPersona(Persona persona) {
		// TODO Auto-generated method stub
		
		String query = "insert into persona (nombre, apellido, edad, dni, telefono) values ( "
				+ "'" + persona.getNombre_persona() + "' , "
				+ "'" + persona.getApellido_persona() +"' ,"
				+ persona.getEdad() + ","
				+ "'" + persona.getDni() + "' ,"
				+ "'" + persona.getTelefono() + "')";
		System.out.println(query);
		
		try {
			con = cn.getConnection();
			ps = con.prepareStatement(query);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return false;
		}
		
		return true;
	}

	@Override
	public boolean eliminarPersona(int id) {
		// TODO Auto-generated method stub
		String query = "delete from persona where id_persona = " + id;
		
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
	public Persona buscarPersona(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
