package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String>employeeOfChaseBank = new ArrayList<String>();
		employeeOfChaseBank.add("Elina");
		employeeOfChaseBank.add("Alex");
		employeeOfChaseBank.add("Ann");

		List<String>employeeOfCitiBank = new ArrayList<String>();
		employeeOfCitiBank.add("Bella");
		employeeOfCitiBank.add("Robert");
		employeeOfCitiBank.add("Belinda");

		List<String>employeeOfTdBank = new ArrayList<String>();
		employeeOfTdBank.add("Addison");
		employeeOfTdBank.add("Robert");
		employeeOfTdBank.add("Adam");
		employeeOfTdBank.add("Barbara");

		Map<String, List<String>> employeeList = new LinkedHashMap<String, List<String>>();
		employeeList.put("Employee of ChaseBank", employeeOfChaseBank);
		employeeList.put("Employee of CitiBank", employeeOfCitiBank);
		employeeList.put("Employee of TdBank", employeeOfTdBank);
		for (Map.Entry<String, List<String>> map:employeeList.entrySet()){
			List <String> employeeName = map.getValue();
			System.out.println(map.getKey());
			for(String name:employeeName){
				System.out.println(" "+name);
			}
			System.out.println();
		  }
		}
	}


