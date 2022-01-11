
public class Main2 {
	
	public static void mergeSort(int[] list) {
		int length=list.length;
		if(length<2) {
			return;
		}
		int midIndex=length/2;
		int[] leftHalf=new int[midIndex];
		int[] rightHalf=new int[length-midIndex];
		 for(int i=0;i<midIndex;i++) {
			 leftHalf[i]=list[i];
		 }
		 for(int i=midIndex;i<length;i++) {
			 rightHalf[i-midIndex]=list[i];
		 }
		 mergeSort(leftHalf);
		 mergeSort(rightHalf);
		 
		 merge(list,leftHalf,rightHalf);
		 
		 
		
	}
	public static void merge(int[] list,int[]leftHalf,int[]rightHalf) {
		int leftSize=leftHalf.length;
		int rightSize=rightHalf.length;
		int i=0,j=0,k=0;
		while(i<leftSize && j<rightSize) {
			if(leftHalf[i]<=rightHalf[j]) {
				
				list[k]=leftHalf[i];
				i++;
			}
			else {
				list[k]=rightHalf[j];
				j++;
			}
			k++;
			
		}
		while(i<leftSize) {
			list[k]=leftHalf[i];
			i++;
			k++;
			
		}
		while(j<rightSize) {
			list[k]=rightHalf[j];
			j++;
			k++;
			
		}
		
	}

	public static void main(String[] args) {
		int[] x= {16,21,11,8,12,22};
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
		
		mergeSort(x);
		System.out.println("-------------------------------");
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
		

	}

}
