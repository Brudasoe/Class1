package Classes;

public abstract class Packet {
	protected String device;
	protected String description;
	protected long date;
	
	public Packet(String device, String description, long date){
		this.device= device;
		this.description = description;
		this.date = date;
	}

    @java.lang.Override
    public java.lang.String toString() {
        return "Packet{" +
                "device='" + device + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
