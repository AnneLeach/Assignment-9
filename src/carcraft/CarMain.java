
package carcraft;


public class CarMain {

	public static void main(String[] args) {

		System.out.println("\n----------------------------------------------------------------------------");
		System.out.println("WELCOME TO THE CAR-BERNATOR 2000");
		System.out.println("Initiating automated car manufacturing plant...");
		System.out.println("Androids booted.  Initializing base model...");

		ICar carMod = new SuperCharger(new paintColor(new BasicCar()));
		System.out.println("\tDone. Here is your car: ");
		System.out.println("\t" + carMod.GetDescription());

	/*	System.out.println("\nMake a Painted Car:");
		ICar paintColor = new paintColor();
		System.out.println("Done. Here is your car: " + paintColor.GetDescription());

		System.out.println("\nMake a car with Sports Wheels:");
		ICar SportsWheels = new SportWheels();
		System.out.println("Done. Here is your car: " + SportsWheels.GetDescription());

		System.out.println("\nMake a car with an Air Scoop:");
		ICar AirScoop = new AirScoop();
		System.out.println("Done. Here is your car: " + AirScoop.GetDescription());

		System.out.println("\nMake a basic car:");
		ICar BasicCar = new BasicCar();
		System.out.println("Done. Here is your car: " + BasicCar.GetDescription());

		System.out.println("\nMake a basic car with options");
		ICar CarOptions = new CarOptions();
		System.out.println("Done. Here is your car: " + CarOptions.GetDescription());*/

		System.out.println("\n-----------------------------------------------\n");
	}

}
