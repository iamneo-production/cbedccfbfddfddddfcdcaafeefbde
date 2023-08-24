package controller;

public class CalculateBMI {

	//Enter the code here....
	public static double calculate(double height,double weight){
		double meter=(height/100);
		double meter2=meter*meter;
		return (weight/meter2);
	}
	public static String description(double bmii){
		String res="";
		if(bmii<18.5){
			res="Under Weight";
		}
		else if(bmii>=18.5 && bmii<24.9){
			res="Normal";
		}
		else if(bmii>=25 && bmii<29.9){
			res="Over Weight";
		}
		else if(bmii>=30 && bmii<34.9){
			res="Obese";
		}
		else if(bmii>35){
			res="Extremely Obese";
		}
		return res;
	}
}
