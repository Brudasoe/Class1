package Classes;

public class Alarm extends Packet {
	private int channelNr;
	private double threshold;
	private int direction;
	
	public Alarm(String device, 
			String description, 
			long date, 
			int channelNr,
			double threshold,
			int direction){
		super(device, description, date);
		this.channelNr = channelNr;
		this.threshold = threshold;
		this.direction = direction;
	}

    @java.lang.Override
    public java.lang.String toString() {
        return "Alarm{" +
				"device='" + device+ '\'' +
				"description='" + description+ '\'' +
				"date='" + date+ '\'' +
				"channelNr='" + channelNr+ '\'' +
				"threshold='" + threshold+ '\'' +
				"direction='" + direction+ '\'' +
				'}';
    }
}
