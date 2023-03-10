/**
 * 
 */
package com.devpredator.practicaspringjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.devpredator.practicaspringjsf.entity.Restaurante;
import com.devpredator.practicaspringjsf.services.RestauranteService;

/**
 * @author 
 * 
 */
@ManagedBean
@ViewScoped

public class RestauranteController {
	private List<Restaurante> restaurantes;
	private List<Restaurante> RestaurantesFiltrados;

	// private RestauranteService restauranteService = new RestauranteService();

	@ManagedProperty("#{restauranteServiceImpl}")
	private RestauranteService restauranteServiceImpl;

	@PostConstruct
	public void init() {

		List<Restaurante> listaRes = this.restauranteServiceImpl.consultarRestaurantes();

		this.restaurantes = listaRes;

	}

	public void consultarRestaurantes() {
		this.restaurantes = this.restauranteServiceImpl.consultarRestaurantes();
	}

	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}

	public List<Restaurante> getRestaurantesFiltrados() {
		return RestaurantesFiltrados;
	}

	public void setRestaurantesFiltrados(List<Restaurante> restaurantesFiltrados) {
		RestaurantesFiltrados = restaurantesFiltrados;
	}

	public RestauranteService getRestauranteServiceImpl() {
		return restauranteServiceImpl;
	}

	public void setRestauranteServiceImpl(RestauranteService restauranteServiceImpl) {
		this.restauranteServiceImpl = restauranteServiceImpl;
	}

}
