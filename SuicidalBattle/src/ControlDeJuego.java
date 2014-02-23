
public class ControlDeJuego {
	
	
	public void mover(Soldado soldado, Direccion direccion){
		
		int x = soldado.getX();
		int y = soldado.getY();
		
		switch(direccion){
			case ARRIBA: y -= 10; break;
			case ABAJO: y += 10; break;
			case IZQUIERDA: x -= 10; break;
			case DERECHA: x += 10; break;
			case AB_DERECHA: y += 10; x += 10; break;
			case AB_IZQUIERDA: y += 10; x -= 10; break;
			case AR_DERECHA: x += 10; y -= 10; break;
			case AR_IZQUIERDA: x -= 10; y -= 10; break;
		}
		
		soldado.setX(x);
		soldado.setY(y);
	}
	
	public void atacar(Soldado soldado){
		soldado.setEstado(Estado.ATACANDO);
	}
	
	public void defender(Soldado soldado){
		soldado.setEstado(Estado.DEFENDIENDO);
	}
	
}
