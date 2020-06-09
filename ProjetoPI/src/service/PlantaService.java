package service;

import dao.PlantaDAO;
import model.Planta;


public class PlantaService {
	PlantaDAO dao = new PlantaDAO();
		
	public int criar(Planta planta) {
		return dao.criar(planta);
	}
	
	public void atualizar(Planta planta){
		dao.atualizar(planta);
	}
	
	public void excluir(int id){
		dao.excluir(id);
	}
	
	public Planta carregar(int id){
		return dao.carregar(id);
	}

}	