class Array02{
	public static void main(String[] args){
				
		int n = Ohya.inputNumber("[ please input number]");
		int[] a = randomArray(n);
		System.out.println("n=" + n);
		printArray(a);

	}

	public static int[] randomArray(int n){
		int[] array= new int[n];
		for(int i=0;i<array.length;i++){
			array[i]=Ohya.random(99)+1;
		}
		return array;
	}

	public static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print("[" + i + "]=");
			System.out.print(array[i]+ "\t");
		}
		
		System.out.println();
	}
}