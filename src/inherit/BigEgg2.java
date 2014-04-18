package inherit;

public class BigEgg2 extends Egg2 {
	public static void main(String[] args) {
		BigEgg2 bEgg2=new BigEgg2();
		System.out.println("*****************");
		bEgg2.g();
	}

	public class Yolk extends Egg2.Yolk{
		public Yolk(){
			System.out.println("BigEgg2.Yolk()");
		}
		public void f(){
			System.out.println("BigEgg2.Yolk.f()");
		}
	}
	
	public BigEgg2(){
		insertYolk(new Yolk());
	}
}

class Egg2{
	
	protected class Yolk{
		public Yolk(){
			System.out.println("Egg2.Yolk()");
		}
		public void f(){
			System.out.println("Egg2.Yolk.f()");
		}
	}
	
	private Yolk y=new Yolk();
	public Egg2(){
		System.out.println("new Egg2()");
	}
	public void insertYolk(Yolk yolk){
		y=yolk;
	}
	public void g(){
		y.f();
	}
}