
import java.io.IOException;
import java.nio.file.Paths;
 
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

public class ReadIndexFiles 
{
 
    static void StartReadingIndex(String indexPath) throws Exception 
    {
        //Create lucene searcher. It search over a single IndexReader.
        IndexSearcher searcher = createSearcher(indexPath);
         
        //Search indexed contents using search term
        TopDocs foundDocs = searchInContent("Albany", searcher);
        TopDocs foundDocs1 = searchInMacrini("Gianni", searcher);
         
        //Total found documents
        System.out.println("Total Results of Albany :: " + foundDocs.totalHits);
        System.out.println("Total Results of Gianni :: " + foundDocs1.totalHits);

         
        //Let's print out the path of files which have searched term
        for (ScoreDoc sd : foundDocs.scoreDocs) 
        {
            Document d = searcher.doc(sd.doc);
            System.out.println("Path of 'Albany' : "+ d.get("path"));
        }
        ScoreDoc[] hits = foundDocs.scoreDocs;
        
        for (ScoreDoc sd : foundDocs1.scoreDocs) 
        {
            Document d = searcher.doc(sd.doc);
            System.out.println("Path of 'Gianni' : "+ d.get("path"));
        }
        ScoreDoc[] hits1 = foundDocs1.scoreDocs;
        
    }
     
    private static TopDocs searchInContent(String textToFind, IndexSearcher searcher) throws Exception
    {
        //Create search query
        QueryParser qp = new QueryParser("contents", new StandardAnalyzer());
        Query query = qp.parse(textToFind);
         
        //search the index
        TopDocs hits = searcher.search(query, 100);
        return hits;
    }
    
    private static TopDocs searchInMacrini(String textToFind, IndexSearcher searcher) throws Exception
    {
        //Create search query
        QueryParser qp = new QueryParser("macrini", new StandardAnalyzer());
        Query query = qp.parse(textToFind);
         
        //search the index
        TopDocs hits = searcher.search(query, 100);
        return hits;
    }
 
    private static IndexSearcher createSearcher(String indexPath) throws IOException 
    {
        Directory dir = FSDirectory.open(Paths.get(indexPath));
         
        //It is an interface for accessing a point-in-time view of a lucene index
        IndexReader reader = DirectoryReader.open(dir);
         
        //Index searcher
        IndexSearcher searcher = new IndexSearcher(reader);
        return searcher;
    }
}