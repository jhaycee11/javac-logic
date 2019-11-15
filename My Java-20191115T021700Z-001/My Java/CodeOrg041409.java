class CodeOrg041409{
	public static void main(String[] args){	
		for(int i=25;i<=75;i=i+25){
			drawSquare(i);
			System.out.println("jump forward 100");
		}
	}
	static void drawSquare(int length){
		for(int j=1;j<=4;j++){
			System.out.println("move forward "+length);
			System.out.println("turn left 90");
		}
	}			
}
