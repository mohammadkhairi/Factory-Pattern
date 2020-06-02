
public class SeaLogistic implements LogisticInteface{
	
	public String getDescription() {
		return "This is SEA Logistic Object Description";
	}

	@Override
	public String[] getTransportations() {
		// TODO Auto-generated method stub
		String[] listOfSeaTransporation = {"SHIP","SUBMARINE"};
		return listOfSeaTransporation;
	}
	
	
}
