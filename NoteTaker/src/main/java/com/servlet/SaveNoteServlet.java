package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;

public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Session openSession;

	public SaveNoteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try{
			//title, content fetch
			String title  = request.getParameter("title");
			String content  = request.getParameter("content");
			
			//create object of Note
			Note note = new Note(title, content, new Date());
			//System.out.println(note);

			
			//save on database using hibernate
			Session session = FactoryProvider.getFactory().openSession();
			Transaction tx = session.beginTransaction();
			
			session.save(note);
			response.setContentType("text/html");
			response.getWriter().println("<h1 style='text-align' : center> Note is Added successfully.</h1>");
			response.getWriter().println("<h1 style='text-align' : center> <a href='all_notes.jsp'> View all notes.</a> </h1>");
			
			tx.commit();
			session.close();
									
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
