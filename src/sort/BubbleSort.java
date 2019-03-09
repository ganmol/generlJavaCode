package sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {22, -4 , 7,7, 98,5,-89};
		
		for(int ele : array){
			for(int i=0 ;i<array.length-1;i++){
			if(array[i]>array[i+1]){
				int temp = array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
			}else
				continue;
		}
		}
		for(int temp1:array){ 
		System.out.println(temp1);
		}
		
	}

	
}
