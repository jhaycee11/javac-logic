class CodeOrg041408{
	public static void main(String[] args){	
		for(int i=25;i<=75;i+=25){
			drawTriangle(i);
			System.out.println("jump forward 100");
		}
	}
	static void drawTriangle(int length){
		for(int j=1;j<=3;j++){
			System.out.println("move forward "+length);
			System.out.println("turn left 120");
		}
	}			
}
