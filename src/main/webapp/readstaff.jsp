  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="it.contrader.dto.StaffDTO"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Staff Read">
<meta name="author" content="Vittorio Valent">
<link href="/css/vittoriostyle.css" rel="stylesheet">
<title>Read Candidati</title>
</head>
<body>
<%@ include file="./css/header.jsp"%>
<div class="navbar">
 <a href="/homeadmin.jsp">Home</a> <a class="active"
			href="/staff/getall">Candidati</a> <a href="/staff/logout" id="logout">Logout</a>
 
</div>
<br>

<div class="main">
<%StaffDTO s = (StaffDTO) request.getSession().getAttribute("dto");%>


<table>
	<tr> 
		        <th>IdStaff</th>
		        <th>Nome</th>
		        <th>Cognome</th>
                <th>Email</th>
                <th>Posizione</th>
                <th>NumeroTelefono</th>
                <th>dataAssunzione</th>
                <th>Sede</th>
                <th>OreSettimanali</th>
                <th>CodiceFiscale</th>
	</tr>
	<tr>
		        <td><%=s.getIdStaff()%></td>
		        <td> <%=s.getNome()%></td>
		        <td> <%=s.getCognome()%></td>
                <td> <%=s.getEmail()%></td>
                <td> <%=s.getPosizione()%></td>
                <td> <%=s.getNumeroTelefono()%></td>
                <td> <%=s.getDataAssunzione()%></td>
                <td> <%=s.getSede()%></td>
                <td> <%=s.getOreSettimanali()%></td>
                <td> <%=s.getCodiceFiscale()%></td>
			
	</tr>	
</table>

<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>


</div>

<%@ include file="./css/header.jsp"%>
</body>
</html>