import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class servlet7 extends HttpServlet {
   public void init(ServletConfig config) throws ServletException {
      super.init(config);
   }
   public  void  doPost(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException {
      HttpSession session=request.getSession(true);
      String str=request.getParameter("letter");
      Character guessLetter=str.trim().charAt(0);
      Character savedLetter=(Character)session.getAttribute("savedLetter");
      char realLetter=savedLetter.charValue();
      if(Character.isUpperCase(guessLetter)) {
          guessLetter=Character.toLowerCase(guessLetter);
      } 
      if(guessLetter<realLetter) {
          session.setAttribute("message","猜小了");
          response.sendRedirect("servlet7_show.jsp");          
      }
      if(guessLetter>realLetter) {
          session.setAttribute("message","猜大了");
          response.sendRedirect("servlet7_show.jsp");          
      }
      if(guessLetter==realLetter){
          session.setAttribute("message","猜对了");
          response.sendRedirect("servlet7_show.jsp");          
      }
   } 
   public  void  doGet(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException {
      doPost(request,response);
   }
}
