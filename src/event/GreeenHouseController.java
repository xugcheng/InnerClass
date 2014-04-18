package event;

public class GreeenHouseController {
	
	public static void main(String[] args) {
		GreenHouseControls gc=new GreenHouseControls();
		gc.addEvent(gc.new Bell(900)); 
		Event[] events={
			gc.new ThermostatNight(0),
			gc.new WaterOn(200),
			gc.new WaterOff(400),
			gc.new LightOn(600),
			gc.new LightOff(800),
			gc.new ThermostatDay(1400)
		};
		gc.addEvent(gc.new Restart(2000, events));
		if(args.length==1){
			gc.addEvent(
				new GreenHouseControls.Terminate(Integer.parseInt(args[0]))
			);
		}
		gc.run();
	}

}
