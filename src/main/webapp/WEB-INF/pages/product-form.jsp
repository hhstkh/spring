<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<c:url var="url" value="/product-form"/>
<c:url var="ckeditorPath" value="/resources/3rdParty/ckeditor"/>
<sp:form method="post" action="${url}"  modelAttribute="product" enctype="multipart/form-data">
	<sp:input type="hidden" path="productId"/>
	<sp:input type="hidden" path="productImg"/>
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
	<div>
		<img alt="" src="data:image/png;base64, ${product.imageBase64}">
	</div>
	<div class="form-group">
		<label for="p-desc">Description</label>
		<sp:textarea cols="80" id="p-desc" path="description" rows="10"/>
	</div>
	<div class="form-group">
		<label for="p-category">Category</label>
		<sp:select multiple="single" path="category">
			<sp:options items="${categories}"  itemValue="id" itemLabel="name" />
		</sp:select>
	</div>
	<button type="submit" class="btn btn-default">Submit</button>
</sp:form>
<ckeditor:replace replace="p-desc" basePath="${ckeditorPath }" />