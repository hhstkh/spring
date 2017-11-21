function Cart() {
    this.grantTotal = 0;
}

Cart.prototype.calculateTotal = function($output) {
    var total = 0;
    $output.each(function(idx, el) {
        total += parseFloat(el.value);
    })

    this.grantTotal = total;
};

$(document).ready(function($) {
	$("#add-to-cart").submit(function(event) {
		// Prevent the form from submitting via the browser.
		event.preventDefault();
		
		var data = {};
		var $form = $(this),
			url = $form.attr("action"),
			$qty = $form.find("input[name='buyQty']"),
			$productId = $form.find("input[name='product-id']");
			
		
		data["buyQty"] = parseInt($qty.val());
		data["productId"] = parseInt($productId.val());
	
		$.ajax({
			type : "POST",
			url : url,
			dataType: "json",
			data: { 
				productId: data["productId"], 
				buyQty: data["buyQty"],
			},
			success : function(result) {
				var $cartCount = $("#cart-count");
				if (result) {
					$cartCount.html(result.numberOfItems);
				}
			},
			error : function(e) {
				console.log("ERROR: ", e);
			}
		});
		

	});
	
	$("#cart-detail .js-quantity-select").change(function() {
		var $select = $(this);
		var $tr = $select.closest("tr");
		var $inputId = $tr.find("input[name='productId']");
		$.ajax({
			type : "POST",
			url : $("#updateQtyUrl").html(),
			dataType: "json",
			data: { 
				productId: $inputId.val(), 
				buyQty: $select.val(),
			},
			success : function(result) {
				location.reload();
			},
			error : function(e) {
				console.log("ERROR: ", e);
			}
			
		});
	});
	
	$("#bike-statistic").submit(function(event) {
		var $form = $(this);
		
		var date = $form.find("select[name='date']").val(),
			month = $form.find("select[name='month']").val(),
			year = $form.find("select[name='year']").val();
		
		var isValid = true;
		var msg = "";
		
		if (!year) {
			msg = "<p>Please year.</p>";
		}
		if (!month) {
			msg += "<p>Please month.</p>";
		}
		if (!date && !month) {
			msg += "<p>Please date.</p>";
		}
		
		if (msg) {
			event.preventDefault();
			$(".error").html(msg);
		}
		
	})
});