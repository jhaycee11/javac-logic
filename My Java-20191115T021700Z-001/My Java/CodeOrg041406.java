class CodeOrg041406{
	public static void main(String[] args){	
		drawTriangle(100);
		System.out.println("jump forward 100");
		drawTriangle(100);
		System.out.println("jump forward 140");
		drawTriangle(75);
	}
	static void drawTriangle(int length){
		for(int i=1;i<=3;i++){
			System.out.println("move forward "+length);
			System.out.println("turn left "+(360/3));
		}
	}			
}
