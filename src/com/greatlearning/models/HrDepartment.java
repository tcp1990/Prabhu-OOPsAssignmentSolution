package com.greatlearning.models;

//Declaring Hr Department Class
public class HrDepartment extends SuperDepartment {
	
	private String departmentName = "HR Department";
	private String todaysWork = "Fill today's timesheet and mark your attendance";
	private String workDeadline = "Complete by EOD";
	private String activity = "team Lunch";

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

	public String doActivity() {
		return activity;
	}
}
