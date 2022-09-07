public class Runner{
	public static void main(String[] args) {
		SCross scross = new SCross("scross");
		scross.setSeats(4);
		scross.setAirbags(2);
		scross.setModel("suzuki");
		scross.setColor("red");
		scross.setType("sedan");
		scross.setYearOfMake(2021);
		scross.setEngineNumber("22SCR2021");
		System.out.println("scross Seat: "+scross.getSeats()+", Airbags: "+scross.getAirbags()+", Model: "+scross.getModel()+
			", Type: "+scross.getType()+", Color: "+scross.getColor()+", YearOfMake: "+scross.getYearOfMake());

		Swift swift = new Swift("swift");
		swift.setSeats(6);
		swift.setAirbags(4);
		swift.setModel("desire");
		swift.setColor("white");
		System.out.println("swift Seat: "+swift.getSeats()+", Airbags: "+swift.getAirbags()+", Model: "+swift.getModel()+
			", Color: "+swift.getColor());
		// 5th
		getTheCarName(swift);

		// 7th 
		scross.maintenence();
		Car scross2 = new SCross("scross");
		scross2.maintenence();
		Car car = new Car("car");
		car.maintenence();
		swift.maintenence();

		XUV xuv = new XUV("xuv");
		BirdAbstract parrot = new ParrotMod();
		parrot.fly();
		parrot.speak();
		Duck duck = new Duck();
		duck.fly();
		duck.speak();
	}
	public static void getTheCarName(Car car){
		switch(car.getClass().getName()){
		case "XUV":
			System.out.println("SUV");
			break;
	
		case "Swift":
			System.out.println("Hatch");
			break;
		
		case "SCross":
			System.out.println("Sedan");
			break;
		default :
			System.out.println("Type not found");
		
	}
	}
	public static void acceptSwift(Swift swift){

	}
}