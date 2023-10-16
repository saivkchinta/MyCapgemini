package com.cg;
public class Employee {
	int empid;
	String empName;
	int basicPay;
	int bonus;
	int da;
	int hra;
	int loan;
	int pf;
	int tax;
	public Employee(int empid, String empName, int basicPay, int bonus, int da, int hra, int loan, int pf, int tax) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.basicPay = basicPay;
		this.bonus = bonus;
		this.da = da;
		this.hra = hra;
		this.loan = loan;
		this.pf = pf;
		this.tax = tax;
	}
	
	public void getEmpdetails() {
		System.out.println("EmpID"+ empid);
		System.out.println("Name of emp"+empName);
		System.out.println("Basic pay"+basicPay);
		System.out.println("BONUS"+bonus);
		System.out.println("Da"+da);
		System.out.println("Hra"+hra);
		System.out.println("Pf"+pf);
		System.out.println("Tax"+tax);
		System.out.println("Loan"+loan);

	}
	public void generateSalary() {
		int grossSalary = basicPay+bonus+da+hra;
		int deduction = loan+pf+tax;
		int netSalary =grossSalary-deduction;
		System.out.println(netSalary);
		
	}

	
	

}
