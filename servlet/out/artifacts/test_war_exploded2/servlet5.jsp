<%@ page contentType="text/html;charset=gb2312" %>
<HTML><body bgcolor=yellow >
<form action="five" method=post>
  输入数字，用逗号分隔提交给servlet求和(post方式)：
  <br><input type=text name="number">
  <input type=submit value="提交">
</form>
<form action="five" method=get>
   输入数字，用逗号分隔提交给servlet求积(get方式)：
  <br><input type=text name="number">
  <input type=submit value="提交">
</form>
<img src="getpost.png">
</body></HTML>
