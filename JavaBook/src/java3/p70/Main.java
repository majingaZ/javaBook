package java3.p70;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		System.out.println("b.field1 : " + b.field1);
		
		A.B.field2 = 4;
		System.out.println("A.B.field2 : " + A.B.field2);
		A.B.method2();
	}

}
