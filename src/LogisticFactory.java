
public class LogisticFactory{
	
	final private String LAND = "LAND";
	final private String SEA = "SEA";
	
	public LogisticInteface getLogistic(String logistic) {
		if(logistic.equalsIgnoreCase(this.LAND)) {
			return new LandLogistic();
		}
		else if(logistic.equalsIgnoreCase(this.SEA)) {
			return new SeaLogistic();
		}
		
		return new AirLogistic();
		
	}
}
