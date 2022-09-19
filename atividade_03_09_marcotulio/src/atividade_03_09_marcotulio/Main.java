package atividade_03_09_marcotulio;

public class Main {
	public static void main(String[] args) {
		int [][] A = {{3, 3, 3}, {1, 1, 1}};
	    int [][] B = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
	    int [][] C = new int [10][10];
	        
	    for(int i = 0; i < A.length; i++) {
	    	for(int j = 0; j < B[i].length; j++) {
	    		for(int k = 0; k < B.length; k++)
	    			C[i][j] += A[i][j] * B[k][j];
	            }
	        }
	        
	    for(int i = 0; i < A.length; i++) {
	    	for(int j = 0; j < B[i].length; j++)
	    		System.out.print(C[i][j]);
	            
	    	System.out.println();
	    }
	}
}
