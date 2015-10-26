package es.uji.ei1039.practica5.objetos;

public class Circulo extends FormaComponent {
	
	private double x;
	private double y;
	private double radio;
	
	public Circulo( double x, double y, double radio ) {
		this.x = x;
		this.y = y;
		this.radio = radio;
	}
	
	@Override
	public void dibuja() {
		System.out.println( "Circulo | Pos: (" + this.x + ", " + this.y + "); Radio: " + this.radio );
	}

	@Override
	public void desplazaRelativo (int x, int y) {
		this.x += x;
		this.y += y;
	}
}
