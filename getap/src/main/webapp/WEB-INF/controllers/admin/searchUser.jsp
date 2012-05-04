<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<h1>Rechercher un utilisateur</h1>

<form:form modelAttribute="userSearchCriteria" action="dosearchUser"
	method="get">
	<form:errors path="*" cssClass="errors" />
	
		<div class="input">
			<form:input path="query" />
		</div>
		
		<br/>
	
	<div id="buttonGroup">
		<a href="<c:url value="/app/admin/index" />"
			style="text-decoration: none"><input type="button"
			value="Retour"> 
		</a> 
		<input type="submit" value="Rechercher" />
	</div>
</form:form>
