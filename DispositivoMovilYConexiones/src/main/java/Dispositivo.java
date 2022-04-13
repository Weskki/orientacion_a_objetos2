
public class Dispositivo {
	
	private Connection connection;
	private CrcCalculator crcCalculator;
	private Ringer ringer;
	private Display display;
	
	public Dispositivo(Connection aConnection,Ringer aRinger,Display aDisplay,CrcCalculator aCrcCalculator) {
		connection = aConnection;
		ringer = aRinger;
		display = aDisplay;
		crcCalculator = aCrcCalculator;
	}
	
	public String send(String data) {
		return null;
	}
}
