<%@ page contentType="text/html;charset=gb2312" %>
<HTML><body bgcolor=pink><font size=2>
 <h3>����servlet6.jsp��û��ֱ��������<br></h3>
 <h3>���ܻ��servlet6.jsp�ύ�ķǸ�����
 <br>�����ܻ��servlet6.jsp�ύ�ĸ�����
 </h3>
 <%
     String number= request.getParameter("number");
 %>
 <h2>
  <b><br>�û���servlet6.jsp����ķǸ�����<%= number%>
 </h2>
</body></HTML>
