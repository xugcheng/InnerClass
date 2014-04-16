package event;

public class GreenHouseControls extends Controller {
	private boolean light=false;
	private boolean water=false;
	private String thermostat = "Day";
	
	public class LightOn extends Event{
		public LightOn(long delayTime) {
			super(delayTime);
		}
		
		@Override
		public void action() {
			light=true;
		}
		
		public String toString(){
			return "Light is on";
		}
	}
	
	public class LightOff extends Event{

		public LightOff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			light=false;
		}
		
		public String toString(){
			return "Light is off";
		}
	}
	
	public class WaterOn extends Event{

		public WaterOn(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			water=true;
		}
		
		public String toString(){
			return "Water is on";
		}
	}
	
	public class WaterOff extends Event{

		public WaterOff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			water=false;
		}
		
		public String toString(){
			return "Water is off";
		}
	}
	
	public class ThermostatNight extends Event{

		public ThermostatNight(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			thermostat="Night";
		}
		
		public String toString(){
			return "Thermostat on night setting";
		}
	}
	
	public class ThermostatDay extends Event{

		public ThermostatDay(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			thermostat="Day";
		}
		
		public String toString(){
			return "Thermostat on day setting";
		}
		
	}
	
	public class Bell extends Event{

		public Bell(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			addEvent(new Bell(delayTime));
		}
		
		public String toString(){
			return "Bell bing";
		}
		
	}
	
	public class Restart extends Event{
		
		private Event[] eventList;
		
		public Restart(long delayTime,Event[] events) {
			super(delayTime);
			eventList=events;
			for(Event e : eventList){
				addEvent(e);
			}
		}
		
		@Override
		public void action() {
			for(Event e : eventList){
				e.start();
				addEvent(e);
			}
			start();
			addEvent(this);
		}

		public String toString(){
			return "Restarting System";
		}
	}
	
	public static class Terminate extends Event{

		public Terminate(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			System.exit(0);
		}
		
		public String toString(){
			return "Terminating";
		}
		
	}
}
