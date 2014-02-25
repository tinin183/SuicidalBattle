//Comentario
public class Campo {
	
	private char [][] matriz;
	
	public Campo(int filas, int cols){
		inicializar(filas, cols);
	}
	
	public void inicializar(int filas, int cols){
		for(int i = 0; i < filas; i++){
			for(int j = 0; j < cols; j++){
				matriz[i][j] = '0';
			}
		}
	}
	
	public void setCelda(int fila, int col, char caracter){
		matriz[fila][col] = caracter;
	}
	
	public char getCelda(int fila, int col){ 
		return matriz[fila][col]; 
	}
}
