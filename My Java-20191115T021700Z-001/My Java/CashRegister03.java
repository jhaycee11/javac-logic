class CashRegister03{
	public static void main(String[] args){
		int sum = 4132;
		System.out.println("Sum = "+sum);
		int a = Ohya.inputNumber("[cash input]");
		int change=a-sum;
		System.out.println("change = "+change);
		System.out.println("5000en = "+change/5000+ " –‡");
		change=change%5000;
		System.out.println("1000en = "+change/1000+" –‡");
		change=change%1000;
		System.out.println("500en = "+change/500+" –‡");
		change=change%500;
		System.out.println("100en = "+change/100+" –‡");
		change=change%100;
		System.out.println("50en = "+change/50+" –‡");
		change=change%50;
		System.out.println("10en = "+change/10+" –‡");
		change=change%10;
		System.out.println("5en = "+change/5+" –‡");
		change=change%5;
		System.out.println("1en = "+change+" –‡");
	}
}