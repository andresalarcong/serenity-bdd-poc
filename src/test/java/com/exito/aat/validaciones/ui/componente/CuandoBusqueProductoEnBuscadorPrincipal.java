package com.exito.aat.validaciones.ui.componente;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.exito.aat.navegacion.steps.BuscadorExitoSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

//@RunWith(SerenityRunner.class)
public class CuandoBusqueProductoEnBuscadorPrincipal {

	//@Managed(driver = "chrome")
	//WebDriver driver;

	@Steps
	BuscadorExitoSteps buscadorExitoSteps;
	
	//@Test
	//@Ignore
	public void deberiaBuscarmeYVisualizarElProductoConsultado() throws Throwable {
		// GIVEN
		buscadorExitoSteps.abrir_pagina_principal_portal_exito();

		// WHEN
		buscadorExitoSteps.en_buscador_principal_consultar_por("Macbook Pro");

		// THEN
		//// h1[contains(.,'MacBook') or contains(.,'Macbook')]

		// MatcherAssert.assertThat();
		assert true;
	}

	//@Test
	//@Ignore
	public void deberiaBuscarmeYVisualizarElProductoConsultadoYLosProductosAsociadosALaMarcaDelProducto()
			throws Throwable {
		// GIVEN
		buscadorExitoSteps.abrir_pagina_principal_portal_exito();

		// WHEN
		buscadorExitoSteps.en_buscador_principal_consultar_por("Macbook Pro");
		buscadorExitoSteps.en_panel_marca_seleccionar_y_filtrar_por_marca("APPLE");

		// THEN
		// buscadorExitoSteps.
	}

	
}
