package inherit;

public class InheritInner extends WithInner.Inner {
	public InheritInner(WithInner wi) {
		wi.super();
	}
	public static void main(String[] args){
		WithInner wi=new WithInner();
		InheritInner ii=new InheritInner(wi);
		System.out.println(ii.getClass().getName());
	}
}

class WithInner{
	class Inner{
		
	}
}