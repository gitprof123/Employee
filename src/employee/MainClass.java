package employee;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	
	public static void main(String[] args) {
	EmployeeClass emp1 = new EmployeeClass("aaa", 2000, 26);
	EmployeeClass emp2 = new EmployeeClass("bbb", 3000, 27);
	EmployeeClass emp3 = new EmployeeClass("ccc", 4000, 28);

	List<EmployeeClass> empList = new ArrayList<EmployeeClass>();
	empList.add(emp1);
	empList.add(emp2);
	empList.add(emp3);
	
	for(EmployeeClass emp: empList){
		System.out.println(emp.getName());
	}
	}
	
}
