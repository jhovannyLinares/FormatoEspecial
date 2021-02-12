

function cargarDistritoLocal{
	var pathArray = window.location.pathname.split('/');
	var url = '/' + pathArray[1] + '/formulario/catalogo/distritoLocal';
	if ($('#estado').val() != '') {
		url = url + '/' + $('#estado').val();
	}
	$('#divRegion').load(url);
}




function cargarRegion() {

	var pathArray = window.location.pathname.split('/');
	var url = '/' + pathArray[1] + '/formulario/catalogo/regiones';
	if ($('#estado').val() != '') {
		url = url + '/' + $('#estado').val();
	}
	$('#divRegion').load(url);
}












function cargarRegion() {

	var pathArray = window.location.pathname.split('/');
	var url = '/' + pathArray[1] + '/formulario/catalogo/regiones';
	if ($('#estado').val() != '') {
		url = url + '/' + $('#estado').val();
	}
	$('#divRegion').load(url);
}

function cargarMunicipio(element,div) {
	var pathArray = window.location.pathname.split('/');
	var url = '/' + pathArray[1] + '/formulario/catalogo/municipios';
	if (element.value != '') {
		url = url + '/' + element.value;
		$('#'+div).load(url);
	}
	
}

function cargarLocalidad(element,div) {
	var pathArray = window.location.pathname.split('/');
	var url = '/' + pathArray[1] + '/formulario/catalogo/localidades';
	if (element.value != '') {
		url = url + '/' + element.value;
		$('#'+div).load(url);
	}
}


function cargarLocalidad2(element,div) {
	var pathArray = window.location.pathname.split('/');
	var url = '/' + pathArray[1] + '/formulario/catalogo/localidades2';
	if (element.value != '') {
		url = url + '/' + element.value;
		$('#'+div).load(url);
	}
}


function cargarDocumentos() {

	var pathArray = window.location.pathname.split('/');
	var url = '/' + pathArray[1] + '/formulario/catalogo/parentesco';
	if ($('#parentesco').val() != '') {
		url = url + '/' + $('#parentesco').val();
	}
	console.log("###### URL: "+ url)
	$('#divDocumentos').load(url);
}

function cargarDocumentos2() {

	var pathArray = window.location.pathname.split('/');
	var url = '/' + pathArray[1] + '/formulario/catalogo/parentesco2';
	if ($('#parentesco2').val() != '') {
		url = url + '/' + $('#parentesco2').val();
	}
	console.log("###### URL: "+ url)
	$('#divDocumentos2').load(url);
}

function cargarDocumentos3() {

	var pathArray = window.location.pathname.split('/');
	var url = '/' + pathArray[1] + '/formulario/catalogo/parentesco3';
	if ($('#parentesco').val() != '') {
		url = url + '/' + $('#parentesco').val();
	}
	console.log("###### URL: "+ url)
	$('#divDocumentos').load(url);
}

function cargarEscolaridad(input, mont,esc) {
	var monto = document.getElementById(mont)
	var idescolaridad = document.getElementById(esc).value;
	if (idescolaridad == 1) {
		monto.value = "$ 360.00";
	} else if (idescolaridad == 2) {
		monto.value = "$ 600.00";
	} else if (idescolaridad == 3) {
		monto.value = "$ 845.00";
	} else if (idescolaridad == 4 || idescolaridad == 5) {
		monto.value = "$ 1,090.00";
	} else if (idescolaridad == 6) {
		monto.value = "$ 1,200.00";
	} else{
		monto.value=null;
	}
}

