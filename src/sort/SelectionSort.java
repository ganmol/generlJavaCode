package sort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[] = {22, -4 , 7,7, 98,5,-89};
		
		int sm;
		for(int i=0 ;i<x.length-1 ;i++){
			sm=i;
			for (int j =i+1 ;j<x.length;j++){
			
				if(x[j]<x[sm]){
					sm=j;
					
				}
			}
			int smallest= x[sm];
	
			x[sm]=x[i];
			x[i]=smallest;
			
		}
		for(int i=0 ;i<x.length ;i++){
		System.out.println(x[i]);
		}

	}

}
