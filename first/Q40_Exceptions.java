package Codes_InterviewQuestions.first;
/*
1. Write a method called "wait" that causes the current executing thread to sleep 
        for the specific number of seconds
		parameters: double seconds
		return-type: void
		Thread.sleep();
	Note: Exceptions MUST be handled within the methods
2. write a method called "getData" that can retrieve the data from properties files
		parameters: String Key, String FilePath
		return-type: String
	Note: Exceptions MUST be handled within the methods
*/

import java.io.FileInputStream;

import java.util.Properties;

public class Q40_Exceptions {
	
	public static void main(String[] args) {
		String filePath="/Users/mevlutbilim/Desktop/config.properties";
		
		System.out.println(getData("url",filePath));
		System.out.println("========");
		Wait(4);
		readProperties(filePath).forEach((y,x)->System.out.println(y+" : "+x));
		
		
	}
	
	
	public static void Wait(double seconds) {
		try {
			Thread.sleep((long) seconds*1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Properties readProperties(String path) {
		Properties file=new Properties();
		try(FileInputStream input=new FileInputStream(path)) {
			file.load(input);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return file;
	}
	
	
	public static String getData(String key,String path) {
		Properties file=new Properties();
		try(FileInputStream input=new FileInputStream(path)) {
			
			file.load(input);
		} catch (Exception e) {
			
			
			e.printStackTrace();
		}
		return file.getProperty(key);
	}

}
