<font color = "red">
<%
out.println(request.getAttribute("error"));
%>

<form action="logincheck" method="post">
Username :-  <input  type="text " name="usname"><br><br>
password :-  <input type="text"name="password">
<br> <br>
 <input type="submit"value="sign in"/>

</form>