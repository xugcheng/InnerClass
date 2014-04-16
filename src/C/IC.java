package C;

import A.IA;
import B.IB;

public class IC extends IB {
	public static void main(String[] args){
		IC c=new IC();
		System.out.println(c.getIA().show());
		System.out.println("*******************");
		Class<?>[] classes=IB.class.getDeclaredClasses();
		for(Class<?> cls : classes){
			System.out.println(cls.getName());
		}
		//c.new IAImpl().show();
	}
}
