package com.greatlearning.models;

//Declaring Tech Department Class
public class TechDepartment extends SuperDepartment {

	private String departmentName = "Tech Department";
	private String todaysWork = "Complete coding of Module 1";
	private String workDeadline = "Complete by EOD";
	private String techStackInformation = "Core Java";
	
	@Override
	public String departmentName() {
		return departmentName;
	}

	@Override
	public String getTodaysWork() {
		return todaysWork;
	}

	@Override
	public String getWorkDeadline() {
		return workDeadline;
	}

	public String getTechStackInformation() {
		return "Core Java";
	}
}
