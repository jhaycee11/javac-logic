class Array11{
	public static void main(String[] args){
		int[] a = Array02.randomArray(5);
 
		System.out.println("random");
		Array01.printArray(a);
 
		sort(a);
		System.out.println("sort");
		Array01.printArray(a);
	}
		 
	public static void sort(int[] a){
		for(int i=0;i<a.length;i++){
			for(int j=a.length-1;j>=i;j--){
				if(a[i]>a[j]){
					int change=a[i];
					a[i]=a[j];
					a[j]=change;
				}
			}
		}
	
	}
}
