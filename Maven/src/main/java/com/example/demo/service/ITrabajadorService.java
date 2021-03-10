package com.example.demo.service;

import java.util.List;


import com.example.demo.dto.TrabajadorDto;
import com.example.demo.dto.TrabajadorDto.trabajo;


public interface ITrabajadorService {
	
	public List<TrabajadorDto> listarTrabajadores();//mostrar todos los trabajadores
	
	public TrabajadorDto guardarTrabajador(TrabajadorDto trabajador);//Guardar trabajador
	
	public TrabajadorDto trabajadorXID(Integer id);//leer datos de un Trabajador
	
	public List<TrabajadorDto> listarPorPuesto(trabajo puesto);//buscar trabajador por nombre
	
	public TrabajadorDto actualizarTrabajador(TrabajadorDto trabajador);//actualizar el trabajador
	
	public void eliminarTrabajador(Integer id);

	

	
	
}
