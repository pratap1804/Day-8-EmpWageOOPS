
public class Employee {
	
	static int Wage_Per_Hour =20;
	static int Full_Day_Hour =8;
	static int PartTime_Day_Hour =4;
	
	public static void main(String[] args) {
			System.out.println("Welcome To Employee Wage Computation Problem");
	
	int attendance =(int)Math.floor((Math.random()*10)%3);
	
	if(attendance == 0) {
		System.out.println("Employee is absent");
	} else if(attendance ==1) {
		System.out.println("Employee is present");
		int Total_Wage = Wage_Per_Hour*Full_Day_Hour;
		System.out.println("Daily Full Day Wage is: "+Total_Wage);
		} else {
			System.out.println("Employee is part-time present");
			int Total_Wage = Wage_Per_Hour*PartTime_Day_Hour;
			System.out.println("Daily PartTime Wage is: "+Total_Wage);
		}
	}
	
}
