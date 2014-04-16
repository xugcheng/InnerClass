
/**
 * 测试Inner Class的作用域，在if(){}的快作用域中定义的内部类，在作用域外部不能访问
 * @author xugc
 *
 */
public class Parcel6 {
	
	private void internalTrack(boolean b){
		if(b){
			class TrackSlip{
				private String id;
				TrackSlip(String s) {
					id=s;
				}
				String getId(){
					return id;
				}
			}
			TrackSlip ts=new TrackSlip("zyx");
			System.out.println("id="+ts.getId());
		}
		//error, out of scope
		//TrackSlip ts=new TrackSlip("zyx");
		//System.out.println("id="+ts.getId());
	}
	
	public void track(){
		internalTrack(true);
	}
	
	public Destination destination(String s){
		if(s.length()==1){
			  class PDestination implements Destination{
				private String label;
				PDestination(String s){
					label=s;
				}
				@Override
				public String readLabel() {
					return label;
				}
			}
			return new PDestination("s1");
		}else{
			return null;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parcel6 p6=new Parcel6();
		p6.track();
		Destination d=p6.destination("x");
		System.out.println(d.readLabel());
		System.out.println(d.getClass().getName());
	}

}
