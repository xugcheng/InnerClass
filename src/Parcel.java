
public class Parcel {
	class Contents{
		private int i;
		public int value(){
			return i;
		}
	}
	class Destination{
		private String label;
		Destination(String label){
			this.label=label;
		}
		String readLabel(){
			return label;
		}
	}
	
	public Destination to(String dis){
		return new Destination(dis);
	}
	public Contents cont(){
		return new Contents();
	}
}
