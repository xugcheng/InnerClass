package inherit;

/**
 * 内部类不能被覆盖
 * @author xugc
 *
 */
public class BigEgg extends Egg{
	class Yolk{
		public Yolk(){
			System.out.println("BigEgg.Yolk()");
		}
	}
	public static void main(String[] args) {
		BigEgg bEgg=new BigEgg();
	}
}

class Egg{
	private Yolk y;
	public Egg(){
		System.out.println("new Egg()");
		y=new Yolk();
	}
	protected class Yolk{
		public Yolk(){
			System.out.println("Egg.Yolk()");
		}
	}
}
