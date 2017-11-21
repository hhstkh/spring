<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/admin/satictis/bike" var="url" />
<h2>Bike Revenue in</h2>
<div class="error"></div>
<div class="container">
	<div class="row">
		<form class="form-inline" action="${url}" id="bike-statistic">
			<div class="form-group">
				<label for="date">Date</label> <select id="date" name="date">
					<option value="">Please choose a date</option>
					<c:forEach var="d" begin="1" end="31">
						<option value="${d}">${d}</option>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label for="month">Month</label> <select id="month" name="month">
					<option value="">Please choose a month</option>
					<c:forEach var="m" begin="1" end="12">
						<option value="${m}">${m}</option>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label for="year">Year</label> <select id="year" name="year">
					<option value="">Please choose a year</option>
					<c:forEach var="y" begin="2006" end="2020">
						<option value="${y}">${y}</option>
					</c:forEach>
				</select>
			</div>
			<button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>
	<table class="table-striped">
		<thead>
			<tr>
				<th>#</th>
				<th>Name</th>
				<th>Image</th>
				<th>Price</th>
				<th>Category</th>
				<th>Quantity</th>
				<th>Total</th>
			</tr>
		</thead>
		<tbody>
			<tr>
			</tr>
			<tr>
				<td colspan="5">Grant Total</td>
				<td>10000</td>
			</tr>
		</tbody>
	</table>
</div>