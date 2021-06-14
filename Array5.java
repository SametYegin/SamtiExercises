import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		
		int[] array = {0,5,0,4,5,4,3,5,4};
		frekans(array);
		

	}
	
	static void frekans (int[] arr) {
		Arrays.sort(arr);
		
		for(int i = 0; i< arr.length ; i++) {
			int count = 1;
			if(i != 0 && arr[i-1] == arr[i]) {
				continue;
			}else {
			
			
			
			for(int j = 0; j<arr.length ; j++) {
				
				if( i != j && arr[i] == arr[j]) {
					count++;
					
					
				}
				
			}
			
			System.out.println(arr[i] + " elemaný " + count + " kadar tekrar etmiþtir." );
			
		 }
		}
	}

}
