$(document).ready(function() {
	$('div.bd-callout-info:not(.active)').find('input, textarea, select').attr('disabled','disabled');
	
	var index = document.getElementById("indice").value;
	if(index==1){
		document.getElementById('prev').style.visibility = 'hidden';
    }

});

// Example starter JavaScript for disabling form submissions if there are
// invalid fields
(function () {
	'use strict';
	window.addEventListener('load', function () {
		// Fetch all the forms we want to apply custom Bootstrap validation
		// styles to
		var forms = document.getElementsByClassName('needs-validation');
		// Loop over them and prevent submission
		var validation = Array.prototype.filter.call(forms, function (form) {
			
			form.addEventListener('submit', function (event) {
				
				if (form.checkValidity() === false) {
					
					event.preventDefault();
					event.stopPropagation();
					form.classList.add('was-validated');
					
				}else{	
					
					var op1 = document.getElementById("solIncorporacion");
					var op2 = document.getElementById("aux");
					var op3 = document.getElementById("baja");
					var op4 = document.getElementById("pagoMarcha")
					var op5 = document.getElementById("correccionActDatos");
					var op6 = document.getElementById("revicionDatos");
					var op7 = document.getElementById("medioCobro");
					
					var cadenaFinal = "";
					
					var tramitesSelect = "";
					
					if (op1.checked==true){
						cadenaFinal = document.getElementById("tramite-1").value +",";
						tramitesSelect = "1" + ",";
										}
					if (op2.checked==true){
						cadenaFinal = cadenaFinal + document.getElementById("tramite-2").value +",";
						tramitesSelect = tramitesSelect+  "2" + ",";
					}
					if (op3.checked==true){
						cadenaFinal = cadenaFinal + document.getElementById("tramite-3").value +",";
						tramitesSelect = tramitesSelect+  "3" + ",";
					}
					if (op4.checked==true){
						cadenaFinal = cadenaFinal + document.getElementById("tramite-4").value +",";
						tramitesSelect = tramitesSelect+  "4" + ",";
					}
					if (op5.checked==true){
						cadenaFinal = cadenaFinal + document.getElementById("tramite-5").value +",";
						tramitesSelect = tramitesSelect+  "5" + ",";
					}
					if (op6.checked==true){
						cadenaFinal = cadenaFinal + document.getElementById("tramite-6").value +",";
						tramitesSelect = tramitesSelect+  "6" + ",";
					}
					if (op7.checked==true){
						cadenaFinal = cadenaFinal + document.getElementById("tramite-7").value;
						tramitesSelect = tramitesSelect+  "7";
					}
					
					document.getElementById("tramite").value = tramitesSelect;

					var index = parseInt(document.getElementById("indice").value);
					var array = cadenaFinal.split(",");
				
					let sinRepetidos = [...new Set(array)];
					
					document.getElementById("camino").value = sinRepetidos;
					
					for (var x=0;x<sinRepetidos.length;x++){
						// 	document.write(a[x] + " ");
						if(parseInt(sinRepetidos[x]) > index ){
							index = sinRepetidos[x];
							x=sinRepetidos.length;
						}
					}
					
					if(index!=100){
						
						event.preventDefault();
						$('.needs-validation').removeClass('was-validated');
						var $current = $('.bd-callout-info.active');
						$('.bd-callout-info').removeClass('active');

						if(op1.checked==true){
							document.getElementById('altaAux').checked = true;
							document.getElementsByName('tipoSolicitud').disabled = true;
						}else{
							document.getElementsByName('tipoSolicitud').disabled = false;
						}

						$('.bd-callout-info').next('.'+index).addClass('active');
						
						document.getElementById("indice").value=index;
						document.getElementById('prev').style.visibility = 'visible';

						
	
				    	activar();
			    	
					}
			    	
				}
				
				
				
			}, false);
		});
	}, false);
})();



