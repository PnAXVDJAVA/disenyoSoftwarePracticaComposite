package es.uji.ei1039.practica5.objetos;

import java.util.ArrayList;
import java.util.List;

public class Forma extends FormaComponent {
	
	private List<FormaComponent> componentes;
	private String nombre;
	
	public Forma (String nombre) {
		this.nombre = nombre;
		this.componentes = new ArrayList<>();
	}
	
	@Override
	public void anyade( FormaComponent componente ) {
		this.componentes.add( componente );
	}
	
	@Override
	public void elimina( FormaComponent componente ) {
		this.componentes.remove( componente );
	}
	
	@Override
	public void dibuja() {
		System.out.println( "---- Forma: " + this.nombre + "----" );
		for (FormaComponent fc : componentes) {
			fc.dibuja();
		}
		System.out.println( "--- FIN FORMA: " + this.nombre + "----" );
	}
	
	@Override 
	public void desplazaRelativo (int x, int y) {
		for (FormaComponent fc : componentes) {
			fc.desplazaRelativo(x, y);
		}
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
