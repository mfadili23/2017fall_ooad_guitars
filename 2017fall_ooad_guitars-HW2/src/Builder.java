
public enum Builder {

	FENDER("Fender"),
	MARTIN("Martin"),
	GIBSON("Gibson"),
	COLLING("Colling"),
	OLSON("Olson"),
	RYAN("Ryan"),
	PRS("PRS");
	
	public final String eBuild;
	
	Builder(String builder){
		
		eBuild = builder;
		
	}
	
	public String geteBuild() {
		return eBuild;
	}
	
}
