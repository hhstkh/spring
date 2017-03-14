function numberWithCommas(x) {
    return x.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
};

$(document).ready(function() {
    $("input[type='number']").on("keypress", function() {

    })
})
