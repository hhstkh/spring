<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<c:url var="url" value="/category-form"/>

<sp:form method="post" action="${url}" modelAttribute="category">
	<table>
		<tr>
			<td><label for="p-name">Category Name</label></td>
			<td><sp:input path="name"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Save"></td>
		</tr>
	</table>
</sp:form>