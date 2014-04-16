
public class Parcel7 {
	
	public Destination destination(final String s){
		return new Destination() {
			private String label=s;
			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				return label;
			}
		};
	}
	
	public static void main(String[] args) {
		Parcel7 p7=new Parcel7();
		Destination d=p7.destination("zxc");
		System.out.println(d.readLabel());
		System.out.println(d.getClass().getName());
	}
}

