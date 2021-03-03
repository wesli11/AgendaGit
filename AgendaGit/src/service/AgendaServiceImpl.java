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

}
