package event;

/**
 * 事件抽象类,默认按时间触发的事件.
 * @author xugc
 *
 */
public abstract class Event {
	private long eventTime;
	protected final long delayTime;
	public Event(long delayTime){
		this.delayTime=delayTime;
	}
	public void start(){
		eventTime=System.nanoTime()+delayTime;
	}
	public boolean ready(){
		return System.nanoTime() >= eventTime;
	}
	public abstract void action();
}
