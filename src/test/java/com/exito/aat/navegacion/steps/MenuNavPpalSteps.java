package com.exito.aat.navegacion.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class MenuNavPpalSteps extends ScenarioSteps{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Steps MenuNavMercadoSteps menuNavMercadoSteps;
	
	@Step
	public MenuNavMercadoSteps dar_clic_en_menu_mercado() {
		return menuNavMercadoSteps;
	}
	
}
