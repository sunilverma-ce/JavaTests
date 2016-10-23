package oopsConcepts;

/*
 * @author Sunil Verma
 */
interface TestInterfaceA {
	// Without Initialization not allowed to create variables
	int a = 0;
	
	// Multiple modifiers
	public String test = "";
	// Not allowed
//	private int b=0;
//	protected int c =0;
	
	void show();
	
	// Can not have constructor
//	TestInterfaceA(){}
	
}
