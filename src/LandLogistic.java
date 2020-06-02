
public class LandLogistic implements LogisticInteface{
	
	public String getDescription() {
		return "This is Land Logistic Object Description";
	}

	@Override
	public String[] getTransportations() {
		// TODO Auto-generated method stub
		String[] listLandOfTransporation = {"CAR","LORRY"};
		return listLandOfTransporation;
	}
	
}
