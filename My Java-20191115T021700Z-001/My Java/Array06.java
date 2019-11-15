class Array06{
	public static void main(String[] args){
		int[] a = Array02.randomArray(5);
		int max = max(a);
		Array01.printArray(a);
		System.out.println("max=" + max);
 	}
	public static int max(int[] a ){
		int max=0;
		for(int i=0;i<a.length;i++){
			if(max<a[i])
				max=a[i];
		}
		return max;
	}
}
