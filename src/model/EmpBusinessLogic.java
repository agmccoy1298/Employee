package model;

/**
 * @author andrewmccoy - agmccoy
 * CIS175 - Fall 2021
 * Jan 20, 2023
 */
public class EmpBusinessLogic {
	
	public double calculateYearlySalary(Employee employee) {
		double yearlySalary = 0;
		yearlySalary = employee.getMonthlySalary() * 12;
		return yearlySalary;
	}
	
	public double calculateAppraisal(Employee employee) {
		double appraisal = 0;
		
		if(employee.getMonthlySalary() < 10000) {
			appraisal = 500;
		} else {
			appraisal = 1000;
		}
		
		return appraisal;
	}
	
	public boolean isRetirementAge(Employee employee) {		
		int retirementAge = 65;
		if(employee.getAge() >= retirementAge) {
			return true;
		} else {
			return false;
		}
	}
}
