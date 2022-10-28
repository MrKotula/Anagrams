package ua.com.foxminded.dynamicweb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class book extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "1234");
			Statement statement = connection.createStatement();
			String url = "/index.jsp";
			int id = Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name");

			req.setAttribute("id", id);
			req.setAttribute("name", name);

			getServletContext().getRequestDispatcher(url).forward(req, resp);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
