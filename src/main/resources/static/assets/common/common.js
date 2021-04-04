function stopLoading() {
	$("#loading").addClass('display-none');
}

function startLoading() {
	$("#loading").removeClass('display-none');
}

$(document).ready(function() {
    stopLoading();
});