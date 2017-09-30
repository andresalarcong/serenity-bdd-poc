package com.exito.aat.navegacion.steps;

import com.exito.aat.navegacion.PaginaPrincipalPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class BuscadorExitoSteps extends ScenarioSteps{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	PaginaPrincipalPage paginaPrincipal;
	
	@Steps MenuNavPpalSteps menuNavPpalSteps;
	
	@Step
	public void abrir_pagina_principal_portal_exito() {
		paginaPrincipal.open();
		paginaPrincipal.findBy(".//a[contains(.,' No, gracias. En otro momento ')]").waitUntilVisible().and().click();
	}

	@Step
	public void en_buscador_principal_consultar_por(String producto) throws Throwable{
		paginaPrincipal.txtBuscadorPrincipal.typeAndEnter(producto);
	}
	
	@Step
	public MenuNavPpalSteps dar_clic_en_menu_de_navegacion() {
		return menuNavPpalSteps;
	}
	
	@Step
	public void en_panel_marca_seleccionar_y_filtrar_por_marca(String marca) {
		String inputFiltroPorMarca = ".//div[@id='filterBy']/div[contains(.,'Marca')]//div/ul/li[contains(.,'MARCA')]//input";
		String aux = inputFiltroPorMarca.replace("MARCA", marca);
		paginaPrincipal.findBy(aux).click();
	}
		
}
