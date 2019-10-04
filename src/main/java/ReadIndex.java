import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ReadIndex {

	public static void main(String[] args) throws Exception {
		
		String indexPath = "indexedFiles";
		
		ReadIndexFiles.StartReadingIndex(indexPath);

	}

}
