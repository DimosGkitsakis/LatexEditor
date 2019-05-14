package tests;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;
import model.*;

public class saveTest {

	@Test
	public void test() throws IOException {
		Save save = new Save();
		save.saveFile("test", "C:/Users/Spyros/Desktop/Software Engineering/src/tests", "testing123");
		File file = new File("C:/Users/Spyros/Desktop/Software Engineering/src/tests/test.tex"); 
	    Scanner sc = new Scanner(file);
	    String contents="";
	    String line;
	    int count =0;
	    while (sc.hasNextLine()){
    		line = sc.nextLine()+"\n";
	    	contents = contents + line;
	    }
	    assertEquals(contents,"testing123"+"\n");
	}

}
