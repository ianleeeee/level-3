
public class Person {
	Boolean isSmelly;
	int height;
	String superPower;
	public Person(Boolean isSmelly, int height, String superPower) {
		super();
		this.isSmelly = isSmelly;
		this.height = height;
		this.superPower = superPower;
	}
	public Boolean getIsSmelly() {
		return isSmelly;
	}
	public void setIsSmelly(Boolean isSmelly) {
		this.isSmelly = isSmelly;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getSuperPower() {
		return superPower;
	}
	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}
	public String toString(){
		return ""+isSmelly + height + superPower;
		
	}
	
}
