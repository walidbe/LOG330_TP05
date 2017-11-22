package log330_tp04.tp04;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class CorrelationTest {


	 public CorrelationTest() {

		}

		/**
	     * Rigourous Test :-)
		 * @throws IOException 
		 * @throws FileNotFoundException 
		 * @throws ParseException 
		 * @throws NumberFormatException 
	     */
	    @Test
	    public void correlationTest() throws FileNotFoundException, IOException, NumberFormatException, ParseException
	    {
	    	 FileAnalyser fa = new FileAnalyser("data.csv");
	    	 CalculD c = new CalculD();
			 c.start(fa.loadFile());
	    	assertEquals(0.95,c.calculateCorrelation(),0.01);
	    }
	    
	    
	    @Test
	    public void correlationMaxTest() throws FileNotFoundException, IOException, NumberFormatException, ParseException
	    {
	    	FileAnalyser fa = new FileAnalyser("data.csv");
	    	List<Points> myList = new ArrayList<Points>();
	      	myList.add(new Points(22.0, 23.0));
	    	myList.add(new Points(23.0, 24.0));
	    	myList.add(new Points(22.0, 23.0));
	    	CalculD c = new CalculD();
	    	c.start(myList);
	    	assertEquals(1.0,c.calculateCorrelation(),0.01);
	    }
	    
	    @Test
	    public void correlationMinTest() throws FileNotFoundException, IOException, NumberFormatException, ParseException
	    {
	    	FileAnalyser fa = new FileAnalyser("data.csv");
	    	List<Points> myList = new ArrayList<Points>();
	    	myList.add(new Points(-22.0, -23.0));
	    	myList.add(new Points(23.0, -24.0));
	    	myList.add(new Points(-22.0, -23.0));
	    	CalculD c = new CalculD();
	    	c.start(myList);
	    	assertEquals(-1.0,c.calculateCorrelation(),0.01);
	    }
	    
	    
	    @Test(expected = ParseException.class)
	    public void correlationTestException() throws FileNotFoundException, IOException, NumberFormatException, ParseException
	    {
	  	  FileAnalyser fa = new FileAnalyser("data2.csv");
	  	  CalculD c = new CalculD();
	  	  c.start(fa.loadFile());
	  	  
	    } 
	    
	  
}
