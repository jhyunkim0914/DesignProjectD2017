<%@ page contentType = "text/html;charset=utf-8" %>
<%@ page import="org.json.simple.JSONObject" %>
<%@ page import="org.json.simple.JSONArray" %>
 
<%
    response.setContentType("application/json");
 
    JSONObject obj = new JSONObject();
 
    obj.put("id", request.getAttribute("id"));
    obj.put("password", request.getAttribute("password"));
    obj.put("role", request.getAttribute("role"));
     
    response.getWriter().write(obj.toString());
%>