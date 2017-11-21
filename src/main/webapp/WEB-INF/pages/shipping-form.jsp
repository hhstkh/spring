<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<div class="row">
	<sp:form action="" method="post" modelAttribute="customer">
		<div class="form-group">
			<label for="full_name" class="col-lg-4 control-label visible-lg-block">Full Name </label>
			<sp:input type="text" name="full_name" class="form-control address" id="full_name" value="" path="customerName"/>
		</div>
		<div class="form-group">
			<label for="telephone" class="col-lg-4 control-label visible-lg-block">Telephone</label>
			<sp:input type="tel" name="telephone" class="form-control address" id="telephone" value="" data-bv-field="telephone" path="tel"/>
		</div>
		<!-- 
		<div class="form-group">
			<label for="region_id" class="col-lg-4 control-label visible-lg-block">Tỉnh/Thành phố</label>
			
		</div>
		<div class="form-group">
			
		</div>
		<div class="form-group">
			<label for="ward_id" class="col-lg-4 control-label visible-lg-block">Phường/Xã</label>
			
		</div>
		 -->
		<div class="form-group">
			<label for="street" class="col-lg-4 control-label visible-lg-block">Address</label>
			<sp:textarea name="street" class="form-control address" id="street" data-bv-field="street" path="address"/>
		</div>
		
		<button id="btn-address" type="submit" class="btn btn-primary btn-custom3" value="create">Order Now</button>
	</sp:form>
</div>
<div class="row">
	<div class="table-responsive">
		<table class="table" id="cart-detail">
			<thead>
				<tr>
					<th></th>
					<th>Name</th>
					<th>Price</th>
					<th>Quantity</th>
					<th>Total</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${cart.cartItems}" var="cartItemMap">
					<c:set var="cartItem" value="${cartItemMap.value}" />
					<tr>
						<td><input type="hidden" name="productId"
							value="${cartItem.productId}"> <img
							src="data:image/png;base64, ${cartItem.productImageBase64}" /></td>
						<td>${cartItem.productName}</td>
						<td>${cartItem.productPrice}</td>
						<td>${cartItem.quantity}</td>
						<td>${cartItem.totalPrice}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>