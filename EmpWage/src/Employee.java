
public class Employee {
	
	static int Wage_Per_Hour =20;
	static int Full_Day_Hour =8;
	static int PartTime_Day_Hour =4;
	static int Working_Day_Per_Month =0;
	static int Total_Working_Hours =0;
	
	
	
	
	
	
	public static int attendanceCheck() {
		int attendance =(int)Math.floor((Math.random()*10)%3);
			
		switch (attendance) {
		
		case 0:
		System.out.println("Employee is absent");
		break;
		
		case 1:
			System.out.println("Employee is present");
			int Total_Wage = Wage_Per_Hour*Full_Day_Hour*Working_Day_Per_Month;
			System.out.println("Monthly Full Day Wage is: "+Total_Wage);
			break;
			
		case 2:
			System.out.println("Employee is part-time present");
			int Total_Wage1 = Wage_Per_Hour*PartTime_Day_Hour*Working_Day_Per_Month;
			System.out.println("Monthly PartTime Wage is: "+Total_Wage1);
			break;
				}
		return attendance;
	}
	
	
	public static void main(String[] args) {
			System.out.println("Welcome To Employee Wage Computation Problem");
	
			while(Working_Day_Per_Month <21 && Total_Working_Hours <100) {
				attendanceCheck();
				Total_Working_Hours++;
				Working_Day_Per_Month++;
			}
			
		}
	}
	