function cargarMotivosCobro() {

	var pathArray = window.location.pathname.split('/');
	var url = '/' + pathArray[1] + '/formulario/catalogo/tipoMedioCobro';
	if ($('#tipoMedioCobro').val() != '') {
		url = url + '/' + $('#tipoMedioCobro').val();
		console.log("####### url inicial"+url);
	}
	console.log("###### URL: "+ url)
	$('#divMotivoMedioCobro').load(url);
	
	var id=document.getElementById("tipoMedioCobro").value;
	switch (parseInt(id)) {
	case 1:
		document.getElementById("folioCobro").disabled=true;
		document.getElementById("folioCobro").classList.add('readonly');
		
		document.getElementById("tarjetaCobro").disabled=false;
		document.getElementById("cuentaCobro").disabled=false;
		document.getElementById("clabeCobro").disabled=false;
		document.getElementById("motivoCobro").disabled=false;
		
		document.getElementById("tarjetaCobro").removeAttribute('readonly');
		document.getElementById("tarjetaCobro").classList.remove('readonly');
		document.getElementById("cuentaCobro").removeAttribute('readonly');
		document.getElementById("cuentaCobro").classList.remove('readonly');
		document.getElementById("clabeCobro").removeAttribute('readonly');
		document.getElementById("clabeCobro").classList.remove('readonly');
		document.getElementById("motivoCobro").removeAttribute('readonly');
		document.getElementById("motivoCobro").classList.remove('readonly');
		
		document.getElementById("banco").disabled=false;
		document.getElementById("banco").removeAttribute('readonly');
		document.getElementById("banco").classList.remove('readonly');
		
		
		break;
	case 2:
		document.getElementById("folioCobro").disabled=true;
		document.getElementById("folioCobro").classList.add('readonly');
		
		document.getElementById("tarjetaCobro").disabled=false;
		document.getElementById("cuentaCobro").disabled=false;
		document.getElementById("clabeCobro").disabled=false;
		document.getElementById("motivoCobro").disabled=false;
		
		document.getElementById("tarjetaCobro").removeAttribute('readonly');
		document.getElementById("tarjetaCobro").classList.remove('readonly');
		document.getElementById("cuentaCobro").removeAttribute('readonly');
		document.getElementById("cuentaCobro").classList.remove('readonly');
		document.getElementById("clabeCobro").removeAttribute('readonly');
		document.getElementById("clabeCobro").classList.remove('readonly');
		document.getElementById("motivoCobro").removeAttribute('readonly');
		document.getElementById("motivoCobro").classList.remove('readonly');
		
		document.getElementById("banco").disabled=false;
		document.getElementById("banco").removeAttribute('readonly');
		document.getElementById("banco").classList.remove('readonly');
		
		break;
	case 3:
		document.getElementById("tarjetaCobro").disabled=true;
		document.getElementById("tarjetaCobro").classList.add('readonly');
		
		document.getElementById("cuentaCobro").disabled=true;
		document.getElementById("cuentaCobro").classList.add('readonly');
		
		document.getElementById("clabeCobro").disabled=true;
		document.getElementById("clabeCobro").classList.add('readonly');
		
		document.getElementById("folioCobro").disabled=false;
		document.getElementById("motivoCobro").disabled=false;
		
	
		document.getElementById("folioCobro").removeAttribute('readonly');
		document.getElementById("folioCobro").classList.remove('readonly');
		document.getElementById("motivoCobro").removeAttribute('readonly');
		document.getElementById("motivoCobro").classList.remove('readonly');
		
		document.getElementById("banco").disabled=true;
		document.getElementById("banco").classList.add('readonly');
		
		
		break;
	case 4:
		document.getElementById("tarjetaCobro").disabled=true;
		document.getElementById("tarjetaCobro").classList.add('readonly');
		
		document.getElementById("cuentaCobro").disabled=true;
		document.getElementById("cuentaCobro").classList.add('readonly');
		
		document.getElementById("clabeCobro").disabled=true;
		document.getElementById("clabeCobro").classList.add('readonly');
		
		document.getElementById("folioCobro").removeAttribute('readonly');
		document.getElementById("folioCobro").classList.remove('readonly');
		document.getElementById("motivoCobro").removeAttribute('readonly');
		document.getElementById("motivoCobro").classList.remove('readonly');
		
		document.getElementById("banco").disabled=true;
		document.getElementById("banco").classList.add('readonly');
		
		break;
	case 5:
		document.getElementById("folioCobro").disabled=true;
		document.getElementById("folioCobro").classList.add('readonly');
		
		document.getElementById("motivoCobro").disabled=true;
		document.getElementById("motivoCobro").classList.add('readonly');
		document.getElementById("motivoCobro").setAttribute('disabled','disabled');
		
		document.getElementById("tarjetaCobro").disabled=false;
		document.getElementById("cuentaCobro").disabled=false;
		document.getElementById("clabeCobro").disabled=false;
		
		
		document.getElementById("tarjetaCobro").removeAttribute('readonly');
		document.getElementById("tarjetaCobro").classList.remove('readonly');
		document.getElementById("cuentaCobro").removeAttribute('readonly');
		document.getElementById("cuentaCobro").classList.remove('readonly');
		document.getElementById("clabeCobro").removeAttribute('readonly');
		document.getElementById("clabeCobro").classList.remove('readonly');
		
		document.getElementById("banco").disabled=false;
		document.getElementById("banco").removeAttribute('readonly');
		document.getElementById("banco").classList.remove('readonly');

		break;
	default:
		break;
	}
	
}


