package pl.coderslab.get;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Get4")
public class Get4 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");

        String page = request.getParameter("page");

        int pageNumber = Integer.parseInt(page);

        response.getWriter().append("Dzielniki liczby ").append(page).append(" to: <br>");

        for (int i = 1; i <= pageNumber; i++) {
            if((pageNumber % i) == 0){
                response.getWriter().append(String.valueOf(i)).append("<br>");
            }
        }
    }
}
