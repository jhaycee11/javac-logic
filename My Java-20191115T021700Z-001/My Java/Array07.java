class Array07{
	public static void main(String[] args){
		int[] a = Array02.randomArray(5);
		int sum = sum(a);
		Array01.printArray(a);
		System.out.println("sum = " + sum);
	}
 
	public static int sum(int[] a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		return sum;
	}
}
