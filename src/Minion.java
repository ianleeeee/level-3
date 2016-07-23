
public class Minion {
	private String name; 
	 	private int eyes; 
	 	private String color; 
	 	private String master;
	public Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	
	}
	String getName(){
		return name;
	}
	
	int getEyes(){
		return eyes;
	}
	
	String getColor(){
		return color;
	}
	String getMaster(){
		return master;
	}
	
	void setName(String Name){
		this.name=Name;
	}
	void setEyes(int eyes){
		this.eyes=eyes;
		
	}
	void setColor(String Color){
		this.color = Color;
	}
	void setMaster(String Master){
		this.master = Master;
	}

}
