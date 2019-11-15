class Array09{
	public static void main(String[] args){
		int[] a = Array02.randomArray(5);
		Array01.printArray(a);
 
		int  index1 = 1, index2 = 3;
		System.out.print("replace index1= " + index1);
		System.out.println(" index2= " + index2);
 
		replace(a, index1, index2);
 
		Array01.printArray(a);
	}
 
	public static void replace(int[] a, int index1, int index2){
		int b=a[index1];
		a[index1]=a[index2];
		a[index2]=b;
	}
}
