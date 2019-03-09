package sort;

public class MergeSort {

	public static void main(String[] args) {
	
		int x[] = {22, -4 , 7,7, 98,5,-89};
		mergeSort(x, 0, x.length);
		
		
		for(int ele :x){
			System.out.println(ele);
			}
		
	}
	public static void mergeSort(int input[] , int start , int end) {
		if(end-start<2)
			return ;
		else{
		int mid = (start+end)/2;
		mergeSort( input , start , mid);
		mergeSort(input , mid , end);
		merge(input , start , mid, end);
		}
	}

	public static void merge(int input[] ,int start , int mid , int end){
		
		if(input[mid-1]<=input[mid])
			return;
		
		int  i = start ;
		int j = end;
		int tempindex=0;
		
		int temp[] =  new int [end-start];
		
		while(i<mid && j<end){
			temp[tempindex++]=input[i]<=input[j]?input[i++]:input[j++];
			
		}
		System.arraycopy(input, i, input, start+tempindex, mid-i);
		System.arraycopy(temp, 0, input, start, tempindex);
	}
}
