<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="row">
	<p>
		<a href="<c:url value="/product-form"/>" target="_blank">
			<i class="fa fa-plus-circle" aria-hidden="true"></i> Add
		</a>
	</p>
</div>
<div class="row">
	<div class="col-md-12 table-responsive">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>#</th>
					<th>Product Name</th>
					<th>Price</th>
					<th>Image</th>
					<th>Category</th>
					<th>Description</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${products}" var="p">
					<tr>
						<td>#</td>
						<td>${p.productName}</td>
						<td>${p.price}</td>
						<td><img src="data:image/png;base64, ${p.imageBase64}"></td>
						<td>${p.category.name}</td>
						<td>Description</td>
						<td>
							<a href="<c:url value="/product/${p.productId}"/>" target="_blank"><i class="fa fa-eye" aria-hidden="true"></i></a>
							<a href="<c:url value="/product/edit/${p.productId}"/> " target="_blank"><i class="fa fa-pencil-square-o" aria-hidden="true"></i></a>
							<a href="<c:url value="/product/delete/${p.productId}"/> "><i class="fa fa-minus-circle" aria-hidden="true"></i></a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>