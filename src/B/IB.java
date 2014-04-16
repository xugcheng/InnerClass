package B;

import A.IA;

public class IB {
	protected class IAImpl implements IA{

		@Override
		public String show() {
			// TODO Auto-generated method stub
			return "IAImpl.show()";
		}
		
	}
	
	protected IA getIA(){
		return new IAImpl();
	}
}
