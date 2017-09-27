
public enum Type {

	ELECTRIC("Electric"),
	ACOUSTIC("Acoutic");
	
	public final String eType;
	
	Type(String type){
		
		eType = type;
		
	}
	
	public String geteType() {
		return eType;
	}
	
}
