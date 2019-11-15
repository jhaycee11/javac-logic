import java.util.Scanner;
import java.time.LocalDateTime;


class AddTest{
	private static final int QUESTION_COUNT = 100;
	private static final int MAX_NUM = 9;
	private static final String FILENAME = "ADDTEST.dat";
	
	public static void main(String[] args){
		int[][] q = makeTest(QUESTION_COUNT);
		int correctCount=0;
		int wrongCount=0;
		Scanner scan = new Scanner(System.in);
		

		System.out.println("-------------------------------");
		System.out.println("AddTest " + q.length +  " Start");
		System.out.println("Version 2.2");		
		System.out.println("-------------------------------");
		Ohya.sleep(2);
		Ohya.cls();
		
		//count down
		countDownDisplay();

		
		//start
		long start = System.currentTimeMillis();

		for(int i =0; i<q.length; i++){
			System.out.print("[" + (i+1) + "]  ");
			System.out.print(q[i][0]);
			System.out.print(" + ");
			System.out.print(q[i][1]);
			System.out.print(" = ");
			
			try{
				int answer = Integer.parseInt(scan.next());
				if(q[i][2] == answer){
					correctCount++;
				}else{
					System.out.println("\tWrong");
					wrongCount++;
					i--;//for retry
				}
			}catch(NumberFormatException n){
				System.out.println("\tError!");
				i--;//for retry
			}
		}
		//end
		long end = System.currentTimeMillis();
		float elapsedTime = (float)((end - start) / 1000.0);
		
		//output
		System.out.println("-------------------------------");	
		System.out.println("Correct     = " + correctCount);
		System.out.println("Wrong       = " + wrongCount);
		System.out.println("ElapsedTime = " + elapsedTime + " seconds");
		System.out.println("-------------------------------");
				
		//書き込み
		String context =
		"[" + LocalDateTime.now() + "] / " + "[Wrong:" + wrongCount + "] / [time : " + elapsedTime + " seconds]";

		Ohya.writeFile(FILENAME,context);
		//過去のスコア
		String[] data = Ohya.readFile(FILENAME);
		for(String s : data){
			System.out.println(s);
		}
		
	}
	
	//問題と答えを作る関数
	//     [0] +  [1] = [2]
	//[0]   1      3     4
	//[1]   7      8     15
	//[2]   6      7     13
	static int[][] makeTest(int rowCount){
		int columnCount = 3; // [0] + [1] = [2]
		int[][] q = new int[rowCount][columnCount];
		
		for(int i=0; i< rowCount; i++){
			q[i][0]= Ohya.random(MAX_NUM)+1;//1～MAX_NUM
			q[i][1]= Ohya.random(MAX_NUM)+1;//1～MAX_NUM
			q[i][2]= q[i][0] + q[i][1];
		}
		
		return q;
	}
	
	static void printTest(int[][] q){
		for(int i=0; i< q.length; i++){
			System.out.print(q[i][0]);
			System.out.print(" + ");
			System.out.print(q[i][1]);
			System.out.print(" = ");
			System.out.println(q[i][2]);
		}
	}
	
	static void countDownDisplay(){
		for(int count = 3; count >= 0; count--){

			Ohya.cls();
			switch(count){
				case 3:
					System.out.println("\t\t■■■");
					System.out.println("\t\t　　■");
					System.out.println("\t\t■■■");
					System.out.println("\t\t　　■");
					System.out.println("\t\t■■■");
					break;
				case 2:
					System.out.println("\t\t■■■");
					System.out.println("\t\t　　■");
					System.out.println("\t\t■■■");
					System.out.println("\t\t■　　");
					System.out.println("\t\t■■■");
					break;
				case 1:
					System.out.println("\t\t　■■");
					System.out.println("\t\t　　■");
					System.out.println("\t\t　　■");
					System.out.println("\t\t　　■");
					System.out.println("\t\t　　■");
					break;
				default:
					System.out.println("\t\t■■■　■■■　　■　　■■■　■■■");
					System.out.println("\t\t■　　　　■　　■　■　■　■　　■");
					System.out.println("\t\t■■■　　■　　■■■　■■■　　■");
					System.out.println("\t\t　　■　　■　　■　■　■■　　　■");
					System.out.println("\t\t■■■　　■　　■　■　■　■　　■");
					break;
			}
			Ohya.sleep(0.5);

		}	
	}
}