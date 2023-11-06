package ejemplos.servlet.curso;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/myServlet")
public class NuevoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<form action=/MyServlet2>");
        out.println("<label for='Nombre'>Nombre:</label><br>");
        out.println("<input type='text' id='Nombre' name='Nombre' value=''");
        out.println("<label for='Apellido'>Apellido:</label><br>");
        out.println("<input type='text' id='Apellido' name='Apellido' value=''");
        out.println("<input type='Enviar' value='Enviar'");
        out.println("</form></html>");


    }


}
