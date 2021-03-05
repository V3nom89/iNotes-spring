     <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*"
	import="it.contrader.dto.StaffDTO"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Staff Management">
<meta name="author" content="Vittorio Valent">
<link href="/css/vittoriostyle.css" rel="stylesheet">
<title>Candidati Manager</title>
</head>
<body>
<%@ include file="./css/header.jsp"%>

<div class="navbar">
  <a href="/homeadmin.jsp">Home</a> <a class="active"
			href="/staff/getall">Staff</a> <a href="/staff/logout" id="logout">Logout</a>
</div>
<div class="main">
	<%
	       List<StaffDTO> list = (List<StaffDTO>) request.getSession().getAttribute("list");
	%>

<br>

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
			<th></th>
			<th></th>
			
		</tr>
		<%
		    for (StaffDTO s: list) {
		%>
		<tr>
			<td><a href="/staff/read?idStaff=<%=s.getIdStaff()%>"> <%=s.getIdStaff()%></a></td>
			
			<td><%=s.getNome()%></td>
			<td><%=s.getCognome()%></td>
			<td><%=s.getEmail() %></td>
			<td><%=s.getPosizione()%></td>
			<td><%=s.getNumeroTelefono()%></td>
			<td><%=s.getDataAssunzione()%></td>
			<td><%=s.getSede()%></td>
			<td><%=s.getOreSettimanali()%></td>
			<td><%=s.getCodiceFiscale()%></td>
			
			
			<td><a href="/staff/preupdate?idStaff=<%=s.getIdStaff()%>">Edit</a></td>
			
			<td><a href="/staff/delete?idStaff=<%=s.getIdStaff()%>">Delete</a></td>

		</tr>
		<%
			}
		%>
	</table>



<form id="floatright" action="/staff/insert"  method="post">
<div class="row">
    <div class="col-25">
      <label for="staff">id Staff</label>
    </div>
    <div class="col-75">
      <input type="text" id="staff" name="idStaff" placeholder="inserisci idstaff">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="name">Nome</label>
    </div>
    <div class="col-75">
      <input type="text" id="name" name="nome" placeholder="inserisci il nome del membro dello staff">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
     <label for="lastname">Cognome</label>
    </div>
    <div class="col-75">
      <input type="text" id="lastname" name="cognome" placeholder="inserisci il cognome del membro dello staff"> 
    </div>
  </div>
  <div class="row">
    <div class="col-25">
     <label for="mail">Email</label>
    </div>
    <div class="col-75">
      <input type="text" id="mail" name="email" placeholder="inserisci l'email"> 
    </div>
  </div>
  
  <div class="row">
    <div class="col-25">
     <label for="pos">Posizione</label>
    </div>
    <div class="col-75">
      <input type="text" id="pos" name="posizione" placeholder="inserisci la posizione"> 
    </div>
  </div>
  
  <div class="row">
    <div class="col-25">
     <label for="num">Numero di Telefono</label>
    </div>
    <div class="col-75">
      <input type="number" id="num" name="numeroTelefono" placeholder="inserisci il numero di telefono"> 
    </div>
  </div>
  
  <div class="row">
    <div class="col-25">
     <label for="dat">Data Assunzione</label>
    </div>
    <div class="col-75">
      <input type="text" id="dat" name="dataAssunzione" placeholder="inserisci la data di assunzione"> 
    </div>
  </div>
  <div class="row">
    <div class="col-25">
     <label for="sed">Sede</label>
    </div>
    <div class="col-75">
      <input type="text" id="sed" name="sede" placeholder="inserisci la sede"> 
    </div>
  </div>
  <div class="row">
    <div class="col-25">
     <label for="ora">Ore Settimanali</label>
    </div>
    <div class="col-75">
      <input type="text" id="ora" name="oreSettimanali" placeholder="inserisci le ore settimanali lavorate dal membro dello staff"> 
    </div>
  </div>
  
  <div class="row">
    <div class="col-25">
     <label for="cod">Codice Fiscale</label>
    </div>
    <div class="col-75">
      <input type="text" id="cod" name="codiceFiscale" placeholder="inserisci il codice fiscale"> 
    </div>
  </div>
  
      <button type="submit" >Insert</button>
</form>

</div>
<br>
<%@ include file="./css/header.jsp"%>
</body>
</html>
    