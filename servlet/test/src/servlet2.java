import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.*;
public class servlet2 extends HttpServlet{
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
   }
   public void service(HttpServletRequest request,HttpServletResponse response)
                       throws IOException{
      request.setCharacterEncoding("utf-8");
      response.setContentType("text/html;charset=utf-8");
      PrintWriter out=response.getWriter();
      out.println("<html><body bgcolor=yellow>");
      String str=request.getParameter("triangle");
      if(str==null||str.length()==0)
         return;
      String []triangle = str.split(",");
      double a=Double.parseDouble(triangle[0]);
       double b=Double.parseDouble(triangle[1]);
       double c=Double.parseDouble(triangle[2]);
       double p=(a+b+c)/2;
       double square=Math.sqrt(p*(p-a)*(p-b)*(p-c));
      out.print("三角形面积为"+square);
      out.println("</body></html>");
   } 
}
