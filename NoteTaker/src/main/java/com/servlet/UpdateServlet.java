package com.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;

public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			int note_id = Integer.parseInt(request.getParameter("note_id").trim());
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
		
			Session session = FactoryProvider.getFactory().openSession();
			Transaction tx = session.beginTransaction();

			//get data form database and note is in persistent state now 
			//so we can modify it
			Note note = session.get(Note.class, note_id);
			
			//System.out.print(note);
			
			note.setTitle(title);
			note.setContent(content);
			note.setAddedDate(new Date());
			
			tx.commit();
			session.close();
			
			response.sendRedirect("./all_notes.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
