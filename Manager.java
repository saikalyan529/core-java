package Assignment3;

public class Manager extends Employee {
	Manager(int a,String b){
		this.empId=a;
		this.empName=b;
	}
public double SalCal(int a) {
	this.empSalary=a*1.15;
	return this.empSalary;
}
public static void main(String[]arg) {
	Manager e1=new Manager(100,"sai kalyan");
	e1.SalCal(25000);
	e1.display();

}
}