function nobackbutton() {
	window.location.hash = "no-back-button";
	window.location.hash = "Again-No-back-button" // chrome
	window.onhashchange = function () {
		window.location.hash = "no-back-button";
	}
}


$(document).ready(
	function () {

		$("#fechaNacimiento").keyup(
			function (e) {
				if (e.keyCode != 191) {
					if (e.keyCode != 8) {
						if ($(this).val().length == 2) {
							$(this).val($(this).val() + "/");
						} else if (e.keyCode == 86 &&
							$(this).val().length == 4) {
							$(this).val(
								$(this).val().substr(0, 2) +
								"/" +
								$(this).val()
								.substr(2, 2) +
								"/" +
								$(this).val()
								.substr(4, 4));
						} else if ($(this).val().length == 5) {
							$(this).val($(this).val() + "/");

						}
					} else {
						if ($(this).val().length == 4) {
							$(this).val($(this).val().substring(0, 4));
						} else if ($(this).val().length == 2) {
							$(this).val($(this).val().substring(0, 1));
						}

					}
				} else {
					$(this).val(
						$(this).val().substring(0,
							$(this).val().length - 1));
				}

			});
		$("#fecha").keyup(
			function (e) {
				if (e.keyCode != 191) {
					if (e.keyCode != 8) {
						if ($(this).val().length == 2) {
							$(this).val($(this).val() + "/");
						} else if (e.keyCode == 86 &&
							$(this).val().length == 4) {
							$(this).val(
								$(this).val().substr(0, 2) +
								"/" +
								$(this).val()
								.substr(2, 2) +
								"/" +
								$(this).val()
								.substr(4, 4));
						} else if ($(this).val().length == 5) {
							$(this).val($(this).val() + "/");

						}
					} else {
						if ($(this).val().length == 4) {
							$(this).val($(this).val().substring(0, 4));
						} else if ($(this).val().length == 2) {
							$(this).val($(this).val().substring(0, 1));
						}

					}
				} else {
					$(this).val(
						$(this).val().substring(0,
							$(this).val().length - 1));
				}

			});
	});

$(function () {
	$(".input-number").keydown(
		function (event) {
			// alert(event.keyCode);
			if ((event.keyCode < 48 || event.keyCode > 57) &&
				(event.keyCode < 96 || event.keyCode > 105) &&
				event.keyCode !== 190 && event.keyCode !== 110 &&
				event.keyCode !== 8 && event.keyCode !== 9) {
				return false;
			}
		});
});

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

