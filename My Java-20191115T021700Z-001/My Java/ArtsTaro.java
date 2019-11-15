class ArtsTaro{
	public static void main(String[] args){
		int age= getAge();
		say(age);
		sayBirthday(age);
		
		int height=getHeight();
		int weight=getWeight();

		Printer.drawRectangle(4,3);
		Printer.drawRectangle(0,200);
	}
	static int getAge(){
		return 18;
	}
	static void sayBirthday(int age){
		System.out.print("MyBirthday is ");
		System.out.println(2018-age+"/10/22");
	}
	static void say(int age){
		System.out.print("My name is Arts Taro.");
		System.out.println("I am "+ age +" years old.");
	}
	static int getWeight(){
		return 100;
	}
	static int getHeight(){
		return 200;
	}
	static void sayBMI(int height,int weight){
		int bmi=weight/(height/100*height/100);
		System.out.println("MyBMI is "+bmi);
	}
}
class Printer{
	static void drawRectangle(int height,int width){
		System.out.println("\nI am Printer.");
		if(height<1 && width>100){
			System.out.println("draw error");
		}else{
			System.out.println("height="+height);
			System.out.println("width="+width);

			for(int i=0;i<height;i++){
				for(int j=0;j<width;j++){
					System.out.print("¡");
				}
			System.out.println();
			}
		}
	}
}