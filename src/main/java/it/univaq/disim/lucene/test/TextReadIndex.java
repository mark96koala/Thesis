package it.univaq.disim.lucene.test;
import it.univaq.disim.lucene.search.ReadIndexFiles;

public class TextReadIndex {

	public static void main(String[] args) throws Exception {

		String indexPath = "indexedFiles";

		ReadIndexFiles.StartReadingIndex(indexPath);

	}

}
