package Assignment3;

public class Tester extends Employee {
		Tester(int a,String b){
			this.empId=a;
			this.empName=b;
		}
	public double SalCal(int a) {
		this.empSalary=a*1.1;
		return this.empSalary;
	}
	public static void main(String[]arg) {
		Tester e1=new Tester(100,"sai kalyan");
		e1.SalCal(25000);
		e1.display();

	}
	}


