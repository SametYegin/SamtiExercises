import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		
		 
	        int[][] samtiarray = { {2, 3, 4}, {5, 6, 4} };
	        display(samtiarray);
	        System.out.println("Transpozu alýndý.");
	        transpoz(samtiarray);
	       
	    }
	
	    static void transpoz(int[][] array) {
	    	int row = array.length;
	    	int column = array[0].length;
	    	
	    	int[][] transpozmatris = new int[column][row];
	        for(int i = 0; i < row; i++) {
	            for (int j = 0; j < column; j++) {
	                transpozmatris[j][i] = array[i][j];
	            }
	        }

	       
	        display(transpozmatris);
	    	
	    	
	    }

	    public static void display(int[][] matris) {
	       
	        for(int[] row : matris) {
	            for (int column : row) {
	                System.out.print(column + " ");
	            }
	            System.out.println();
	        }
	

}
}