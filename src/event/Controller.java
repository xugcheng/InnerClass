package event;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	private List<Event> events=new ArrayList<Event>();
	public void addEvent(Event e){
		events.add(e);
	}
	public void run(){
		while(events.size()>0){
			for(Event e : new ArrayList<Event>(events)){
				if(e.ready()){
					System.out.println(e);
					e.action();
					events.remove(e);
				}
			}
		}
	}
}
