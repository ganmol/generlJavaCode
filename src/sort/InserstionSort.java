package sort;

public class InserstionSort {

	public static void main(String[] args) {  
		
		int x[] = {22, -4 , 7,7, 98,5,-89};
		int j;
		for(int i=1 ;i<x.length ;i++){
			int ele= x[i];
			for(j=i ; i>0 && x[j-1]> ele ;j--){
				x[j]=x[j-1];
			}
			x[j-1]=ele;
		}
		
		for(int i=0 ;i<x.length ;i++){
			System.out.println(x[i]);
			}
	}
}
