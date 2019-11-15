class Array08{
	public static void main(String[] args){
		int val = Ohya.random(10);
		int[] a = Array02.randomArray(5);
		int count = search(a, val);
		Array01.printArray(a);
		System.out.println("val = " + val);
		System.out.println("count = " + count);
	}
	public static int search(int[] a, int val){
		int count =0;
		for(int i=0;i<a.length;i++){
			if(val==a[i])
				count=count+1;
		}
		return count;
	}
}
