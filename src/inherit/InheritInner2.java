package inherit;

import inherit.Outer.Inner;

import java.lang.reflect.Field;

public class InheritInner2 extends Outer.Inner {
	public InheritInner2(int i,Outer outer) {
		outer.super(i);
	}
	public static void main(String[] args) {
		Outer outer=new Outer();
		InheritInner2 ii2=new InheritInner2(2, outer);
		System.out.println(ii2.value());
		Field[] fields;
		//
		System.out.println("***********Outer.Inner************");
		Inner inner=outer.new Inner(4);
		fields=inner.getClass().getDeclaredFields();
		for(Field field : fields){
			System.out.println(field.getName());
		}
		//
		System.out.println("***********InheritInner2************");
		fields=ii2.getClass().getDeclaredFields();
		for(Field field : fields){
			System.out.println(field.getName());
		}
		
	}

}

class Outer {
	public static double sqrt(int n){
		return Math.sqrt(n);
	}
	class Inner{
		private int x;
		public Inner(int i) {
			x=i;
		}
		public double value(){
			return sqrt(x);
		}
	}
}
