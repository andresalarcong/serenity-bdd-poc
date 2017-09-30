package com.exito.aat.productos.definitions;

import org.openqa.selenium.WebDriver;

import com.exito.aat.navegacion.steps.BuscadorExitoSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;


public class BuscarProductosDefinitions {
	
/*	@Managed(driver = "chrome")
	WebDriver driver;*/

	@Steps
	BuscadorExitoSteps buscadorExitoSteps;

	@Given("^que he ingresado al portal de compras$")
	public void que_he_ingresado_al_portal_de_compras() throws Throwable {
		// GIVEN
		buscadorExitoSteps.abrir_pagina_principal_portal_exito();

		// WHEN
		buscadorExitoSteps.en_buscador_principal_consultar_por("Macbook Pro");
	}

	@When("^consulte el producto (.*)")
	public void consulte_el_producto_MacBook_Pro(String producto) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^aparecerá todo los productos relacionados con mi consulta$")
	public void aparecer_todo_los_productos_relacionados_con_mi_consulta() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
