class ArraySample{

	public static void main(String[] args){
				
		//5�̒l�������̔z�������
		int[] arrayA = new int[5];
		
		//�l���w�肵�Ĕz�������
		int[] arrayB = {1,2,3,4,5};
		
		//���̔z����Q�Ɓi���񂵂傤:reference�j����
		int[] arrayC = arrayA;
		
		
		//�z��̓Y�����i������=index)���w�肵�āA
		//�l����
		arrayA[0]=9;
		arrayA[1]=8;
		arrayA[2]=7;
		arrayA[3]=6;
		arrayA[4]=5;
		for (int i=0;i<5;i++){
			System.out.println("arrayA["+i+"]=" + arrayA[i]);
		}
		System.out.println();
		for (int j=0;j<5;j++){
			System.out.println("arrayB["+j+"]=" + arrayB[j]);
		}
		System.out.println();
		for (int j=0;j<5;j++){
			System.out.println("arrayC["+j+"]=" + arrayC[j]);
		}
		System.out.println();
		arrayC[0]=99;
				for (int i=0;i<5;i++){
			System.out.println("arrayA["+i+"]=" + arrayA[i]);
		}
		printArray(arrayA);
		printArray(arrayB);
		printArray(arrayC);


		//�z��.length �Ł@�z��̒����𒲂ׂ�
		System.out.println("arrayA=" + arrayA.length);		
	}
	
	
	/**int�z��̒l��S�ĕ\������*/
	public static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print("[" + i + "]="); 
			System.out.print(array[i]+ "\t");
		}
		
		System.out.println();
	}
}