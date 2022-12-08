/**
 * 
 */
package lab3;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;


/**
 * @author 35386
 *
 */
public class NumbersTest {

	@Test
	public void test() {
		final ByteArrayOutputStream outContent = new
				ByteArrayOutputStream();
				System.setOut(new PrintStream(outContent)); 
				//make the output go to a stream instead of
				//the console
				Numbers.main(null); //call main in the Numbers file
				//check if the output is "Smallest" and a new line. 
				assertEquals("smallest" + System.getProperty("line.separator"),outContent.toString());
	}

}
