//The body mass index (BMI) is commonly used by health and nutrition professionals to estimate 
//human body fat in populations. It is computed by taking the individual's weight (mass) in 
//kilograms and dividing it by the square of their height in meters. i.e.
//Metric: BMI = 𝑾𝒆𝒊𝒈𝒉𝒕 (𝒌𝒈)/(𝑯𝒆𝒊𝒈𝒉𝒕)𝟐 (𝒎𝟐)

import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner op = new Scanner (System.in);
System.out.println("Enter Weight in Kg");
double w = op.nextDouble();
System.out.println("Enter Height in m");
double h = op.nextDouble();
double bmi = w/(h*h);
if(bmi<18.5)
	System.out.println("Underweight");
else if(bmi>18.5 && bmi<24.9)
	System.out.println("Normal Weight");
else if(bmi>25.0 && bmi<29.9)
	
	System.out.println("Overweight");
else 
	System.out.println("Obese");
	}

}
