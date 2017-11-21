<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<c:url var="url" value="/checkout/addOrUpdateProduct" />
<section>
	<h2>Order Detail</h2>
	<span id="updateQtyUrl" style="display: none">${url}</span>
	<div class="row">
		<div class="col-lg-8">
			<div class="row title">
				<span>${cart.numberOfItems} sp</span>
			</div>

			<div class="table-responsive">
				<table class="table" id="cart-detail">
					<thead>
						<tr>
							<th></th>
							<th></th>
							<th>Name</th>
							<th>Price</th>
							<th>Quantity</th>
							<th>Total</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${cart.cartItems}" var="cartItemMap">
							<c:set var="cartItem" value="${cartItemMap.value}"/>
							<tr>
								<td>
									<a href="<c:url value="/checkout/remove/${cartItem.productId}"/>"><i class="fa fa-times" aria-hidden="true"></i></a>
								</td>
								<td><input type="hidden" name="productId"
									value="${cartItem.productId}"> <img
									src="data:image/png;base64, ${cartItem.productImageBase64}" /></td>
								<td>${cartItem.productName}</td>
								<td>${cartItem.productPrice}</td>
								<td><select
									class="form-control js-quantity-select quantity js-quantity-product">
										<c:forEach var="i" begin="1" end="10">
											<c:choose>
												<c:when test="${cartItem.quantity eq i}">
													<option value="${i}" selected="${i}">${i}</option>
												</c:when>
												<c:otherwise>
													<option value="${i}">${i}</option>
												</c:otherwise>
											</c:choose>
										</c:forEach>
								</select></td>
								<td>${cartItem.totalPrice}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		<div class="col-lg-4">
			<p>Total ${cart.grandTotal}</p>
			<a href="<c:url value="/checkout/shipping"/> ">Payment</a>
		</div>
	</div>


</section>