<%@ page contentType="text/html;charset=utf-8" %>
<jsp:useBean id="hm" class="bean.human" scope="request"/>
<HTML><body bgcolor=cyan>
   <br><form action="three" method="post">
       身高：<input type="text" name="height">
       体重：<input type="text" name="weight">
       年龄：<input type="text" name="age">
    <input type="submit" value="提交">
</form>
    <jsp:setProperty name="hm" property="height" param="height"/>
    <jsp:setProperty name="hm" property="weight" param="weight"/>
    <jsp:setProperty name="hm" property="age" param="age"/>
</body></HTML>
