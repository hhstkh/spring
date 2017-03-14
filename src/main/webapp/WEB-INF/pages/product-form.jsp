<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<c:url var="url" value="/product-form"/>
<sp:form method="post" action="${url}"  modelAttribute="product" enctype="multipart/form-data">
	<div class="form-group">
		<label for="p-name">Product Name</label>
		<sp:input type="text" id="p-name" class="form-control" path="productName"/>
	</div>
	<div class="form-group">
		<label for="p-price">Product Price</label>
		<sp:input type="number" id="p-price" class="form-control" path="price"/>
	</div>
	<div class="form-group">
		<label for="p-img">Product Image</label>
		<sp:input type="file" path="multipartFiles"/>
	</div>
	<div class="form-group">
		<label for="p-category">Category</label>
		<sp:select multiple="single" path="category">
			<sp:options items="${categories}"  itemValue="id" itemLabel="name" />
		</sp:select>
	</div>
	<button type="submit" class="btn btn-default">Submit</button>
</sp:form>