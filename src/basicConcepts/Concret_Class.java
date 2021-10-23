package basicConcepts;

public class Concret_Class extends Abstract_class {

	public static void main(String[] args) {
		
		Abstract_class A1= new Concret_Class();      // reference object
		A1.Hello();
		
		//System.out.println("Hello World");

	}

	@Override
	public void Hello() {
		System.out.println("Abstract method implemented");
		
	}

}
