package programming.practice.chapter6.oop.exercise_BMI;

public class BMITest {

	public static void main(String[] args) {
		
		BMI bmi = new BMI("Md. Tanvir Hossain", 145, 70);
		
		System.out.println("The BMI for "+ bmi.getName() + " is " + bmi.getBMI() + " and status is "+ bmi.getBMIStatus());

	}

}
