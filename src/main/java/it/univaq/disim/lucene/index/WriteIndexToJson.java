package it.univaq.disim.lucene.index;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.LongPoint;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.IndexWriterConfig.OpenMode;
import org.apache.lucene.index.Term;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import jsonTo.*;
import jsonQl.*;
import jsonSimulatoreFrom.*;
import jsonSimulatoreTo.*;

public class WriteIndexToJson 
{

	public static void StartWriteIndex(String indexPath, Path file, To objectTo) {

		Date start = new Date();
		try
		{
			System.out.println("Indexing to directory '" + indexPath + "'...");
			//org.apache.lucene.store.Directory instance
			Directory dir = FSDirectory.open( Paths.get(indexPath) );

			//analyzer with the default stop words
			Analyzer analyzer = new StandardAnalyzer();

			//IndexWriter Configuration
			IndexWriterConfig iwc = new IndexWriterConfig(analyzer); 
			iwc.setOpenMode(OpenMode.CREATE_OR_APPEND);

			//IndexWriter writes new index files to the directory
			IndexWriter writer = new IndexWriter(dir, iwc);  //create and manage index.

			//Its recursive method to iterate all files and directories
			indexDoc(writer, file,objectTo);

			writer.close();

			Date end = new Date();
			System.out.println(end.getTime() - start.getTime() + " total milliseconds");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}


	/*  static void indexDocs(final IndexWriter writer, Path path, Employee emp) throws IOException 
    {
        //Directory?
        if (Files.isDirectory(path)) 
        {
            //Iterate directory
            Files.walkFileTree(path, new SimpleFileVisitor<Path>() 
            {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException 
                {
                    try
                    {
                        //Index this file
                        indexDoc(writer, file, attrs.lastModifiedTime().toMillis(),emp);
                    } 
                    catch (IOException ioe) 
                    {
                        ioe.printStackTrace();
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        } 
        else
        {
            //Index this file
            indexDoc(writer, path, Files.getLastModifiedTime(path).toMillis(),emp);
        }
    } */

	/** Indexes a single document */
	static void indexDoc(IndexWriter writer, Path file, To objectTo) throws IOException 
	{
		try (InputStream stream = Files.newInputStream(file)){ 

			//Create lucene Document
			Document doc = new Document();

			doc.add(new StringField("path", file.toString(), Field.Store.YES));
			doc.add(new TextField("contents", new String(Files.readAllBytes(file)), Store.YES));
			doc.add(new TextField("type", "to", Store.YES));
			doc.add(new TextField("name in ListDeviatoio",objectTo.getListDeviatoio().getName(), Store.YES));
			doc.add(new TextField("idSlot in ListInstradamento",objectTo.getListInstradamento().getIdSlot(), Store.YES));
			String attivazione = String.valueOf(objectTo.getListItinerario().getAttivazione_da_dco());
			doc.add(new StringField("attivazione_da_dco in ListItinerario",attivazione, Store.YES));

			System.out.println("adding " + file);
			// Existing index (an old copy of this document may have been indexed) so 
			// we use updateDocument instead to replace the old one matching the exact 
			// path, if present:
			writer.updateDocument(new Term("path", file.toString()), doc);
		}
	}

}