function soloTexto(e) {
	key = e.keyCode || e.which;

	teclado = String.fromCharCode(key).toLowerCase();

	letras = "qwertyuiopasdfghjklñzxcvbnm 1234567890";

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


if(document.getElementById("nombre")!=null){
	document.getElementById("nombre").addEventListener("keydown", teclear);
	document.getElementById("paterno").addEventListener("keydown", teclear);
	document.getElementById("materno").addEventListener("keydown", teclear);
	document.getElementById("colonia").addEventListener("keydown", teclear);
	document.getElementById("calle").addEventListener("keydown", teclear);
	document.getElementById("claveElector").addEventListener("keydown", teclear);
	document.getElementById("noExterior").addEventListener("keydown", teclear);
	document.getElementById("noInterior").addEventListener("keydown", teclear);
	document.getElementById("manzana").addEventListener("keydown", teclear);
	document.getElementById("lote").addEventListener("keydown", teclear);
	document.getElementById("referecia1").addEventListener("keydown", teclear);
	document.getElementById("referecia2").addEventListener("keydown", teclear);
	document.getElementById("referecia2").addEventListener("keydown", teclear);
}

if(document.getElementById("nombreAux")!=null){
	document.getElementById("nombreAux").addEventListener("keydown", teclear);
	document.getElementById("paternoAux").addEventListener("keydown", teclear);
	document.getElementById("maternoAux").addEventListener("keydown", teclear);
	document.getElementById("coloniaAux").addEventListener("keydown", teclear);
	document.getElementById("calleAux").addEventListener("keydown", teclear);
	document.getElementById("claveElectorAux").addEventListener("keydown", teclear);
	document.getElementById("noExteriorAux").addEventListener("keydown", teclear);
	document.getElementById("noInteriorAux").addEventListener("keydown", teclear);
	document.getElementById("manzanaAux").addEventListener("keydown", teclear);
	document.getElementById("loteAux").addEventListener("keydown", teclear);
}
	

var flag = false;
var teclaAnterior = "";

function teclear(event) {
	teclaAnterior = teclaAnterior + " " + event.keyCode;
	var arregloTA = teclaAnterior.split(" ");
	if (event.keyCode == 32 && arregloTA[arregloTA.length - 2] == 32) {
		event.preventDefault();
	}
}


function validFechaNac(input,campo) {
	var Fnac = input.value;
	var Sfecha = Fnac.toString();
	var desf = Sfecha.split('-');
	var Fconcatenada = desf[2] + "/" + desf[1] + "/" + desf[0];
	console.log(Fconcatenada);


	let fechValida = validarFecha(Fconcatenada);

	if (fechValida) {
		input.setCustomValidity("");


		var fech = new Date(desf[0], desf[1] - 1, desf[2]);
		var ed = edad(fech);
		document.getElementById(campo).value = ed;
		document.getElementById("edadC").value = ed;
		var idPrograma = document.getElementById('programa').value;

		if ((ed < 65 && idPrograma == 1) || ed > 130) {
			input.setCustomValidity("was-validated");

		} else {
			input.setCustomValidity("");
		}

	} else {
		input.setCustomValidity("Invalid field");
		console.log("No es una fecha valida");

	}

}


//Fecha para los hijos de jefa de familia hijos de hasta 23 años
function validFechaNacHijosJefasFam(input,campo) {
	var Fnac = input.value;
	var Sfecha = Fnac.toString();
	var desf = Sfecha.split('-');
	var Fconcatenada = desf[2] + "/" + desf[1] + "/" + desf[0];
	console.log(Fconcatenada);

	let fechValida = validarFecha(Fconcatenada);

	if (fechValida) {
		input.setCustomValidity("");


		var fech = new Date(desf[0], desf[1] - 1, desf[2]);
		var ed = edad(fech);
		document.getElementById(campo).value = ed;
		document.getElementById("edadHijosJefas").value = ed;
		var idPrograma = document.getElementById('programa').value;

		if ((ed >= 0 ) || ed < 24) {
			input.setCustomValidity("was-validated");

		} else {
			input.setCustomValidity("");
		}

	} else {
		input.setCustomValidity("Invalid field");
		console.log("No es una fecha valida");

	}

}



function is_ceros(input) {
	
	if (input.value.length > 0) {
	
		var valor = parseInt(input.value);
		if(valor==0){
			input.setCustomValidity("Invalid field");
		}else{
			input.setCustomValidity("");
		}
	}else{
		input.setCustomValidity("");
	}
}


function validFechaNac18(input) {
	var Fnac = document.getElementById("fechaNacimientoAux").value;
	var Sfecha = Fnac.toString();
	var desf = Sfecha.split('-');
	var Fconcatenada = desf[2] + "/" + desf[1] + "/" + desf[0];
	console.log(Fconcatenada);


	let fechValida = validarFecha(Fconcatenada);

	if (fechValida) {
		document.getElementById("fechaNacimientoAux").setCustomValidity("");


		var fech = new Date(desf[0], desf[1] - 1, desf[2]);
		var ed = edad(fech);
		document.getElementById("edadAux").value = ed;

		if (ed < 18) {
			document.getElementById("fechaNacimientoAux").setCustomValidity("was-validated");

		} else {
			document.getElementById("fechaNacimientoAux").setCustomValidity("");
		}

	} else {
		document.getElementById("fechaNacimientoAux").setCustomValidity("Invalid field");
		console.log("No es una fecha valida");

	}

}

function edad(Fecha) {

	fecha = new Date(Fecha)
	console.log(Fecha);
	hoy = new Date()
	ed = parseInt((hoy - fecha) / 365 / 24 / 60 / 60 / 1000)
	return ed;
}

// Devuelve el regex para validar una fecha.
// - dividido en variables para que se entienda y se pueda mantener/editar.
//
function regexValidarFecha() {
	let sep = "[/]",

		dia1a28 = "(0?[1-9]|1\\d|2[0-8])",
		dia29 = "(29)",
		dia29o30 = "(29|30)",
		dia31 = "(31)",

		mes1a12 = "(0?[1-9]|1[0-2])",
		mes2 = "(0?2)",
		mesNoFeb = "(0?[13-9]|1[0-2])",
		mes31dias = "(0?[13578]|1[02])",

		diames29Feb = dia29 + sep + mes2,
		diames1a28 = dia1a28 + sep + mes1a12,
		diames29o30noFeb = dia29o30 + sep + mesNoFeb,
		diames31 = dia31 + sep + mes31dias,
		diamesNo29Feb = "(?:" + diames1a28 + "|" + diames29o30noFeb + "|" + diames31 + ")",

		anno1a9999 = "(0{2,3}[1-9]|0{1,2}[1-9]\\d|0?[1-9]\\d{2}|[1-9]\\d{3})",
		annoMult4no100 = "\\d{1,2}(?:0[48]|[2468][048]|[13579][26])",
		annoMult400 = "(?:0?[48]|[13579][26]|[2468][048])00",
		annoBisiesto = "(" + annoMult4no100 + "|" + annoMult400 + ")",

		fechaNo29Feb = diamesNo29Feb + sep + anno1a9999,
		fecha29Feb = diames29Feb + sep + annoBisiesto,

		fechaFinal = "^(?:" + fechaNo29Feb + "|" + fecha29Feb + ")$";


	return new RegExp(fechaFinal);
}


// Valida que la fecha ingresada no sea menor al 01/01/2019
//
function validarFechaMinima(input) {
	
	
	
	var Fnac = input.value;
	var Sfecha = Fnac.toString();
	var desf = Sfecha.split('-');
	var Fconcatenada = desf[2] + "/" + desf[1] + "/" + desf[0];

	
	console.log(Fconcatenada);
	
	let fechValida = validarFecha(Fconcatenada);
	
	if (fechValida) {
		
		fechaMinima = new Date('12/31/2018');
		fechaMaxima = new Date();
		fechaIn = new Date(desf[1] + "/" + desf[2] + "/" + desf[0]);
		
		if( (fechaMinima < fechaIn) && (fechaIn < fechaMaxima) ){
			input.setCustomValidity("");
		}else{
			input.setCustomValidity("Invalid date");
		}	
	}
}

// Valida una fecha ingresada como "m/d/aaaa"
// - Si no es válida, devuelve false
// - Si es válida, devuelve un objeto {d:"día",m:"mes",a:"año",date:date}
// - Parámetro: UTC (opcional) si se debe devolver {date:(date)} en UTC
//
function validarFecha(texto) {
	var UTC = false;
	let fechaValida = regexValidarFecha(),
		grupos;
	if (grupos = fechaValida.exec(texto)) {
		// Unir día mes y año desde los grupos que pueden haber coincidido
		let d = [grupos[1], grupos[3], grupos[5], grupos[8]].join(''),
			m = [grupos[2], grupos[4], grupos[6], grupos[9]].join(''),
			a = [grupos[7], grupos[10]].join(''),
			date = new Date(0);

		// Obtener la fecha en formato local o UTC
		if (UTC) {
			date.setUTCHours(0);
			date.setUTCFullYear(a, parseInt(m, 10) - 1, d);
		} else {
			date.setHours(0);
			date.setFullYear(a, parseInt(m, 10) - 1, d);
		}
		// Devolver como objeto con cada número por separado
		return true;
	}
	return false; // No es fecha válida
}

function validaTelefono(input) {
	var telefono = input.value;
	
	var tamanoTel = telefono.length;

	var locatel = 56581111;
	var teleton = 5553212223;
	
	if (telefono != "") {
		if (telefono == locatel) {
			input.setCustomValidity("Invalid field");
		} else if (telefono == teleton) {
			input.setCustomValidity("Invalid field");
		} else if (tamanoTel<10){
			input.setCustomValidity("Invalid field");
		}else{
			input.setCustomValidity("");
			is_ceros(input);
			
		}
	}else{
		input.setCustomValidity("");
	}
	
	

}
	


function curpValida(curp) {
	var re = /^([A-Z][AEIOUX][A-Z]{2}\d{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[12]\d|3[01])[HM](?:AS|B[CS]|C[CLMSH]|D[FG]|G[TR]|HG|JC|M[CNS]|N[ETL]|OC|PL|Q[TR]|S[PLR]|T[CSL]|VZ|YN|ZS)[B-DF-HJ-NP-TV-Z]{3}[A-Z\d])(\d)$/,
		validado = curp.match(re);

	if (!validado) // Coincide con el formato general?
		return false;

	// Validar que coincida el dígito verificador
	function digitoVerificador(curp17) {
		// Fuente https://consultas.curp.gob.mx/CurpSP/
		var diccionario = "0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ",
			lngSuma = 0.0,
			lngDigito = 0.0;
		for (var i = 0; i < 17; i++)
			lngSuma = lngSuma + diccionario.indexOf(curp17.charAt(i)) * (18 - i);
		lngDigito = 10 - lngSuma % 10;
		if (lngDigito == 10) return 0;
		return lngDigito;
	}

	if (validado[2] != digitoVerificador(validado[1]))
		return false;

	return true; // Validado
}


// Handler para el evento cuando cambia el input
// Lleva la CURP a mayúsculas para validarlo
function validarInput(input) {
	var curp = input.value.toUpperCase(),
		resultado = document.getElementById("curp");
	// valido = "No válido";
	var valido = curpValida(curp);
	console.log("valido:::::" + valido)
	if (valido) { // ⬅️ Acá se comprueba
		// valido = "Válido";
		document.getElementById("curp").setCustomValidity("");
	} else {
		document.getElementById("curp").setCustomValidity("Invalid field");
	}

}
//---- valida si el id sera requerido
function id_Requerido(value){
	var requerido=document.getElementById("idTramite");
	var op=document.getElementById("solIncorporacion"); 
	if(op.checked==true){
		document.getElementById("idUnico").required = false;
	}else{
		document.getElementById("idUnico").required = true;
	}
}
//---- valida si las opciones son compatibles
function opcionesdeseleccion(value){

	var ops=document.getElementsByName("tramite1");
	var ops2=document.getElementsByName("tramite2");
	var op=document.getElementById("solIncorporacion");
	var op2=document.getElementById("aux");
	var op3=document.getElementById("baja");
	var op4=document.getElementById("pagoMarcha")
	var op5=document.getElementById("correccionActDatos");
	var op6=document.getElementById("revicionDatos");
	var op7=document.getElementById("medioCobro");
	
	if(op.checked==true || op2.checked==true || op3.checked==true ||op4.checked==true||op5.checked==true
		|| op6.checked==true||op7.checked==true){
		
			if(value==1 || value==2 || value==5 || value==6 || value==7 ){
				
				document.getElementById("baja").disabled = true;
				document.getElementById("pagoMarcha").disabled = true;
				
				document.getElementById("baja").classList.add('readonly');
				document.getElementById("pagoMarcha").classList.add('readonly');
				
				op.required=false;
				op2.required=false;
				op5.required=false;
				op6.required=false;
				op7.required=false;
				
		}else if( value==3 || value==4 ){
			document.getElementById("solIncorporacion").disabled = true;
			document.getElementById("aux").disabled = true;
			document.getElementById("correccionActDatos").disabled = true;
			document.getElementById("revicionDatos").disabled = true;
			document.getElementById("medioCobro").disabled = true;
			
			document.getElementById("solIncorporacion").classList.add('readonly');
			document.getElementById("aux").classList.add('readonly');
			document.getElementById("correccionActDatos").classList.add('readonly');
			document.getElementById("revicionDatos").classList.add('readonly');
			document.getElementById("medioCobro").classList.add('readonly');
			
			
			op3.required=false;
			op4.required=false;
		}
	}else{
			document.getElementById("baja").disabled = false;
			document.getElementById("pagoMarcha").disabled = false;
			document.getElementById("solIncorporacion").disabled = false;
			document.getElementById("aux").disabled = false;
			document.getElementById("correccionActDatos").disabled = false;
			document.getElementById("revicionDatos").disabled = false;
			document.getElementById("medioCobro").disabled = false;
			
			document.getElementById("baja").classList.add('readonly');
			document.getElementById("pagoMarcha").classList.add('readonly');
			document.getElementById("solIncorporacion").classList.add('readonly');
			document.getElementById("aux").classList.add('readonly');
			document.getElementById("correccionActDatos").classList.add('readonly');
			document.getElementById("revicionDatos").classList.add('readonly');
			document.getElementById("medioCobro").classList.add('readonly');
			
			
			op.required=true;
			op2.required=true;
			op3.required=true;
			op4.required=true;
			op5.required=true;
			op6.required=true;
			op7.required=true;
	}	
}


function habilitaCheck2(idChe, IdInput, tipo,check2) {

if (tipo == "check") {
		var actC = document.getElementById(idChe);
		
		if (actC.checked == true) {
			document.getElementById(IdInput).disabled = true;
			document.getElementById(IdInput).classList.add('readonly');
			
			if(check2!=""){
			document.getElementById(check2 ).disabled = true;
			}
		} else {
			
			document.getElementById(IdInput).disabled = false;
			document.getElementById(IdInput).removeAttribute('readonly');
			document.getElementById(IdInput).classList.remove('readonly');
			
			if(check2!=""){
			document.getElementById(check2).disabled = false;
			}
		}		
		
		
	}

}


function habilitaCheck(idChe, IdInput, tipo) {

	if (tipo == "check") {
		var actC = document.getElementById(idChe);
		if (actC.checked == true) {
			document.getElementById(IdInput).disabled = true;
			document.getElementById(IdInput).classList.add('readonly');
		} else {
			document.getElementById(IdInput).disabled = false;
			document.getElementById(IdInput).removeAttribute('readonly');
			document.getElementById(IdInput).classList.remove('readonly');
		}
	} else if (tipo == "radio") {
		if (idChe == "false") {
			document.getElementById(IdInput).disabled = true;
			document.getElementById(IdInput).classList.add('readonly');
		} else {
			document.getElementById(IdInput).disabled = false;
			document.getElementById(IdInput).removeAttribute('readonly');
			document.getElementById(IdInput).classList.remove('readonly');
		}

	} else if (tipo == "clase") {
		var actC = document.getElementById(idChe);
		var edadB = document.getElementById('edadB');
		
		
		if (edadB.value >= 18){
			if (actC.checked == true) {
		
				var inp = $('div.bd-callout-info.active').find('input:not(.readonly), textarea:not(.readonly), select:not(.readonly)').attr('disabled','disabled');
				inp.addClass('disabled');
				var actC = document.getElementById(idChe).disabled = false;
				
			} else {
				
				var inp = $('div.bd-callout-info.active').find('input:not(.readonly), textarea:not(.readonly), select:not(.readonly)').attr('disabled','disabled');
				inp.removeClass('disabled');
				inp.removeAttr('disabled');
				inp.removeAttr('readonly');
				
			}
		}else{
			var actC = document.getElementById(idChe).disabled = true;
		}
	} else if (tipo == "clase2") {
		var actC = document.getElementById(idChe);
		var edadB = document.getElementById('edadB');
		
		
		
			if (actC.checked == true) {
		
				var inp = $('div.bd-callout-info.active').find('input:not(.readonly), textarea:not(.readonly), select:not(.readonly)').attr('disabled','disabled');
				inp.addClass('disabled');
				var actC = document.getElementById(idChe).disabled = false;
				
			} else {
				
				var inp = $('div.bd-callout-info.active').find('input:not(.readonly), textarea:not(.readonly), select:not(.readonly)');
				inp.removeClass('disabled');
				inp.removeAttr('disabled');
				inp.removeAttr('readonly');
				
			}
		
	}
}

function validaCP(id) {
	
	var cp= document.getElementById(id).value;
	var tamano=cp.length;
	
	if (tamano < 5){
		document.getElementById(id).setCustomValidity("Invalid field");
	}else{
		document.getElementById(id).setCustomValidity("");
		is_ceros(document.getElementById(id));
	}
}

$('#prev').click(function(){
	var $current = $('.bd-callout-info.active');
	$('.bd-callout-info').removeClass('active');
	
	var cadena = document.getElementById('camino').value;
	var index = parseInt(document.getElementById("indice").value);
	
	var anterior = 1;
	
	var array = cadena.split(",");
	
	for (var x=0;x<array.length;x++){
		if(parseInt(array[x]) >= index ){
			index = anterior;
			x=array.length;
		}else{
			anterior = array[x];
		}
	}
	
	$('.bd-callout-info').prev('.'+index).addClass('active');
	
// $current.prev().addClass('active');
// $('.bd-callout-info').next('.'+index).addClass('active');
	
	document.getElementById("indice").value = index ;
// document.getElementById('prev').style.visibility = 'visible';
	
	if(index==1){
		document.getElementById('prev').style.visibility = 'hidden';
    }
	
    activar();
});


function activar() {
	
	$('div.bd-callout-info:not(.active)').find('input, textarea, select').attr('readonly','readonly');
	
	var inp = $('div.bd-callout-info.active').find('input:not(.readonly,.disabled), textarea:not(.readonly,.disabled), select:not(.readonly,.disabled)');
	inp.removeAttr('disabled');
	inp.removeAttr('readonly');
	
	
}


function setPrograma(input){
	document.getElementById('nombrePrograma').value =input.options[input.selectedIndex].text;
	document.getElementById('nombrePrograma2').value =input.options[input.selectedIndex].text;
}

function requerido(id,input){
	var cp= document.getElementById(id);
	if(input.value == 3){
		cp.required = true;
	}else{
		cp.required = false;
	}
	
}


// Función para validar una CURP
function curpValida(curp) {
    var re = /^([A-Z][AEIOUX][A-Z]{2}\d{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[12]\d|3[01])[HM](?:AS|B[CS]|C[CLMSH]|D[FG]|G[TR]|HG|JC|M[CNS]|N[ETL]|OC|PL|Q[TR]|S[PLR]|T[CSL]|VZ|YN|ZS)[B-DF-HJ-NP-TV-Z]{3}[A-Z\d])(\d)$/,
        validado = curp.match(re);
	
    if (!validado)  // Coincide con el formato general?
    	return false;
    
    // Validar que coincida el dígito verificador
    function digitoVerificador(curp17) {
        // Fuente https://consultas.curp.gob.mx/CurpSP/
        var diccionario  = "0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ",
            lngSuma      = 0.0,
            lngDigito    = 0.0;
        for(var i=0; i<17; i++)
            lngSuma = lngSuma + diccionario.indexOf(curp17.charAt(i)) * (18 - i);
        lngDigito = 10 - lngSuma % 10;
        if (lngDigito == 10) return 0;
        return lngDigito;
    }
  
    if (validado[2] != digitoVerificador(validado[1])) 
    	return false;
        
    return true; // Validado
}


// Handler para el evento cuando cambia el input
// Lleva la CURP a mayúsculas para validarlo
function validCurp(input) {
    var curp = input.value.toUpperCase(),
        resultado = document.getElementById("resultado"),
        valido = "No válido";
        
    if (curpValida(curp)) { // ⬅️ Acá se comprueba
    	input.setCustomValidity("");
    } else {
    	input.setCustomValidity("No valido");
    }
       
}



function selectMultiple(input,textinput){
	
	var values = $(input).val();

	if (values.length>0 && values[0]!=0){
		
		$(textinput).prop('disabled', true)
		$(textinput).addClass('readonly');
		
		
	}else{
		
		$(textinput).prop('disabled', false)
		$(textinput).removeAttr('readonly');
		$(textinput).removeClass('readonly');
	}

	
}

window.onload = function(){
	 var fecha = new Date(); //Fecha actual
	 var mes = fecha.getMonth()+1; //obteniendo mes
	 var dia = fecha.getDate(); //obteniendo dia
	 var ano = fecha.getFullYear(); //obteniendo año
	 if(dia<10)
	   dia='0'+dia; //agrega cero si el menor de 10
	 if(mes<10)
	   mes='0'+mes //agrega cero si el menor de 10
	 document.getElementById('fechaNacimiento').value=ano+"-"+mes+"-"+dia;
	 document.getElementById('fecha').value=ano+"-"+mes+"-"+dia;
	}
