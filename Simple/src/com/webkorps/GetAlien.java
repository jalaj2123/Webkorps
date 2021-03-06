package com.webkorps;
import com.webkorps.model.Alien;
import com.webkorps.Dao.AlienDao;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GetAlien
 */
@WebServlet("/GetAlien")
public class GetAlien extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAlien() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int aid =Integer.parseInt(request.getParameter("aid"));
		AlienDao dao=new AlienDao();
		Alien a=dao.getAlien(aid);
		HttpSession session=request.getSession();
		session.setAttribute("a1", a);
	        RequestDispatcher rd=request.getRequestDispatcher("Show.jsp");
	           rd.forward(request,response);
	}

}
