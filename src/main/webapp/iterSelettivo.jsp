<%@ page import="it.contrader.dto.IterSelettivoDTO" import="java.util.*"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="User Management">
<meta name="author" content="Vittorio Valent">
<link href="/css/vittoriostyle.css" rel="stylesheet">
<title>Iter Selettivo Manager</title>

</head>
<body>
	<%@ include file="./css/header.jsp"%>

	<div class="navbar">
		<a href="/homeadmin.jsp">Home</a> <a class="active"
			href="/iterSelettivo/getall">Iter Selettivo</a> <a href="/user/logout" id="logout">Logout</a>
	</div>
	<div class="main">
		<%
			List<IterSelettivoDTO> list = (List<IterSelettivoDTO>) request.getSession().getAttribute("list");
		%>

		<br>

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
				<th></th>
				<th></th>
			</tr>
			<%
				for (IterSelettivoDTO is : list) {
			%>
			<tr>
				<td><a href="/iterSelettivo/read?idIterSelettivo=<%=is.getIdIterSelettivo()%>"> <%=is.getIdIterSelettivo()%>
				</a></td>
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
				<td><a href="/iterSelettivo/preupdate?idIterSelettivo=<%=is.getIdIterSelettivo()%>">Edit</a></td>


				<td><a href="/iterSelettivo/delete?idIterSelettivo=<%=is.getIdIterSelettivo()%>">Delete</a></td>

			</tr>
			<%
				}
			%>
		</table>

<p>
<br> <br>
Dopo aver inizializzato la candidatura, ogni candidato esegue un iter selettivo che ne testa le capacità tramite un test scritto ed un colloquio orale, il tutto supervisionato da 
<br>un membro dello staff.         
<br>          
</p>



		
		<form id="floatleft" action="/iterSelettivo/insert" method="post">
		Inserisci un nuovo Iter Selettivo
			<div class="row">
				<div class="col-25">
					<label for="idIS">ID IterSelettivo</label>
				</div>
				<div class="col-75">
					<input type="text" id="idIS" name="idIterSelettivo"
						placeholder="inserisci l'id dell'iter selettivo">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="idCa">ID Candidato</label>
				</div>
				<div class="col-75">
					<input type="text" id="idCa" name="idCandidato"
						placeholder="inserisci l'id del cadidato">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="idSt">ID Staff</label>
				</div>
				<div class="col-75">
					<input type="text" id="idSt" name="idStaff"
						placeholder="inserisci l'id del membro dello staff che segue l'iter">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="pTotSc">Punteggio Totale Scritto</label>
				</div>
				<div class="col-75">
					<input type="text" id="pTotSc" name="punteggioTotaleScritto"
						placeholder="inserisci il punteggio totale della prova scritta">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="pLog">Punteggio Logica</label>
				</div>
				<div class="col-75">
					<input type="text" id="pLog" name="punteggioLogica"
						placeholder="inserisci il punteggio di logica">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="pPhp">Punteggio Php</label>
				</div>
				<div class="col-75">
					<input type="text" id="pPhp" name="punteggioPhp"
						placeholder="inserisci il punteggio di Php">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="pJava">Punteggio Java</label>
				</div>
				<div class="col-75">
					<input type="text" id="pJava" name="punteggioJava"
						placeholder="inserisci il punteggio di Java">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="pHTML">Punteggio HTML</label>
				</div>
				<div class="col-75">
					<input type="text" id="pHTML" name="punteggioHTML"
						placeholder="inserisci il punteggio di HTML">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="pIng">Punteggio Inglese</label>
				</div>
				<div class="col-75">
					<input type="text" id="pIng" name="punteggioInglese"
						placeholder="inserisci il punteggio di inglese">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="daTS">Data Prova Scritta</label>
				</div>
				<div class="col-75">
					<input type="text" id="daTS" name="dataTestScritto"
						placeholder="quando si è svolto il test scritto?">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="daTO">Data Colloquio Orale</label>
				</div>
				<div class="col-75">
					<input type="text" id="daTo" name="dataTestOrale"
						placeholder="quando si è svolto il colloquio orale?">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="valOr">Valutazione Orale</label>
				</div>
				<div class="col-75">
					<input type="text" id="valOr" name="valutazioneOrale"
						placeholder="inserisci la valutazione del colloquio orale">
				</div>
			</div>
			
			<button type="submit">Insert</button>
		</form>

	</div>
	<br>
	<%@ include file="./css/footer.jsp"%>
</body>
</html>