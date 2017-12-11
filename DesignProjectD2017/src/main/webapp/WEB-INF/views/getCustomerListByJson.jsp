<%@ page contentType = "text/html;charset=utf-8" %>
<%@ page import="org.json.simple.JSONObject" %>
<%@ page import="java.util.List" %>
<%@ page import="org.zerock.domain.*" %>
<%@ page import="org.json.simple.JSONArray" %>
 
<%
    response.setContentType("application/json");
 
    
    JSONArray list = new JSONArray();
 	
    List<CustomerVO> customerList = (List<CustomerVO>) request.getAttribute("customerList");
    
    for(int i = 0; i<customerList.size(); i++) { 	
    	JSONObject obj = new JSONObject();
    	
    	obj.put("id", customerList.get(i).getId());
    	obj.put("name", customerList.get(i).getName());
    	obj.put("email", customerList.get(i).getEmail());
    	
    	list.add(obj);
    }
     
    response.getWriter().write(list.toString());
%>