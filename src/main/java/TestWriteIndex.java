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

		//Input folder
		String docsPath = "deserializedFiles";

		//Output folder
		String indexPath = "indexedFiles";

		//Input Path Variable
		final Path docDir = Paths.get(docsPath);

		File[] files = new File("inputFiles").listFiles();

		for (File file : files) {
			if (file.isFile()) {
				System.out.println("File: " + file.getName());

				String filename = FilenameUtils.getBaseName(file.toString()); //get path name without extension
				
				if(filename.startsWith("to")){

					byte[] jsonData = Files.readAllBytes(Paths.get(file.getPath())); //read json file data to String

					To to = ObjectMapperJson.deserializeToJson(jsonData,file);

						WriteIndexToJson.StartWriteIndex(indexPath,file.toPath(),to);

				}
				else if (filename.startsWith("simulatoreTo")) {

					byte[] jsonData = Files.readAllBytes(Paths.get(file.getPath())); //read json file data to String

					SimulatoreTo SimTo = ObjectMapperJson.deserializeSimulatoreToJson(jsonData,file);

						WriteIndexSimulatoreToJson.StartWriteIndex(indexPath,file.toPath(),SimTo);

				}else if (filename.startsWith("simulatoreFrom")) {

					byte[] jsonData = Files.readAllBytes(Paths.get(file.getPath())); //read json file data to String

					SimulatoreFrom SimFrom = ObjectMapperJson.deserializeSimulatoreFromJson(jsonData,file);

						WriteIndexSimulatoreFromJson.StartWriteIndex(indexPath,file.toPath(),SimFrom);

				}
			else if (filename.startsWith("ql")) {

					byte[] jsonData = Files.readAllBytes(Paths.get(file.getPath())); //read json file data to String

					Ql ql1 = ObjectMapperJson.deserializeQlJson(jsonData,file);

						WriteIndexQlJson.StartWriteIndex(indexPath,file.toPath(),ql1);

				}

			}

		} 

	}   

}


