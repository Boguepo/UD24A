package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.dto.TrabajadorDto;
import com.example.demo.dto.TrabajadorDto.trabajo;

public interface ITrabajadorDao extends JpaRepository<TrabajadorDto, Integer> {
	

	public List<TrabajadorDto> findByPuesto(trabajo puesto);
}
