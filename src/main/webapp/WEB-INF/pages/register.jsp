<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<div class="row">
	<h2>Welcome to you</h2>
	<form:form method = "POST" action = "/register" modelAttribute="customer">
		<table>
			<tr>
				<td><form:label path="email"><spring:message code="email"/> </form:label></td>
				<td><form:input path="email"/> </td>
			</tr>
			<tr>
				<td><form:label path="password"><spring:message code="password"/>  </form:label> </td>
				<td><form:input path="password"/> </td>
			</tr>
			<tr>
				<td> <input type="submit" value='<spring:message code="submit"/>'> </td>
			</tr>
		</table>
	</form:form>

</div>