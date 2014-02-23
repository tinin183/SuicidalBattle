
public class Soldado {
	
	int x, y;
	String nombre;
	Estado estado;
	
	public Soldado(int x, int y, String nombre, Estado estado){
		this.x = x;
		this.y = y;
		this.nombre = nombre;
		this.estado = estado;
	}
	
	public int getX() { return x; }

	public void setX(int x) { this.x = x; }

	public int getY() { return y; }

	public void setY(int y) { this.y = y; }

	public String getNombre() { return nombre; }

	public void setNombre(String nombre) { this.nombre = nombre; }

	public Estado getEstado() { return estado; }

	public void setEstado(Estado estado) { this.estado = estado; }
	
}
