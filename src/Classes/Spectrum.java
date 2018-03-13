package Classes;

public class Spectrum extends Sequence {
	public String scaling;
	
	public Spectrum(String device, 
					String description, 
					long date,
					int channelNr,
					String unit,
					double resolution,
					int s,
					String scaling){
		super(device, description, date, channelNr, unit, resolution, s);
		this.scaling = scaling;
	}

    @java.lang.Override
    public java.lang.String toString() {
        return "Spectrum{" +
				"device='" + device+ '\'' +
				"description='" + description+ '\'' +
				"date='" + date+ '\'' +
				"channelNr='" + channelNr+ '\'' +
				"unit='" + unit+ '\'' +
				"resolution='" + resolution+ '\'' +
                "buffer=" + java.util.Arrays.toString(buffer)+ '\'' +
                "scaling='" + scaling + '\'' +
                '}';
    }
}
