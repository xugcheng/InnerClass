

public class ParcelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel p=new Parcel();
		Parcel.Contents c=p.cont();
		Parcel.Contents c1=p.new Contents();
		System.out.println(c.value());
		System.out.println(c1.value());
		Parcel.Destination d=p.to("sz");
		Parcel.Destination d1=p.new Destination("gz");
		System.out.println(d.readLabel());
		System.out.println(d1.readLabel());
	}

}
