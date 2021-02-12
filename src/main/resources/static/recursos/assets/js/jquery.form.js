

function cargarDistritoLocal(element,div) {
	var pathArray = window.location.pathname.split('/');
	var url = 'catalogo/distritoFederal/'+ element.value  +'/distritoLocal';

		$('#'+div).load(url);
	
}

function cargarMunicipio(element,div) {
	var pathArray = window.location.pathname.split('/');
	var url = 'catalogo/distritoLocal/'+ element.value  +'/municipio';

		$('#'+div).load(url);
	
}

function cargarSeccion(element,div) {
	var pathArray = window.location.pathname.split('/');
	var url = 'catalogo/municipio/'+ element.value  +'/seccion';

		$('#'+div).load(url);
	
}

function cargarLocalidad(element,div) {
	var pathArray = window.location.pathname.split('/');
	var url = 'catalogo/seccion/'+ element.value  +'/localidad';

		$('#'+div).load(url);
	
}


function sololetras(e) {
	key = e.keyCode || e.which;

	teclado = String.fromCharCode(key).toLowerCase();

	letras = "qwertyuiopasdfghjklñzxcvbnm ";

	especiales = "8-37-38-46-164";

	teclado_especial = false;

	for (var i in especiales) {
		if (key == especiales[i]) {
			teclado_especial = true;
			break;
		}
	}

	if (letras.indexOf(teclado) == -1 && !teclado_especial) {
		return false;
	}
}

function solonumeros(e) {
	key = e.keyCode || e.which;

	teclado = String.fromCharCode(key).toLowerCase();

	letras = "1234567890 ";

	especiales = "8-37-38-46-164";

	teclado_especial = false;

	for (var i in especiales) {
		if (key == especiales[i]) {
			teclado_especial = true;
			break;
		}
	}

	if (letras.indexOf(teclado) == -1 && !teclado_especial) {
		return false;
	}
}

