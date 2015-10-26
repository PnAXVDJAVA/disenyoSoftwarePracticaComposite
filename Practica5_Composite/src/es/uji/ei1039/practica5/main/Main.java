package es.uji.ei1039.practica5.main;

import es.uji.ei1039.practica5.objetos.Circulo;
import es.uji.ei1039.practica5.objetos.Forma;
import es.uji.ei1039.practica5.objetos.FormaComponent;
import es.uji.ei1039.practica5.objetos.Rectangulo;

public class Main {

	public static void main (String[] args) {
		//Crea la forma principal
		FormaComponent formaPrincipal = new Forma("Principal");
		formaPrincipal.anyade(new Rectangulo(10, 10, 20, 20));
		formaPrincipal.anyade(new Circulo(10, 10, 20));
		
		//Crea la forma interior
		FormaComponent formaInterior = new Forma("Interna");
		FormaComponent r1 = new Rectangulo(2, 2, 3, 3);
		FormaComponent r2 = new Rectangulo(3, 3, 4, 4);
		formaInterior.anyade(r1);
		formaInterior.anyade(r2);
		formaInterior.anyade(new Circulo(1, 1, 20));
		
		formaPrincipal.anyade(formaInterior);
		
		System.out.println("\nDibujo INICIAL:");
		formaPrincipal.dibuja();
		
		System.out.println("\nDibujo tras desplazar:");
		formaPrincipal.desplazaRelativo(100, 100);
		formaPrincipal.dibuja();
		
		System.out.println("\nDibujo tras eliminar:");
		formaInterior.elimina(r1);
		formaInterior.elimina(r2);
		formaPrincipal.dibuja();
	}
}