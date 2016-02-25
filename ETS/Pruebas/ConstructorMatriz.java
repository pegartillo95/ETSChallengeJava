package ETS.Pruebas;

public class ConstructorMatriz {
	ConstructorMatriz(){}
	
	String[] Construir(int n, int m, int row, int col){
		String ret[] = new String[n];
		
		int table[][] = new int[n][m];
		
		for(int i = 0; i < n; i++){
			for (int j = 0; j < m; j++){
				if(i <= row){
					if(j <= col)
						table[i][j] = i*(col+1) + j;
					else if(j > col)
						table[i][j] = (col+1)*(row+1)-1+i*(m-col-1)+j-col;
				}
				else
					table[i][j] = i*m + j;
			}
		}
		
		String word;
		for(int i = 0; i < n; i++){
			word = "";
			for (int j = 0; j < m; j++){
				word += table[i][j];
			}
			ret[i]=word;
		}
		word="";
		
		return ret;
	}
}
