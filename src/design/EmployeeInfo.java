package design;

public class EmployeeInfo extends FullTimeEmployee implements Employee {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to CnnEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName = "CNN";
	final int number = 1000;
	String name;
	int employeeId;
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(){
		}
	public EmployeeInfo(int employeeId){

		this.employeeId = employeeId;
	}
    public EmployeeInfo(String name, int employeeId){
		this.name = name;
		this.employeeId = employeeId;
		System.out.println("Employee name is " +this.name+" and Id no "+this.employeeId );
	}
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeeBonus(){
		double salary= 80000;
		double performance = 0.08;
		double totalYarlyBonus= salary * performance;
		return (int) totalYarlyBonus;
	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeePension(){
		double salary = 75000;
		int stay =2; ;
		int totalPension= (int) (salary * 0.10);
		return totalPension;
	}

	@Override
	public double computPay() {
		int totalPayment = 8700000;
		return totalPayment;
	}

	@Override
	public int employeeId(){
		int employeeId = 105;
		return employeeId ;
	}
	@Override
	public String employeeName() {
		String name = "Micheal Robin";
		return name;
	}
	@Override
	public void assignDepartment() {
		System.out.println("Robin has been assigned to HR department" );
	}
	@Override
	public int calculateSalary() {
		int monthlySalary = 8000;
		int salary = monthlySalary *12;
		return salary;
	}
	@Override
	public void benefitLayout() {
		System.out.println("Contributions are matched by the company at 150% is the employee contributes a minimum of 8% of their base salary ");
	}
	@Override
	public void employeeStatus() {
		System.out.println(" He is a full time employee");
	}
}
