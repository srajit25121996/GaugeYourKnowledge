

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestTimer extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public TestTimer() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		PrintWriter out=response.getWriter();
		 out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
	      out.write("<html>\r\n");
	      out.write("<head>\r\n");
	      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
	      out.write("<title>Insert title here</title>\r\n");
	      out.write("\r\n");
	      out.write("<div style=\"font-weight: bold\" id=\"quiz-time-left\"></div>\r\n");
	      out.write("<script type=\"text/javascript\">\r\n");
	      out.write("var max_time = 10;\r\n");
	      out.write("var c_seconds  = 0;\r\n");
	      out.write("var total_seconds =60*max_time;\r\n");
	      out.write("max_time = parseInt(total_seconds/60);\r\n");
	      out.write("c_seconds = parseInt(total_seconds%60);\r\n");
	      out.write("alert(max_time);\r\n");
	      out.write("document.getElementById(\"quiz-time-left\").innerHTML='Time Left: ' + max_time + ' minutes ' + c_seconds + ' seconds';\r\n");
	      out.write("function init(){\r\n");
	      out.write("document.getElementById(\"quiz-time-left\").innerHTML='Time Left: ' + max_time + ' minutes ' + c_seconds + ' seconds';\r\n");
	      out.write("setTimeout(\"CheckTime()\",999);\r\n");
	      out.write("}\r\n");
	      out.write("function CheckTime(){\r\n");
	      out.write("document.getElementById(\"quiz-time-left\").innerHTML='Time Left: ' + max_time + ' minutes ' + c_seconds + ' seconds' ;\r\n");
	      out.write("if(total_seconds <=0){\r\n");
	      out.write("setTimeout('document.quiz.submit()',1);\r\n");
	      out.write("    \r\n");
	      out.write("    } else\r\n");
	      out.write("    {\r\n");
	      out.write("total_seconds = total_seconds -1;\r\n");
	      out.write("max_time = parseInt(total_seconds/60);\r\n");
	      out.write("c_seconds = parseInt(total_seconds%60);\r\n");
	      out.write("setTimeout(\"CheckTime()\",999);\r\n");
	      out.write("}\r\n");
	      out.write("\r\n");
	      out.write("}\r\n");
	      out.write("init();\r\n");
	      out.write("</script>\r\n");
	      out.write("\r\n");
	      out.write("</head>\r\n");
	      out.write("<body>\r\n");
	      out.write("\r\n");
	      out.write("</body>\r\n");
	      out.write("</html>");
		
		
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
