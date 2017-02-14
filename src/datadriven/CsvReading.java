package datadriven;



import java.io.FileReader;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class CsvReading {

	 public static void main(String[] args) throws Exception {
CSVReader reader = new CSVReader(new FileReader("C:\\Users\\rahul\\Desktop\\Selenium_Reetanshu\\demo.csv"));
String [] row;
while((row=reader.readNext()) != null){
	System.out.println("First Val"+ row[0]+"Second Val"+row[1]+"third row"+row[2]);
}
	 
	 }
}
