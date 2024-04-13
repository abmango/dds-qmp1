package com.dds.quemepongo.QueMePongo_DDS2024;

public class Prenda {
	TipoPrenda tipo;
	Material material;
	Color colorPrincipal;
	Color colorSecundario;
	
	Prenda(TipoPrenda tipoNuevo,Material material,Color colorPrincipal, Color colorSecundario){
		
		if(tipoNuevo == null || material == null || colorPrincipal == null) 
		{
			throw new RuntimeException("Prenda invalida, porfavor seleccione tipo, color o material nuevo");
		}
		this.tipo 	  = tipoNuevo;
		this.material = material;
		this.colorPrincipal = colorPrincipal;
		this.colorSecundario = colorSecundario;
	}
	
	TipoPrenda  tipo() 
	{
		return tipo;
	}
	
	Material material() 
	{
		return material;
	}
	
	Color colorPrincipal() 
	{
		return colorPrincipal;
	}
	
	Color colorSecundario() 
	{
		if(colorSecundario == null) 
		{
			throw new RuntimeException("No tiene color secundario");
		}
		else 
		{
			return colorSecundario;
		}
	}
}
