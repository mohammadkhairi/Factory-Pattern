
public class AirLogistic implements LogisticInteface{
	
	public String getDescription() {
		return "This is Air Logistic Object Description";
	}

	@Override
	public String[] getTransportations() {
		// TODO Auto-generated method stub
		String[] listLandOfTransporation = {"AEROPLANE","HELICOPTER","KIROV REPORTING"};
		return listLandOfTransporation;
	}
	
}
