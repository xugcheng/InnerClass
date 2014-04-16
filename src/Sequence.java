import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


public class Sequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequence sequence=new Sequence(10);
		for(int i=0;i<10;i++){
			sequence.add(new Integer(i));
		}
		Selector selector=sequence.selector();
		System.out.println("Selector:"+selector.getClass().getName()+","+Modifier.toString(selector.getClass().getModifiers()));
		while(!selector.end()){
			System.out.print(selector.current()+" ");
			selector.next();
		}
		System.out.println();
		//
		Selector reverSelector=sequence.reverSelector();
		System.out.println("Selector:"+reverSelector.getClass().getName()+","+Modifier.toString(reverSelector.getClass().getModifiers()));
		while(!reverSelector.end()){
			System.out.print(reverSelector.current()+" ");
			reverSelector.next();
		}
		System.out.println();
		//
		Field[] fields=SequenceSelector.class.getDeclaredFields();
		for(Field f:fields){
			System.out.println(f.getName()+","+f.toGenericString()+","+Modifier.toString(f.getModifiers()));
		}
	}

	private Object[] items;
	private int index=0;
	public Sequence(int i){
		items=new Object[i];
	}
	public void add(Object item){
		if(index<items.length){
			items[index++]=item;
		}
	}
	public Selector selector(){
		return new SequenceSelector();
	}
	
	public Selector reverSelector(){
		return new ReverseSelector();
	}
	
	private class SequenceSelector implements Selector{
		private int i=0;
		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return items[i];
		}

		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i==items.length;
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if(i<items.length)
				i++;
		}
		
	}
	
	private class ReverseSelector implements Selector{

		private int i=items.length-1;
		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return items[i];
		}

		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i<0;
		}

		@Override
		public void next() {
			if(i>=0)
				i--;
		}
		
	}
}

interface Selector{
	boolean end();
	Object current();
	void next();
}
