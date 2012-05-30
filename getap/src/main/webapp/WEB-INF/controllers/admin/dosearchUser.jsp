<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<h3 class="titre3">Recherche d'utilisateur</h3>

<c:if test="${empty users}">
	Aucun utilisateur trouv�.
</c:if>

<c:if test="${not empty users}">
	<div id="demo">
	<table class="display dataTable">
		<thead>
			<tr class="header">
				<th>Nom/Pr�nom</th>
				<th>Login</th>
				<th>Role</th>
				<th>Classe</th>
				<th>Modifier</th>
				<th>Supprimer</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${users}" var="user">
				<tr>
					<td style="text-align:left;">${user.nom} ${user.prenom}</td>
					<td>${user.login}</td>
					<td>${user.role}</td>
					<td>${user.classe.nom}</td>
					<td><a
						href="<c:url value="/app/admin/editUser?id=${user.id}" />"><img
							src="../../images/modif.png"
							onmouseover="this.src='../../images/modifHover.png';"
							onmouseout="this.src='../../images/modif.png';" /></a></td>
					<td><a href=""
						onclick="if(confirm('Voulez-vous vraiment supprimer cet utilisateur ?')){window.location.href='delUser/${user.id}';}"><img
							src="../../images/suppr.png"
							onmouseover="this.src='../../images/supprHover.png';"
							onmouseout="this.src='../../images/suppr.png';" /></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</c:if>

<div class="buttonGroup">
	<a href="<c:url value="/app/admin/index" />"> <input type="button"
		value="Retour � l'index">
	</a>
</div>