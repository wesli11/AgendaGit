package service;

import java.util.ArrayList;
import java.util.List;

import model.Persona;

public class AgendaServiceImpl implements AgendaService{

	       List<Persona> lista=new ArrayList<>();
	@Override
	public void insertarContacto(Persona p) {
           		lista.add(p);
	}
	
	public Persona buscarPersona(int id) {
		System.out.println("metodo agregado");
		return lista.get(id);   
	}

	@Override
	public void metodoDelTeams() {
     System.out.println("METODO DEL OTRO EQUIPO");		
	}

}
