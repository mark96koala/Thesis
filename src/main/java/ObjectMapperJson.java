import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import jsonTo.*;


public class ObjectMapperJson {

	

	public static Employee DeserializeJson(byte[] json, File file) throws JsonParseException, JsonMappingException, IOException{
		
				//create ObjectMapper instance
				ObjectMapper objectMapper = new ObjectMapper();
				
				//convert json string to object = Deserialize
				Employee emp = objectMapper.readValue(json, Employee.class);
				
				System.out.println("Employee Object\n"+emp);
				objectMapper.writeValue(new File("deserializedFiles/"+file.getName().replaceFirst("[.][^.]+$", "")+"Deserialized.json"), emp);  //Write Object in a file
				return emp;
		}
	
	public static void SerializeJson(Employee emp, File file) throws JsonGenerationException, JsonMappingException, IOException {
		
				ObjectMapper objectMapper = new ObjectMapper();
		
				//configure Object mapper for pretty print
				objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		
				//writing to console, can write to any output stream such as file
				StringWriter stringEmp = new StringWriter();
				objectMapper.writeValue(stringEmp, emp);    
				System.out.println("Employee JSON is\n"+stringEmp);
				objectMapper.writeValue(new File("serializedFiles/"+file.getName().replaceFirst("[.][^.]+$", "")+"Serialized.json"), emp); // we can write on file here
	}
	

/*	public static Employee createEmployee() {

		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Andrea");
		emp.setPermanent(false);
		emp.setPhoneNumbers(new long[] { 123456, 987654 });
		emp.setRole("Manager");

		Address add = new Address();
		add.setCity("Bangalore");
		add.setStreet("BTM 1st Stage");
		add.setZipcode(560100);
		emp.setAddress(add);

		List<String> cities = new ArrayList<String>();
		cities.add("Los Angeles");
		cities.add("New York");
		emp.setCities(cities);

		Map<String, String> props = new HashMap<String, String>();
		props.put("salary", "1000 Rs");
		props.put("age", "28 years");
		emp.setProperties(props);

		return emp;
	} */
}


