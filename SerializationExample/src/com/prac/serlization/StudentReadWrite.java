package com.prac.serlization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentReadWrite {

	public static void main(String [] args) {
		
		Student s1 = new Student("rajan", 26,"delhi");
		Student s2 = new Student("sandy", 23, "mathura");
		
		try {
			
			FileOutputStream fos = new FileOutputStream("E:\\sudentdata.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			System.out.println("writing to file*******");
			
			oos.writeObject(s1);
			oos.writeObject(s2);
			
			System.out.println( s1.getClass()+" has code is " + s1.hashCode());
			System.out.println(s1.getName() + " " + s1.getAge() + " " + " " + s1.getStdAddress());
			
			System.out.println(s2.getClass()+" has code is " + s2.hashCode());
			System.out.println(s2.getName() + " " + s2.getAge() + " " + " " + s2.getStdAddress());
			
			System.out.println("write to file done**********\n reading from file ********");
			
			FileInputStream fis = new FileInputStream("E:\\sudentdata.txt");
			ObjectInputStream objRead = new ObjectInputStream(fis);
			
			while(true){
				try{
					Student s;
					s = (Student) objRead.readObject();
					System.out.println(s.getClass()+" has code is " + s.hashCode());
					System.out.println(s.getName() + " " + s.getAge() + " " + " " + s.getStdAddress());
					
				}catch(EOFException eof){
					break;
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
