
public class MultiInterfaces {

	static void tasksA(A a){};
	static void tasksB(B b){};
	public static void main(String[] args) {
		X x=new X();
		tasksA(x);
		tasksB(x);
		//
		Y y=new Y();
		tasksA(y);
		tasksB(y.makeB());
	}

}

interface A {};
interface B {};

class X implements A,B{
	
}

class Y implements A{
	B makeB(){
		return new B(){
			
		};
	}
}