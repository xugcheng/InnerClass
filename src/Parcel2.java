import java.lang.reflect.Modifier;


public class Parcel2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel2 p2=new Parcel2();
		Contents c=p2.contents();
		Destination d=p2.to("深圳");
		System.out.println("c:"+c.getClass().getName()+","+Modifier.toString(c.getClass().getModifiers()));
		System.out.println(c.value());
		System.out.println("d:"+d.getClass().getName()+","+Modifier.toString(d.getClass().getModifiers()));
		System.out.println(d.readLabel());
		
	}
	
	private class PContents implements Contents{

		private int value=11;
		@Override
		public int value() {
			// TODO Auto-generated method stub
			return value;
		}		
	}
	
	private class PDestination implements Destination{

		private String label;
		protected PDestination(String des){
			label=des;
		}
		@Override
		public String readLabel() {
			// TODO Auto-generated method stub
			return label;
		}

	}
	
	public Contents contents(){
		return new PContents();
	}
	
	public Destination to(String des){
		return new PDestination(des);
	}
	
}
