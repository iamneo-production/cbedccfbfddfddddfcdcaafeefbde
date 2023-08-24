package controller;

public class CalculateBMI {

	//Enter the code here....
	public static double calculate(double height,double weight){
		double meter=(height/100);
		double meter2=meter*meter;
		return (weight/meter2);
	}
}
