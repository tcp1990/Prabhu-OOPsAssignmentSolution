package com.greatlearning.models;

//Declaring Super Department Class
public class SuperDepartment {
	
	private String departmentName = "Super Department";
	private String todaysWork = "No Work as of now";
	private String workDeadline = "Nil";
	private String todayAHoliday = "Today is not a Holiday";

	public String departmentName() {
		return departmentName;
	}

	public String getTodaysWork() {
		return todaysWork;
	}

	public String getWorkDeadline() {
		return workDeadline;
	}

	public String isTodayAHoliday() {
		return todayAHoliday;
	}
}
