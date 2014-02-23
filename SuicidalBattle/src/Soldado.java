
public class Soldado {
	
	int x, y;
	String nombre;
	Estado estado;
	Bando bando;
	
	public Soldado(int x, int y, String nombre, Estado estado, Bando bando){
		this.x = x;
		this.y = y;
		this.nombre = nombre;
		this.estado = estado;
		this.bando = bando;
	}
	
	public int getX() { return x; }

	public void setX(int x) { this.x = x; }

	public int getY() { return y; }

	public void setY(int y) { this.y = y; }

	public String getNombre() { return nombre; }

	public void setNombre(String nombre) { this.nombre = nombre; }

	public Estado getEstado() { return estado; }

	public void setEstado(Estado estado) { this.estado = estado; }
	
	public Bando getBando(){ return bando; }
	
	public void setBando(Bando bando){ this.bando = bando; }
	
}
