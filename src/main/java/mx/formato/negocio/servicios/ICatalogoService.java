package mx.formato.negocio.servicios;

import org.springframework.ui.Model;

public interface ICatalogoService {

	
//	String getlocalidadesByMunicipio(Model model, Long municipioId);
	
//	String getSeccionByLocalidad(Model model, Long localidadId);

	String getDistritosLocales(Model model, Long id);

	String getMunicipiosByDistritosLocales(Model model, Long id);


	String getLocalidadByMunicipio(Model model, Long id);

	String getSeccionByLocalidad(Model model, Long id);
}
