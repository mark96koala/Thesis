import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import jsonTo.*;
import jsonSimulatoreTo.*;
import jsonSimulatoreFrom.*;
import jsonQl.*;


public class ObjectMapperJson {


	public static To deserializeToJson(byte[] json, File file) throws JsonParseException, JsonMappingException, IOException{

		//create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();

		//convert json string to object = Deserialize
		To to = objectMapper.readValue(json, To.class);

		System.out.println("To Json\n"+to);
		objectMapper.writeValue(new File("deserializedFiles/"+file.getName().replaceFirst("[.][^.]+$", "")+"Deserialized.json"), to);  //Write Object in a file
		return to;
	}
	public static SimulatoreTo deserializeSimulatoreToJson(byte[] json, File file) throws JsonParseException, JsonMappingException, IOException{

		//create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();

		//convert json string to object = Deserialize
		SimulatoreTo SimTo = objectMapper.readValue(json, SimulatoreTo.class);

		System.out.println("SimulatoreTo Json\n"+SimTo);
		objectMapper.writeValue(new File("deserializedFiles/"+file.getName().replaceFirst("[.][^.]+$", "")+"Deserialized.json"), SimTo);  //Write Object in a file
		return SimTo;
	}
	
	public static SimulatoreFrom deserializeSimulatoreFromJson(byte[] json, File file) throws JsonParseException, JsonMappingException, IOException{

		//create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();

		//convert json string to object = Deserialize
		SimulatoreFrom SimFrom = objectMapper.readValue(json, SimulatoreFrom.class);

		System.out.println("SimulatoreFrom Json\n"+SimFrom);
		objectMapper.writeValue(new File("deserializedFiles/"+file.getName().replaceFirst("[.][^.]+$", "")+"Deserialized.json"), SimFrom);  //Write Object in a file
		return SimFrom;
	}
	
	public static Ql deserializeQlJson(byte[] json, File file) throws JsonParseException, JsonMappingException, IOException{

		//create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();

		//convert json string to object = Deserialize
		Ql ql1 = objectMapper.readValue(json, Ql.class);

		System.out.println("Ql Json\n"+ql1);
		objectMapper.writeValue(new File("deserializedFiles/"+file.getName().replaceFirst("[.][^.]+$", "")+"Deserialized.json"), ql1);  //Write Object in a file
		return ql1;
	}

	public static void serializeJson(Class class1, File file) throws JsonGenerationException, JsonMappingException, IOException {

		ObjectMapper objectMapper = new ObjectMapper();

		//configure Object mapper for pretty print
		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

		//writing to console, can write to any output stream such as file
		StringWriter stringEmp = new StringWriter();
		objectMapper.writeValue(stringEmp, class1);    
		System.out.println("Employee JSON is\n"+stringEmp);
		objectMapper.writeValue(new File("serializedFiles/"+file.getName().replaceFirst("[.][^.]+$", "")+"Serialized.json"), class1); // we can write on file here
	}

}


