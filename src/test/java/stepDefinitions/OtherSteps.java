package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.And;

public class OtherSteps {

	@And("user enters its {string} & {string}")
	public void user_enters_its(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
	    
		List<List<String>> data = dataTable.asLists();
		System.out.println("First Name is - " + data.get(0).get(0) + " " + data.get(0).get(1));
		System.out.println("Second Name is - " + data.get(1).get(0) + " " + data.get(1).get(1));
		
		
		List<Map<String,String>> data1 = dataTable.asMaps();
		System.out.println("First Name is - " + data1.get(0).get("First Name") + " " + data1.get(0).get("Last Name"));
		System.out.println("Second Name is - " + data1.get(1).get("First Name") + " " + data1.get(1).get("Last Name"));
		
	}	
}
