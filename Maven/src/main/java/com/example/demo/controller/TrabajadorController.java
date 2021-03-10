package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TrabajadorDto;
import com.example.demo.dto.TrabajadorDto.trabajo;
import com.example.demo.service.TrabajadorServiceImp;

@RestController
@RequestMapping("/ud24")
public class TrabajadorController {
	
	@Autowired
	TrabajadorServiceImp trabajadorServiceImp;

	@GetMapping("/trabajadores")
	public List<TrabajadorDto> listarTrabajador() {
		return trabajadorServiceImp.listarTrabajadores();
	}

	@GetMapping("/trabajador/puesto/{puesto}")
	public List<TrabajadorDto> listarPuesto(@PathVariable(name = "puesto") trabajo puesto) {
		return trabajadorServiceImp.listarPorPuesto(puesto);
		
	}

	@PostMapping("/trabajador")
	public TrabajadorDto saveTrabajador(@RequestBody TrabajadorDto trabajador) {
		return trabajadorServiceImp.guardarTrabajador(trabajador);
	}
	
	@GetMapping("/trabajador/{id}")
	public TrabajadorDto trabajadorXID(@PathVariable(name = "id") int id) {
		TrabajadorDto trabajador_xid = new TrabajadorDto();
		trabajador_xid = trabajadorServiceImp.trabajadorXID(id);
		System.out.println("Trabajador X ID: "+trabajador_xid);
		return trabajador_xid;
	}
	
	@PutMapping("/trabajador/{id}")
	public TrabajadorDto actualizarTrabajador(@PathVariable(name = "id") int id, @RequestBody TrabajadorDto trabajador) {
		TrabajadorDto trabajador_s = new TrabajadorDto();
		TrabajadorDto trabajador_a = new TrabajadorDto();
		
		trabajador_s = trabajadorServiceImp.trabajadorXID(id);
		
		
		trabajador_s.setNombre(trabajador.getNombre());
		trabajador_s.setPuesto(trabajador.getPuesto());
		
		trabajador_a = trabajadorServiceImp.actualizarTrabajador(trabajador_s);
		
		System.out.println("El trabajador actualizado es: "+trabajador_a);
		
		return trabajador_a;
		
	}
	
	@DeleteMapping("/trabajador/{id}")
	public void eliminarTrabajador(@PathVariable(name = "id") int id) {
		trabajadorServiceImp.eliminarTrabajador(id);
	}
}
