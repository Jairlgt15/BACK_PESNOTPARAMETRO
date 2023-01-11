package ec.gob.cj.pesnot.sugerencia_externa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ec.gob.cj.pesnot.sugerencia_externa.model.SugerenciaExterna;
import ec.gob.cj.pesnot.sugerencia_externa.repository.SugerenciaExternaRepository;






@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/sugerenciasExternas")
public class SugerenciaExternaController {

	public boolean estado = true;

	@Autowired
	private SugerenciaExternaRepository sugerenciaExternaRepository;
	
	public SugerenciaExternaController(SugerenciaExternaRepository seR) {
		this.sugerenciaExternaRepository = seR;
	}
	
	@GetMapping("/all")
	public List<SugerenciaExterna> allSugerenciasExternas() {
		return sugerenciaExternaRepository.findAll();
	}
	
	@GetMapping(value = "/all", params = { "idSugerenciaExterna" })
	public List<SugerenciaExterna> findByNameTipoInformativo(
			@RequestParam("idSugerenciaExterna") Long idSugerenciaExterna) {
		return sugerenciaExternaRepository.findByIdSugerenciaExterna(idSugerenciaExterna);
	}
	
	@PostMapping("/create")
	public SugerenciaExterna createTabla(@RequestBody SugerenciaExterna tabla) {
		return sugerenciaExternaRepository.save(tabla);
	}
	
	@PutMapping(value = "/asignar", params = { "idSugerenciaExterna" })
	public SugerenciaExterna updateTabla(@RequestParam Long idSugerenciaExterna, @RequestBody SugerenciaExterna sugerencia) {

		List<SugerenciaExterna> sugerenciaAnterior = sugerenciaExternaRepository.findByIdSugerenciaExterna(idSugerenciaExterna);
		sugerenciaAnterior.get(0).setIdAsignado(sugerencia.getIdAsignado());
		sugerenciaAnterior.get(0).setFechaAtencion(sugerencia.getFechaAtencion());
		return sugerenciaExternaRepository.save(sugerenciaAnterior.get(0));

	}
	
}
