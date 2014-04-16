
public class SequenceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequence sequence=new Sequence(10);
		Class<?>[] classes=sequence.getClass().getDeclaredClasses();
		Class<?>[] classes2=Parcel.class.getDeclaredClasses();
		System.out.println("***********************Sequence:");
		for(Class<?> c: classes){
			System.out.println(c.getName());
		}
		System.out.println("***********************Parcel:");
		for(Class<?> c: classes2){
			System.out.println(c.getName());
		}
		//sequence.new SequenceSelector(); //error
	}

}
