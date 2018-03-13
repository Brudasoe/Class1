package Classes;

public abstract class Sequence<T> extends Packet {
	protected int channelNr;
	protected String unit;
	protected double resolution;
	protected T[] buffer;
	
	public Sequence(String device, String description, long date, int channelNr, String unit, double resolution, int s){
		super(device, description, date);
		this.channelNr = channelNr;
		this.unit = unit;
		this.resolution = resolution;
		this.buffer = (T[]) new Object[s];
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "Sequence{" +
				"channelNr=" + channelNr +
				", unit='" + unit + '\'' +
				", resolution=" + resolution +
				", buffer=" + java.util.Arrays.toString(buffer) +
				'}';
	}
}
