class CodeOrg030506{
	public static void main(String[] args){

		for(int j=1; j<=6 ;j++){
			drawHexagon();
			System.out.println("turn right 60");
		}

	}

	static void drawHexagon(){

		for(int i=1;i<=6;i++){
			System.out.println("move forward 50");
			System.out.println("turn right 60");
		}
	}
}