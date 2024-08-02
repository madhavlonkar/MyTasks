package com.revature.fileHandlingSeralization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerisible {
	public static void main(String[] args) {
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		Employee emp=null;
		
		try
		{
			fos=new FileOutputStream("outputser.txt");
			oos=new ObjectOutputStream(fos);
			emp=new Employee(101,"Maddy","Student");
			oos.writeObject(emp);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("outputser.txt");
			ois=new ObjectInputStream(fis);
			System.out.print(""+(Employee) ois.readObject());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
