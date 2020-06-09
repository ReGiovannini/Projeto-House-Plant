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
@WebServlet("/AlertaTemp.do")
public class AlertaTempController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlertaTempController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String tempMin = request.getParameter("tempMin");
		String tempMax = request.getParameter("tempMax");
		
        Root dataInfoObject=ThingSpeakService.getDataInfo();
        String xtemp = dataInfoObject.getFeeds().get(0).getField1();
        int ytemp = Integer.parseInt(xtemp);        
        
        request.setAttribute("tempMin", tempMin);
        request.setAttribute("tempMax", tempMax);   
        
        //sensores
        request.setAttribute("temp", ytemp);
        
        VendedorService vendedor = new VendedorService();
        ArrayList<Planta> lista = null;
        lista = vendedor.listarPlantas();
    
        HttpSession session = request.getSession();
        session.setAttribute("thingspeak", dataInfoObject);
        session.setAttribute("lista", lista);
        
        RequestDispatcher dispatcher = request
				.getRequestDispatcher("AlertaTemp.jsp");
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
