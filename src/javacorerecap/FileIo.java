package javacorerecap;

import java.io.*;

import org.eclipse.jetty.util.HttpCookieStore.Empty; 

public class FileIo {

	public static void main(String[] args) throws IOException {
		
		FileIo fin= new FileIo();
		//fin.writeFile();
		fin.readFile();
		
	}
	
	public void writeFile()throws IOException {
	    FileWriter writer = new FileWriter("C:\\Users\\rahul\\Desktop\\Selenium_Reetanshu\\JavaRecap\\output.txt");  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("Welcome to javaTpoint");  
	    buffer.close();  
	    System.out.println("Success");  
   
	}
	
	public void readFile()throws IOException {
		  FileReader fr=new FileReader("C:\\Users\\rahul\\Desktop\\Selenium_Reetanshu\\JavaRecap\\output.txt");    
          BufferedReader br=new BufferedReader(fr);    
  
          int i;   
          
          String j;
          while((j=br.readLine())!= null){  
          System.out.println(j);
          String [] col= j.split("\\s");
          System.out.println(col[0]);
          }  
          br.close();    
          fr.close();      
   
	}

}
