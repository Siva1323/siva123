package basicConcepts;

public class Test6 implements interface_class{
	
	public static void main(String[] args) {
		
		interface_class L1 = new Test6();
		
		L1.hello2();

}

	@Override
	public void hello2() {
		
		System.out.println("Hello");
		
	}
}
