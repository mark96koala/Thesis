import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FilenameUtils;

import jsonTo.*;
import jsonSimulatoreTo.*;
import jsonSimulatoreFrom.*;
import jsonQl.*;


public class TestWriteIndex {

	public static void main(String[] args) throws Exception {


		//Output folder
		String indexPath = "indexedFiles";

		File[] files = new File("inputFiles").listFiles();

		for (File file : files) {
			if (file.isFile()) {
				System.out.println("File: " + file.getName());

				String filename = FilenameUtils.getBaseName(file.toString()); //get path name without extension

				if(filename.startsWith("To")){

					byte[] jsonData = Files.readAllBytes(Paths.get(file.getPath())); //read json file data to String

					To to = ObjectMapperJson.deserializeToJson(jsonData,file);

					WriteIndexToJson.StartWriteIndex(indexPath,file.toPath(),to);

				}
				else if (filename.startsWith("SimulatoreTo")) {

					byte[] jsonData = Files.readAllBytes(Paths.get(file.getPath())); //read json file data to String

					SimulatoreTo SimTo = ObjectMapperJson.deserializeSimulatoreToJson(jsonData,file);

					WriteIndexSimulatoreToJson.StartWriteIndex(indexPath,file.toPath(),SimTo);

				}else if (filename.startsWith("SimulatoreFrom")) {

					byte[] jsonData = Files.readAllBytes(Paths.get(file.getPath())); //read json file data to String

					SimulatoreFrom SimFrom = ObjectMapperJson.deserializeSimulatoreFromJson(jsonData,file);

					WriteIndexSimulatoreFromJson.StartWriteIndex(indexPath,file.toPath(),SimFrom);

				}
				else if (filename.startsWith("Ql")) {

					byte[] jsonData = Files.readAllBytes(Paths.get(file.getPath())); //read json file data to String

					Ql ql1 = ObjectMapperJson.deserializeQlJson(jsonData,file);

					WriteIndexQlJson.StartWriteIndex(indexPath,file.toPath(),ql1);

				}

			}

		} 

	}   

}


