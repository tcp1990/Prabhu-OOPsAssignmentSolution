package com.graded.assessment1;

public class Main {

	public static void main(String[] args) {

		AdminDepartment adminObj = new AdminDepartment();
		System.out.println(GetWelomeMessage(adminObj.departmentName()));
		System.out.println(adminObj.getTodaysWork());
		System.out.println(adminObj.getWorkDeadline());
		System.out.println(adminObj.isTodayAHoliday());

		System.out.println();

		HrDepartment hrObj = new HrDepartment();
		System.out.println(GetWelomeMessage(hrObj.departmentName()));
		System.out.println(hrObj.doActivity());
		System.out.println(hrObj.getTodaysWork());
		System.out.println(hrObj.getWorkDeadline());
		System.out.println(hrObj.isTodayAHoliday());

		System.out.println();

		TechDepartment techObj = new TechDepartment();
		System.out.println(GetWelomeMessage(techObj.departmentName()));
		System.out.println(techObj.getTodaysWork());
		System.out.println(techObj.getWorkDeadline());
		System.out.println(techObj.getTechStackInformation());
		System.out.println(techObj.isTodayAHoliday());

	}

	private static String GetWelomeMessage(String departmentName) {
		return "Welcome to " + departmentName;
	}
}
