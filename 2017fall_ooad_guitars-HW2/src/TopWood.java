
public enum TopWood {
	
	INDIAN_ROSEWOOD("IndianRoseWood"),
	BRAZILLIAN_ROSEWOOD("BrazillianRoseWood"),
	MAHOGANY("Mahogany"),
	MAPLE("Maple"),
	COCOBOLO("Cocobolo"),
	CEDAR("Cedar"),
	ADIRONDACK("Adirondack"),
	ALDER("Alder"),
	SITKA("Stika");
	
	public final String eTopWood;
	
	TopWood(String topWood){
		
		eTopWood = topWood;
	}
	
	public String geteTopWood() {
		
		return eTopWood;
		
	}

}
