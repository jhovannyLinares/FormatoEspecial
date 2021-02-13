package mx.formato.negocio.servicios.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import mx.formato.negocio.dto.FormatoDTO;
import mx.formato.negocio.servicios.ICatalogoService;
import mx.formato.negocio.util.mapper.MapperUtil;
import mx.formato.negocio.vo.DireccionVO;
import mx.formato.negocio.vo.DistritoLocalVO;
import mx.formato.negocio.vo.LocalidadVO;
import mx.formato.negocio.vo.MunicipioVO;
import mx.formato.negocio.vo.SeccionElectoralVO;
import mx.formato.persistencia.entidades.DistritoLocal;
import mx.formato.persistencia.entidades.Localidad;
import mx.formato.persistencia.entidades.Municipio;
import mx.formato.persistencia.entidades.SeccionElectoral;
import mx.formato.persistencia.repositorio.IDistritoFederalRepository;
import mx.formato.persistencia.repositorio.IDistritoLocalRepository;
import mx.formato.persistencia.repositorio.ILocalidadRepository;
import mx.formato.persistencia.repositorio.IMunicipioRepository;

@Service
public class CatalogoServiceImpl implements ICatalogoService {

	@Autowired
	private IDistritoFederalRepository federalRepository;

	@Autowired
	private IDistritoLocalRepository localRepository;

	@Autowired
	private IMunicipioRepository municipioRepository;

	@Autowired
	private ILocalidadRepository localidadRepository;

	@Override
	public String getDistritosLocales(Model model, Long id) {
		model.addAttribute("formatoDTO", new FormatoDTO());

		model.addAttribute("direccion", new DireccionVO());

		List<DistritoLocal> list = federalRepository.findById(id).get().getDistritosLocales();
		List<DistritoLocalVO> listVO = new ArrayList<DistritoLocalVO>();
		listVO = MapperUtil.mapAll(list, DistritoLocalVO.class);

//		model.addAttribute("distritosLocales", federalRepository.findById(id).get().getDistritosLocales());
		model.addAttribute("distritosLocales", listVO);

		return "/formulario/pagina1 :: divDistritoL";
	}

	@Override
	public String getMunicipiosByDistritosLocales(Model model, Long id) {
		model.addAttribute("formatoDTO", new FormatoDTO());
		model.addAttribute("direccion", new DireccionVO());
//		model.addAttribute("municipios", localRepository.findById(id).get().getMunicipios());

		List<Municipio> list = localRepository.findById(id).get().getMunicipios();
		List<MunicipioVO> listVO = new ArrayList<MunicipioVO>();
		listVO = MapperUtil.mapAll(list, MunicipioVO.class);

		model.addAttribute("municipios", listVO);

		return "/formulario/pagina1 :: divMunicipioB";
	}

	@Override
	public String getLocalidadByMunicipio(Model model, Long id) {
		model.addAttribute("formatoDTO", new FormatoDTO());
		model.addAttribute("direccion", new DireccionVO());

		List<Localidad> list = municipioRepository.findById(id).get().getLocalidades();
		List<LocalidadVO> listVO = new ArrayList<LocalidadVO>();
		listVO = MapperUtil.mapAll(list, LocalidadVO.class);

		model.addAttribute("localidades", listVO);

		return "/formulario/pagina1 :: divLocalidad";
	}

	@Override
	public String getSeccionByLocalidad(Model model, Long id) {
		model.addAttribute("formatoDTO", new FormatoDTO());
		model.addAttribute("direccion", new DireccionVO());

		List<SeccionElectoral> list = localidadRepository.findById(id).get().getSeccionElectorales();
		List<SeccionElectoralVO> listVO = new ArrayList<SeccionElectoralVO>();
		listVO = MapperUtil.mapAll(list, SeccionElectoralVO.class);

		model.addAttribute("secciones", listVO);

		return "/formulario/pagina1 :: divSeccion";
	}
}
