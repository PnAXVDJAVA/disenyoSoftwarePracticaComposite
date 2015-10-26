package es.uji.ei1039.practica5.objetos;

public abstract class FormaComponent {
	
	public void anyade (FormaComponent componente) {
		throw new UnsupportedOperationException();
	}
	
	public void elimina (FormaComponent componente) {
		throw new UnsupportedOperationException();
	}
	
	public void desplazaRelativo (int x, int y) {
		throw new UnsupportedOperationException();
	}
	
	public void dibuja () {
		throw new UnsupportedOperationException();
	}
}
