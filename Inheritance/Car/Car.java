public class Car{
	private int yearOfMake;
	private String engineNumber, type;
	public Car(String name){
		System.out.println(name);
	}
	public void setYearOfMake(int yearOfMake){
		this.yearOfMake = yearOfMake;
	}
	public void setEngineNumber(String engineNumber){
		this.engineNumber = engineNumber;
	}
	public void setType(String type){
		this.type = type;
	}
	public int getYearOfMake(){
		return yearOfMake;
	}
	public String getEngineNumber(){
		return engineNumber;
	}
	public String getType(){
		return type;
	}
	public void maintenence(){
		System.out.println("Car under maintenence");
	}
}