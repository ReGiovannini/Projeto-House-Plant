package service;

import java.util.ArrayList;

import model.Planta;
import dao.PlantaDAO;

public class VendedorService {
	PlantaDAO dao;
	
	public VendedorService(){
		dao = new PlantaDAO();
	}
	public ArrayList<Planta> listarPlantas(){
		return dao.listarPlantas();
	}
	public ArrayList<Planta> listarPlantas(String chave){
		return dao.listarPlantas(chave);
	}

}