package Codes_InterviewQuestions.first;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Q41_WriteReadProperties_Files {
	
	public static void main(String[] args) {
		
		//writeData();
		Wait(3);
		
		System.out.println("url="+getData("url","db.properties"));
		System.out.println("====read all data======");
		String path="db.properties";
		readData(path).forEach((key,value)->System.out.println(key+" ="+value));
		
		
		
	}
	
	public static void writeData() {
		Properties prop=new Properties();
		try(OutputStream output=new FileOutputStream("db.properties")) {
			prop.setProperty("url","localhost");// set 
			prop.setProperty("username","mbilim");
			prop.setProperty("password", "1234567");
		
			prop.store(output, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	private static String getData(String key, String path) {
		Properties file=new Properties();
		try(FileInputStream input=new FileInputStream(path)){
			file.load(input);
			
		}catch(IOException io) {
			io.printStackTrace();
		}
		
		
		return file.getProperty(key);
	}
	
	public static Properties readData(String path) {
		Properties property=new Properties();
		try(FileInputStream inputstream=new FileInputStream(path)){
			property.load(inputstream);
		}catch(IOException io) {
			io.printStackTrace();
		}
		return property;
	}



	private static void Wait(double seconds) {
		try{
			Thread.sleep((long) (seconds*1000));
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}
	
	
	

}