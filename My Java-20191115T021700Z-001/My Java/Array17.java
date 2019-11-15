class Array17{
	public static void main(String[] args){
		System.out.println("array 3x3");
		int[][] a=Array12.randomArray2D(3);
		Array12.printArray(a);
		System.out.println("searchArray 1x100");
		int[] searcha= Array02.randomArray(100);
		Array01.printArray(searcha);

		System.out.println("clear");
		Array14.searchArray(a,searcha);
		Array12.printArray(a);
		int count = countBingo(a);
		System.out.println("countBingo -> "+count);

	}
	public static int countBingo(int[][] array){
		int c=0;
		for(int i=0;i<array.length;i++){
			if(array[i][i]==0){
				for(int j=array.length-1;j>=0;j--){
					if(array[i][j]0){


		}
		return c;
	}
}