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
import model.Root;
import service.ThingSpeakService;
import service.VendedorService;

/**
 * Servlet implementation class ThingspeakController
 */
@WebServlet("/AlertaUmidSolo.do")
public class AlertaUmidSoloController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlertaUmidSoloController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String umidSoloMin = request.getParameter("umidSoloMin");
		String umidSoloMax = request.getParameter("umidSoloMax");
		
        Root dataInfoObject=ThingSpeakService.getDataInfo();
        String xumidSolo = dataInfoObject.getFeeds().get(0).getField3();
        int yumidSolo = Integer.parseInt(xumidSolo);
                       
        request.setAttribute("umidSoloMin", umidSoloMin);
        request.setAttribute("umidSoloMax", umidSoloMax);
        
        //sensores
        request.setAttribute("umidSolo", yumidSolo);
        
        VendedorService vendedor = new VendedorService();
        ArrayList<Planta> lista = null;
        lista = vendedor.listarPlantas();       
                
        HttpSession session = request.getSession();
        session.setAttribute("thingspeak", dataInfoObject);
        session.setAttribute("lista", lista);
        
        RequestDispatcher dispatcher = request
				.getRequestDispatcher("AlertaUmidSolo.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}