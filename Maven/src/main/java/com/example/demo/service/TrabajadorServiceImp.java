package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dao.ITrabajadorDao;
import com.example.demo.dto.TrabajadorDto;
import com.example.demo.dto.TrabajadorDto.trabajo;

@Service
public class TrabajadorServiceImp implements ITrabajadorService {

	@Autowired
	ITrabajadorDao iTrabajadorDao;

	@Override
	public List<TrabajadorDto> listarTrabajadores() {
		// TODO Auto-generated method stub
		return iTrabajadorDao.findAll();
	}

	@Override
	public TrabajadorDto guardarTrabajador(TrabajadorDto trabajador) {
		// TODO Auto-generated method stub
		return iTrabajadorDao.save(trabajador);
	}

	@Override
	public TrabajadorDto trabajadorXID(Integer id) {
		// TODO Auto-generated method stub
		return iTrabajadorDao.findById(id).get();
	}
	
	
	@Override
	public List<TrabajadorDto> listarPorPuesto(trabajo puesto) {
		// TODO Auto-generated method stub
		return iTrabajadorDao.findByPuesto(puesto);
	}

	@Override
	public TrabajadorDto actualizarTrabajador(TrabajadorDto trabajador) {
		// TODO Auto-generated method stub
		return iTrabajadorDao.save(trabajador);
	}

	@Override
	public void eliminarTrabajador(Integer id) {
		iTrabajadorDao.deleteById(id);
		
	}

}
