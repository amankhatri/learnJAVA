public class Application {
	public static void main(String[] args) {
		//one way top declare boolean primitive datatype
		boolean loop1 = true;
		System.out.println("First way to declare boolean datatype :" + loop1);
		// Another way to declare boolean primitive datatype
		boolean loop2 = 4<5;
		System.out.println("Second way to declare boolean datatype:" + loop2);
		int value = 10;
		boolean loop = value<20;
		System.out.println("Loop is :" + loop);
		while(loop && value <11)
		{
			System.out.println("Loop number = " + loop);
			value++;
		}
		System.out.println("Loop ended");
		
	}
}
