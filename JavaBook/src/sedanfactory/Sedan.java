package sedanfactory;

public class Sedan {
	public static void main(String[] args) {
		component.Tire compoTire = new component.Tire();
//		compoTire.size = 20;
		compoTire.setSize(20);
		
//		System.out.println(compoTire.size);
		System.out.println(compoTire.getSize());
		
		compoTire.setDoubleSize();
		System.out.println(compoTire.getSize());
	}

}
