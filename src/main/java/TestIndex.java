import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import jsonTo.*;


public class TestIndex {

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

				//read json file data to String
				byte[] jsonData = Files.readAllBytes(Paths.get(file.getPath()));

				Employee emp = ObjectMapperJson.DeserializeJson(jsonData,file);

				WriteIndexFile.StartWriteIndex(indexPath,file.toPath(),emp);

			}

		}

	}   

}


