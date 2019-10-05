
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
        TopDocs foundDocs = searchInContent("75", searcher);
        TopDocs foundDocs1 = searchInAreaLaterale("occupato_secco", searcher);
        TopDocs foundDocs2 = searchInElettromagnete("eccitato", searcher);
        TopDocs foundDocs3 = searchInRipetitoreDiPartenza("id_istanza", searcher);
        
        //Total found documents
        System.out.println("Total Results of '75' :: " + foundDocs.totalHits);
        System.out.println("Total Results of 'occupato_secco' :: " + foundDocs1.totalHits);
        System.out.println("Total Results of 'eccitato' :: " + foundDocs2.totalHits);
        System.out.println("Total Results of 'id_istanza' :: " + foundDocs3.totalHits);
         
        //Let's print out the path of files which have searched term
        for (ScoreDoc sd : foundDocs.scoreDocs) 
        {
            Document d = searcher.doc(sd.doc);
            System.out.println("Path of '75' : "+ d.get("path"));
        }
        ScoreDoc[] hits = foundDocs.scoreDocs;
        
        for (ScoreDoc sd : foundDocs1.scoreDocs) 
        {
            Document d = searcher.doc(sd.doc);
            System.out.println("Path of 'occupato_secco' : "+ d.get("path"));
        }
        ScoreDoc[] hits1 = foundDocs1.scoreDocs;
        
        for (ScoreDoc sd : foundDocs2.scoreDocs) 
        {
            Document d = searcher.doc(sd.doc);
            System.out.println("Path of 'eccitato' : "+ d.get("path"));
        }
        ScoreDoc[] hits2 = foundDocs2.scoreDocs;
      
        for (ScoreDoc sd : foundDocs3.scoreDocs) 
        {
            Document d = searcher.doc(sd.doc);
            System.out.println("Path of 'id_istanza' : "+ d.get("path"));
        }
        ScoreDoc[] hits3 = foundDocs3.scoreDocs;
        
        
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
    
    private static TopDocs searchInAreaLaterale(String textToFind, IndexSearcher searcher) throws Exception
    {
        //Create search query
        QueryParser qp = new QueryParser("stato in ListAreaLaterale", new StandardAnalyzer());
        Query query = qp.parse(textToFind);
         
        //search the index
        TopDocs hits = searcher.search(query, 100);
        return hits;
    }
    
    private static TopDocs searchInElettromagnete(String textToFind, IndexSearcher searcher) throws Exception
    {
        //Create search query
        QueryParser qp = new QueryParser("scrittura in ListElettromagnete", new StandardAnalyzer());
        Query query = qp.parse(textToFind);
         
        //search the index
        TopDocs hits = searcher.search(query, 100);
        return hits;
    }
    
    private static TopDocs searchInRipetitoreDiPartenza(String textToFind, IndexSearcher searcher) throws Exception
    {
        //Create search query
        QueryParser qp = new QueryParser("id in ListRipetitoreDiPartenza", new StandardAnalyzer());
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