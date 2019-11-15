class Array16{
	public static void main(String[] args){
		System.out.println("array 3x3");
		int[][] a=Array12.randomArray2D(3);
		Array12.printArray(a);
		System.out.println("searchArray 1x100");
		int[] searcha= Array02.randomArray(99)+1;
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
			if((array[i][0]==0) && (array[i][1]==0) && (array[i][2]==0)){
				c++;
			}
			if((array[0][i]==0) && (array[1][i]==0) && (array[2][i]==0)){
				c++;
			}
		}
		if((array[0][0]==0) && (array[1][1]==0) && (array[2][2]==0)){
				c++;
		}
		if((array[0][2]==0) && (array[1][1]==0) && (array[2][0]==0)){
				c=++;
		}
		return c;
	}
}