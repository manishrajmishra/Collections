package setshashsets;

public class DogMain {
	public static void main(String args[]) {
		Labrador rover = new Labrador("Rover");
		Dog rover2 = new Dog("Rover");
		
		System.out.println(rover2.equals(rover)); // output is true because labrador is the instance of dog
		System.out.println(rover.equals(rover2)); // output is false because dog is not the instance of labrador
//		to ensure that the output is true in both the case we have to comment the override method in labrador class
//		or we have to make the method declared in dog as final
	}
}