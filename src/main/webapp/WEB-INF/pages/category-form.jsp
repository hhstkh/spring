<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<c:url var="url" value="/category-form"/>

<sp:form method="post" action="${url}" modelAttribute="category">
	<div class="form-group">
		<label for="c-name">Category Name</label>
		<sp:input path="name" id="c-name" class="form-control"/>
	</div>
	<button type="submit" class="btn btn-default">Submit</button>
	
</sp:form>