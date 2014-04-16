
public class Parcel8 {

	public Warpping warpping(int x){
		return new Warpping(x){
			public int value(){
				return super.value()*47;
			}
		};
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parcel8 p8=new Parcel8();
		Warpping w=p8.warpping(2);
		System.out.println(w.value());
		System.out.println(w.getClass().getName()+",super-class:"+w.getClass().getSuperclass().getName());
	}

}

class Warpping{
	private int i;
	public Warpping(int x) {
		i=x;
	}
	public int value(){
		return i*10;                                              
	}
}
