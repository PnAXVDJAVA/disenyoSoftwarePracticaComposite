package es.uji.ei1039.practica5.objetos;

public class Rectangulo extends FormaComponent {

	private double x1;
	private double y1;
	private double x2;
	private double y2;
	
	public Rectangulo (double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	@Override
	public void dibuja() {
		System.out.println( "Rectangulo | Pos: (" + this.x1 + ", " + this.y1 + "), (" + this.x2 + ", " + this.y2 + ")" );
	}
	
	@Override
	public void desplazaRelativo(int x, int y) {
		this.x1 += x;
		this.x2 += x;
		this.y1 += y;
		this.y2 += y;
	}
}
