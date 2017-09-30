package com.exito.aat.navegacion;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.exito.com/")
public class PaginaPrincipalPage extends PageObject{
	
	@FindBy(xpath = "//input[@id='tbxSearch']")
	//@FindBy(xpath = "//input[contains(@placeholder,'Lo que deseas, está en exito.com')]")
	public WebElementFacade txtBuscadorPrincipal;
	
	
}
