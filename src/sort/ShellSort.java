package sort;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[] = {22, -4 , 7,7, 98,5,-89};
		
		for(int gap=x.length/2;gap>0 ;gap /=2){
			for(int i=gap ;i<x.length ;i++){
				int j=i;
				int ele= x[i];
				while(j>=gap && x[j-gap]>x[j]){
					x[j]=x[j-gap];
					j -=gap;
				}
               x[j-gap]=ele;
			}
		}
		for(int i=0 ;i<x.length ;i++){
			System.out.println(x[i]);
			}
	}

}
