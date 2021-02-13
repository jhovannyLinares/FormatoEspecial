package mx.formato.presentacion.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.formato.negocio.servicios.ICatalogoService;

@Controller
@RequestMapping(value = "formulario/catalogo")
public class CatalogoController {

	@Autowired
	ICatalogoService ICatService;

	@GetMapping("/distritoFederal/{id}/distritoLocal")
	private String getDistritoLocalByDistritoFederal(Model model, @PathVariable("id") Long id) {

		return ICatService.getDistritosLocales(model, id);

	}

	@GetMapping("/distritoLocal/{id}/municipio")
	private String getmunicipiosByDistritoLocal(Model model, @PathVariable("id") Long id) {

		return ICatService.getMunicipiosByDistritosLocales(model, id);

	}

	@GetMapping("/municipio/{id}/localidad")
	private String getLocalidadByMunicipio(Model model, @PathVariable("id") Long id) {

		return ICatService.getLocalidadByMunicipio(model, id);

	}

	@GetMapping("/localidad/{id}/seccion")
	private String getSeccionByLocalidad(Model model, @PathVariable("id") Long id) {

		return ICatService.getSeccionByLocalidad(model, id);

	}

}
