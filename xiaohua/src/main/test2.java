package main;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Hcclass;
import model.Hcclassroom;
import DB.HcclassroomDB;

/**
 * Servlet implementation class test2
 */
@WebServlet("/test2")
public class test2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doget test2");
		String courseidstr=request.getParameter("courseid");
	 
		select h from Hcclassroom h where h.courseid = 
		
		
		 int courseid= Integer.parseInt(request.getParameter("courseid"));
		
		//String coursestr=request.getParameter("courseid");
		//long courseid=7;
		//long courseid= Long.parseLong(coursestr);
		
		
	//	Hccourse course= HccourseDB.getline(courseid);
		
		
		Hcclassroom classroom = HcclassroomDB.getClassroomByID(courseid);
		
		//System.out.println(classroom.getBldgname());
		
		
		/*
		for (Hcclass hcclass : classes)
		{
			
			System.out.println(hcclass.getSemester());
			//System.out.println(hcclass.getHccourse());
			//System.out.println(hcclass.getHcclassroom());
			//System.out.println(hcclass.getHccourse().getSubjectcode());
			System.out.println(hcclass.getHcclassroom().getBldgname());
			//System.out.println(hcclass.getHccourse().getCredits());
			//System.out.println(hcclass.getHcuser().getUserid());
		}
		
		*/
		
		
		request.setAttribute("classroom", classroom);
		getServletContext().getRequestDispatcher("/test2.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}
