class Array10{
	public static void main(String[] args){
		int[] a = Array02.randomArray(5);
 
		System.out.println("random");
		Array01.printArray(a);
 
		replaceMin(a);
		System.out.println("replaceMin");
		Array01.printArray(a);
	}
 
	public static void replaceMin(int[] a){
		int min=a[0];
		for(int i=0;i<a.length;i++){
			if(a[0]>a[i]){
				min=a[i];
				a[i]=a[0];
				a[0]=min;
			}
		}
	}
}
