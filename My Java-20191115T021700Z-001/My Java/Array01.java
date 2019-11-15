class Array01{
	public static void main(String[] args){
		System.out.println("Random");
		int[] array=new int[5];
		for(int j=0;j<array.length;j++){
			array[j]=Ohya.random(10);
		}
		printArray(array);

	}
	public static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print("[" + i + "]="); 
			System.out.print(array[i]+ "\t");
		}
		
		System.out.println();
	}
}
