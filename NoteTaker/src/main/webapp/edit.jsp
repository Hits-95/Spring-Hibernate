<%@page import="com.entities.Note"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Page</title>
<%@include file="/all_js_css.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>
		<br>
		<h1>Edit your note</h1>

		<%
			int note_id = Integer.parseInt(request.getParameter("note_id".trim()));
			
			//get data from databse
			Session s = FactoryProvider.getFactory().openSession();

			Note note = s.get(Note.class, note_id);
		%>
		<!-- this is add form -->
		<form action="UpdateServlet" method="post">
			<input value="<%=note.getId() %> " name="note_id" type="hidden"/>
			<div class="form-group">
				<label for="title"> Note Title </label> <input name="title"
					type="text" required class="form-control" id="title"
					aria-describedby="emailHelp" value="<%=note.getTitle()%>">
			</div>

			<div class="form-group">
				<label for="content">Note Content</label>
				<textarea name="content" id="content" required class="form-control"
					style="height: 300px"><%=note.getContent()%></textarea>
			</div>

			<div class="container text-center">
				<button type="submit" class="btn btn-success">Save your note</button>
			</div>
		</form>
	</div>

</body>
</html>