
// A simple program to Test Interface default
// methods in java
interface TestInterface
{
	// abstract method
	
	public void square(int a);

	// default method
	default int show(int i)
	{
	System.out.println(++i);
	return i;
	}
}

class TestClassDefaultr implements TestInterface
{
	// implementation of square abstract method
	public void square(int a)
	{
		System.out.println(a*a);
	}

	public static void main(String args[])
	{
		TestClassDefaultr d = new TestClassDefaultr();
		d.square(4);

		// default method executed
		d.show(5);
		System.out.println(d);
	}
}

