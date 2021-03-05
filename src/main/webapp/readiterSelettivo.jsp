<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="it.contrader.dto.IterSelettivoDTO"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Iter Selettivo Read">
<meta name="author" content="Vittorio Valent">
<link href="/css/vittoriostyle.css" rel="stylesheet">
<title>Read Iter Selettivo</title>
</head>
<body>
	<%@ include file="./css/header.jsp"%>
	<div class="navbar">
		<a href="/homeadmin.jsp">Home</a> <a class="active"
			href="/iterSelettivo/getall">Iter Selettivo</a> <a href="/user/logout" id="logout">Logout</a>
	</div>
	<br>

	<div class="main">
		<%
			IterSelettivoDTO is = (IterSelettivoDTO) request.getSession().getAttribute("dto");
		%>


		<table>
			<tr>
				<th>ID Iter Selettivo</th>
				<th>ID Candidato</th>
				<th>ID Staff</th>
				<th>Punteggio Totale Scritto</th>
				<th>Punteggio Logica</th>
				<th>Punteggio Php</th>
				<th>Punteggio Java</th>
				<th>Punteggio HTML</th>
				<th>Punteggio Inglese</th>
				<th>Data Test Scritto</th>
				<th>Data Colloquio Orale</th>
				<th>Valutazione Orale</th>
			</tr>
			<tr>
				<td><%=is.getIdIterSelettivo()%></td>
				<td><%=is.getIdCandidato()%></td>
				<td><%=is.getIdStaff()%></td>
				<td><%=is.getPunteggioTotaleScritto()%></td>
				<td><%=is.getPunteggioLogica()%></td>
				<td><%=is.getPunteggioPhp()%></td>
				<td><%=is.getPunteggioJava()%></td>
				<td><%=is.getPunteggioHTML()%></td>
				<td><%=is.getPunteggioInglese()%></td>
				<td><%=is.getDataTestScritto()%></td>
				<td><%=is.getDataTestOrale()%></td>
				<td><%=is.getValutazioneOrale()%></td>
			</tr>
		</table>

		<br> <br> <br> <br> <br> <br> <br>
		<br> <br> <br> <br> <br> <br> <br>


	</div>

	<%@ include file="./css/footer.jsp"%>
</body>
</html>