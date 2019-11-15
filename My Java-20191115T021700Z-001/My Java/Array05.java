class Array05{
	public static void main(String[] args){
		int[] a = Array02.randomArray(5);
		int val = 7;
		int fromIndex = 1;
		int toIndex = 3;
		System.out.println("random");
		Array01.printArray(a);
		System.out.println("From "+fromIndex+" to "+toIndex+" val = " + val);
		fill(a, fromIndex, toIndex, val);
		Array01.printArray(a);
 
		fromIndex = 2;
		toIndex = 4;
		val = 99;
		System.out.println("From "+fromIndex+" to "+toIndex+" val = " + val);
		fill(a,fromIndex, toIndex, val);
		Array01.printArray(a);
	}
 

	public static void fill(int[] a, int fromIndex, int toIndex,  int val){
		for(int i = fromIndex;i<=toIndex;i++){
			a[i]= val;
		}
	}
}
