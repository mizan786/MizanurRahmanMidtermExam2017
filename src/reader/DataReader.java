package reader;

import java.io.BufferedReader;
import java.io.FileReader;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		String textFile = System.getProperty("user.dir") + "//src//data//self-driving-car.txt";
		//String textFile = "C:\\Users\\Mizan\\Desktop\\SeleniumTest.txt";
		System.out.println("The text file is :");
		try{
			FileReader input = new FileReader(textFile);
			BufferedReader bReader = new BufferedReader(input);
			String text;
			  while ((text = bReader.readLine())!= null){
			  System.out.println(text);
				}
			bReader.close();
		  }catch(Exception e){
			System.out.println("Error in textFile "+e.getMessage());
		}
	}
}
