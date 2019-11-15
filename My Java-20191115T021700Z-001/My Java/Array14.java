class Array14{
	public static void main(String[] args){
		System.out.println("array 3x3");
		int[][] a=Array12.randomArray2D(3);
		Array12.printArray(a);
		System.out.println("searchArray 1x3");
		int[] searcha= Array02.randomArray(3);
		Array01.printArray(searcha);

		System.out.println("clear");
		searchArray(a,searcha);
		Array12.printArray(a);
	}
	public static void searchArray(int[][] array,int[] searchArray){
		for(int i=0;i<searchArray.length;i++){
			for(int j=0;j<array.length;j++){
				for(int k=0;k<array.length;k++){
					if(array[j][k]==searchArray[i]){
						array[j][k]=0;
					}
				}
			}
		}
	}
}