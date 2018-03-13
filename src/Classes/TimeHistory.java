package Classes;

public class TimeHistory extends Sequence {
	private double sensitivity;
	
	public TimeHistory( String device, 
						String description, 
						long date,
						int channelNr,
						String unit,
						double resolution,
						int s,
						double sensitivity){
		super(device, description, date, channelNr, unit, resolution,s);
		this.sensitivity = sensitivity;
	}

    @java.lang.Override
    public java.lang.String toString() {
        return "TimeHistory{" +
				"device='" + device+ '\'' +
				"description='" + description+ '\'' +
				"date='" + date+ '\'' +
				"channelNr='" + channelNr+ '\'' +
				"unit='" + unit+ '\'' +
				"resolution='" + resolution+ '\'' +
				"buffer=" + java.util.Arrays.toString(buffer)+ '\'' +
				"sensitivity='" + sensitivity+ '\'' +
				'}';
    }
}
