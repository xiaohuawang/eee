package main;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Hcclass;
import model.Hcuser;
import DB.HcclassDB;
import DB.HcuserDB;

/**
 * Servlet implementation class Classbyinstructor
 */
@WebServlet("/Classroombystudent")
public class Classroombystudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Classroombystudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println("doget classbyinstructor");
		

        
		int userid = Integer.parseInt(request.getParameter("userid"));
		System.out.println(userid);
		
		Hcuser hcuser=HcuserDB.getStudentByID(userid);
		
		List<Hcclass> list=HcclassDB.getclass(hcuser);
		//
		//hcuser.setName("bb");
		
		
		//List<Hcclass> list=HcclassDB.(hcuser);
		//List<Hcclass> list=HcclassDB.getclass(hcuser);
		
		
	//System.out.println(hcclass.getSemester());
	//System.out.println(hcclass.getSemester());	
	//System.out.println(hcclass.getSemester());
	
		request.setAttribute("list", list);
		getServletContext().getRequestDispatcher("/disroombystudent.jsp").forward(request, response);
		
		
		
		
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}
