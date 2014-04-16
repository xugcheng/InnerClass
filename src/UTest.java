
public class UTest {

	public static void main(String[] args) {
		Ao a=new Ao();
		Bo b=new Bo(5);
		for(int i=0;i<5;i++){
			b.addU(a.getU());
		}
		b.CallU();
		b.remove();
		b.CallU();
	}

}

interface U{
	void x();
	void y();
	void z();
}

class Ao{
	U getU(){
		return new U(){

			@Override
			public void x() {
				System.out.println("Anonymous U.x()");
			}

			@Override
			public void y() {
				System.out.println("Anonymous U.y()");
			}

			@Override
			public void z() {
				System.out.println("Anonymous U.z()");
			}
			
		};
	}
}

class Bo{
	private U[] us;
	private int i=0;
	Bo(int i) {
		us=new U[i];
	}
	public void addU(U u){
		if(i<us.length){
			us[i++]=u;
		}
	}
	public void remove(){
		for(int j=0,len=us.length;j<len;j++){
			us[j]=null;
		}
	}
	public void CallU(){
		for(int j=0,len=us.length;j<len;j++){
			System.out.println(j+":");
			if(us[j]!=null){
				us[j].x();
				us[j].y();
				us[j].z();
			}
		}
	}
}
