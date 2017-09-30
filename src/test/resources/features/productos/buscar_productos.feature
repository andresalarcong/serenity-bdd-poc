Feature: Buscar productos en el portal exito.com
As 
	Usuario consumidor
I want
	Consultar un producto en el buscador principal con el objetivo de comprarlo en el portal

Scenario: Consultar Producto
	Given que he ingresado al portal de compras
	When consulte el producto MacBook Pro
	Then aparecerá todo los productos relacionados con mi consulta