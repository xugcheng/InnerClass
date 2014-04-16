
public class Parcel5 {

	public Destination destination(String s){
		class PDestination implements Destination{
			private String label;
			private PDestination(String dest) {
				label=dest;
			}
			@Override
			public String readLabel() {
				return label;
			}
		}
		return new PDestination(s);
	}
	
	/**
	 * @param args
	 */
 	public static void main(String[] args) {
 		Parcel5 p5=new Parcel5();
 		Destination d=p5.destination("深圳");
 		System.out.println(d.readLabel());
 		System.out.println(d.getClass().getName());
 	}
 	
}
