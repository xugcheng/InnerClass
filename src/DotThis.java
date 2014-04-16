
public class DotThis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DotThis dThis=new DotThis();
		DotThis.Inner dti=dThis.inner();
		dti.outer().f();
	}

	public void f(){
		System.out.println("DotThis.f()");
	}
	
	Inner inner(){
		return new Inner();
	}
	
	class Inner{
		DotThis outer(){
			return DotThis.this;
		}
	}
}
