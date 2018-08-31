package com.capgemini.day5;

public class taxCalculator {
	private String empName;
	private boolean isIndian;
	private double empSal;

	public taxCalculator() {
		super();
	}

	public taxCalculator(String empName, boolean isIndian, double empSal) {
		super();
		this.setEmpName(empName);
		this.setIndian(isIndian);
		this.setEmpSal(empSal);
	}

	public static double calculateTax(String empName,boolean isIndian,double empSal) throws TaxNotEligibleException,
	EmployeeNameNotValidException, CountryNotValidException{
		double taxAmount;
		if(isIndian) {
			if( empName=="" || empName==null)
				throw new EmployeeNameNotValidException("The employee name cannot be empty");
			else {
				if(empSal>100000)
					taxAmount=empSal*0.08;
				else if(empSal>50000 && empSal<100000)
					taxAmount=empSal*0.06;
				else if(empSal>30000 && empSal<50000)
					taxAmount=empSal*0.05;
				else if(empSal>10000 && empSal<30000)
					taxAmount=empSal*0.04;
				else
					throw new TaxNotEligibleException("The employee doesnot need to pay tax");
			}
		}
		else
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		return taxAmount;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public boolean isIndian() {
		return isIndian;
	}

	public void setIndian(boolean isIndian) {
		this.isIndian = isIndian;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
}
