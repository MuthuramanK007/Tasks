public class SCross extends Car{
	private int seats, airbags;
	private String model, color;
	public SCross(String name){
		super(name);
	}
	public void setSeats(int seats){
		this.seats = seats;
	}
	public void setAirbags(int airbags){
		this.airbags = airbags;
	}
	public void setModel(String model){
		this.model = model;
	}
	public void setColor(String color){
		this.color = color;
	}
	public int getSeats(){
		return seats;
	}
	public int getAirbags(){
		return airbags;
	}
	public String getModel(){
		return model;
	}
	public String getColor(){
		return color;
	}
	public void maintenence(){
		System.out.println("Maruti Scross under maintenence");
	}

}