<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tka.entity.Sport" %>
<%

ArrayList<Sport> splayer = (ArrayList<Sport>) request.getAttribute("Sportsperson");

for(Sport sport : splayer)
{
	out.println(sport.getPid());
	out.println(sport.getPname());
	out.println(sport.getPage());
}

%>