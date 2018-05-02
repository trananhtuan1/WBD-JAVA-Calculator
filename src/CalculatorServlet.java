import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import static java.lang.String.*;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/aa")
public class CalculatorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double firstOperand = Double.parseDouble(request.getParameter("firstOperand"));
        Double secondOperand = Double.parseDouble(request.getParameter("secondOperand"));
        String operator = request.getParameter("operator");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result: </h1>");
        switch (operator) {
            case "+":
                writer.println(firstOperand + " + " + secondOperand + " = " + (firstOperand + secondOperand));
                break;
            case "-":
                writer.println(firstOperand + " - " + secondOperand + " = " + (firstOperand - secondOperand));
                break;
            case "*":
                writer.println(firstOperand + " * " + secondOperand + " = " + (firstOperand * secondOperand));
                break;
            case "/":
                writer.println(firstOperand + " / " + secondOperand + " = " + (firstOperand / secondOperand));
                break;
            default:
        }
        writer.println("</html>");
    }
}

