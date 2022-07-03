package com.greatlearning.models;

//Declaring Admin Department Class
public class AdminDepartment extends SuperDepartment {

	private String departmentName = "Admin Department";
	private String todaysWork = "Complete your documents Submission";
	private String workDeadline = "Complete by EOD";
	
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
}
