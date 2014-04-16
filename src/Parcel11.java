import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 嵌套类，用static修饰的内部类就是嵌套类。嵌套类对象不持有外围类的引用。
 * @author xugc
 *
 */
public class Parcel11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contents contents=contents();
		Destination destination=destination("北京");
		System.out.println(contents.value());
		System.out.println(destination.readLabel());
		System.out.println("Contents:"+contents.getClass().getName()+","+Modifier.toString(contents.getClass().getModifiers()));
		System.out.println("Destination:"+destination.getClass().getName()+","+Modifier.toString(destination.getClass().getModifiers()));
		//
		Field[] fields;
		fields=contents.getClass().getDeclaredFields();
		for(Field field : fields){
			System.out.println(field.getName());
		}
		fields=destination.getClass().getDeclaredFields();
		for(Field field : fields){
			System.out.println(field.getName());
		}
		//
		Class<?>[] classes = Parcel11.class.getDeclaredClasses();
		for(Class<?> c : classes){
			System.out.println(c.getName());
		}
		
	}

	private static class PContents implements Contents{
		private int i=11;
		@Override
		public int value() {
			// TODO Auto-generated method stub
			return i;
		}
	}
	
	protected static class PDestination implements Destination{

		private String label;
		private PDestination(String dest){
			label=dest;
		}
		@Override
		public String readLabel() {
			// TODO Auto-generated method stub
			return label;
		}
		//Nested classes
		public static void f(){}
		static int x=12;
		static class AnotherLevel{
			static void f(){}
		}
	}
	
	public static Contents contents(){
		return new PContents();
	}
	
	public static Destination destination(String dest){
		return new PDestination(dest);
	}
	
}
