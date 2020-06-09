package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Planta;
import service.PlantaService;

/**
 * Servlet implementation class ManterEstufaController
 */
@WebServlet("/ManterPlanta.do")
public class ManterPlantaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String pAcao = request.getParameter("acao");
		String pId = request.getParameter("id");
		String pNome = request.getParameter("nome");
		String pTempMin = request.getParameter("tempMin");
		String pTempMax = request.getParameter("tempMax");
		String pUmidSoloMin = request.getParameter("umidSoloMin");
		String pUmidSoloMax = request.getParameter("umidSoloMax");	
		String pDescricao = request.getParameter("descricao");	
		int id = -1;
		try {
			id = Integer.parseInt(pId);
		} catch (NumberFormatException e) {

		}
		
		//instanciar o javabean
		Planta planta = new Planta();
		planta.setId(id);
		planta.setNome(pNome);
		planta.setTempMin(pTempMin);
		planta.setTempMax(pTempMax);
		planta.setUmidSoloMin(pUmidSoloMin);
		planta.setUmidSoloMax(pUmidSoloMax);
		planta.setDescricao(pDescricao);
		
		PlantaService ps = new PlantaService();
		RequestDispatcher view = null;
		HttpSession session = request.getSession();
				
	
	
		if (pAcao.equals("Criar")) {
			ps.criar(planta);
			ArrayList<Planta> lista = new ArrayList<>();
			lista.add(planta);
			session.setAttribute("lista", lista);
			view = request.getRequestDispatcher("ListarPlantas.jsp");
		} else if (pAcao.equals("Excluir")) {
			ps.excluir(planta.getId());
			ArrayList<Planta> lista = (ArrayList<Planta>)session.getAttribute("lista");
			lista.remove(busca(planta, lista));
			session.setAttribute("lista", lista);
			view = request.getRequestDispatcher("ListarPlantas.jsp");			
		} else if (pAcao.equals("Alterar")) {
			ps.atualizar(planta);
			ArrayList<Planta> lista = (ArrayList<Planta>)session.getAttribute("lista");
			int pos = busca(planta, lista);
			lista.remove(pos);
			lista.add(pos, planta);
			session.setAttribute("lista", lista);
			request.setAttribute("planta", planta);
			view = request.getRequestDispatcher("VisualizarPlanta.jsp");			
		} else if (pAcao.equals("Visualizar")) {
			planta = ps.carregar(planta.getId());
			request.setAttribute("planta", planta);
			view = request.getRequestDispatcher("VisualizarPlanta.jsp");		
		} else if (pAcao.equals("Editar")) {
			planta = ps.carregar(planta.getId());
			request.setAttribute("planta", planta);
			view = request.getRequestDispatcher("AlterarPlanta.jsp");		
		}
		
		view.forward(request, response);

	}
		
		
		
		
	public int busca(Planta planta, ArrayList<Planta> lista) {
		Planta to;
		for(int i = 0; i < lista.size(); i++){
			to = lista.get(i);
			if(to.getId() == planta.getId()){
				return i;
			}
		}
		return -1;
	}

}


