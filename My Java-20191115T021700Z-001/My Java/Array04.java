class Array04{
	public static void main(String[] args){
		int[] a = Array02.randomArray(5);
		System.out.println("random");
		Array01.printArray(a);
 		System.out.println();
		int val = 9;
		fill(a, val);
		System.out.println("val = " + val);
		Array01.printArray(a);
 		System.out.println();
		val = 0;
		fill(a, val);
		System.out.println("val = " + val);
		Array01.printArray(a);
 		System.out.println();
	}
	public static void fill(int[] a, int val){
		for(int i = 0;i<a.length;i++){
			a[i]= val;
		}
	}
}
