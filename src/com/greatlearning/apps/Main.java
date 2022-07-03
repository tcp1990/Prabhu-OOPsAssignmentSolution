package com.greatlearning.apps;

import com.greatlearning.models.AdminDepartment;
import com.greatlearning.models.HrDepartment;
import com.greatlearning.models.TechDepartment;

public class Main {

	public static void main(String[] args) {
		//Initiating Admin department and invoking their methods
		AdminDepartment adminObj = new AdminDepartment();
		System.out.println(GetWelomeMessage(adminObj.departmentName()));
		System.out.println(adminObj.getTodaysWork());
		System.out.println(adminObj.getWorkDeadline());
		System.out.println(adminObj.isTodayAHoliday());

		System.out.println();
		//Initiating Hr department and invoking their methods
		HrDepartment hrObj = new HrDepartment();
		System.out.println(GetWelomeMessage(hrObj.departmentName()));
		System.out.println(hrObj.doActivity());
		System.out.println(hrObj.getTodaysWork());
		System.out.println(hrObj.getWorkDeadline());
		System.out.println(hrObj.isTodayAHoliday());

		System.out.println();
		//Initiating Tech department and invoking their methods
		TechDepartment techObj = new TechDepartment();
		System.out.println(GetWelomeMessage(techObj.departmentName()));
		System.out.println(techObj.getTodaysWork());
		System.out.println(techObj.getWorkDeadline());
		System.out.println(techObj.getTechStackInformation());
		System.out.println(techObj.isTodayAHoliday());

	}

	//Getting welcome Message common method
	private static String GetWelomeMessage(String departmentName) {
		return "Welcome to " + departmentName;
	}
}
