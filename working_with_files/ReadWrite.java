package working_with_files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReadWrite {

	public static  Person martyn = new Person("Martyn", "Java Developer", 35);
	public static  Person jon = new Person("Jenny", "System Analyst", 20);
	public static  Person alex = new Person("Alex", "Receptionist", 62);
	public static  Person steve = new Person("Steve", "HR manager", 19);
	public static  Person alice = new Person("Alice", "Plumber", 27);

	public static void main(String[] args) {
		ReadWrite readWrite = new ReadWrite();;
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(martyn);
		personList.add(jon);
		personList.add(alex);
		personList.add(steve);
		personList.add(alice);
		readWrite.writeToFile(personList);
		readWrite.readFromFile();
	}

	public void writeToFile(ArrayList<Person> personList) {
		FileWriter myFileWriter = null;
		try {
			myFileWriter = new FileWriter("working_with_files_exercise.txt");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		BufferedWriter myBufferedWriter = new BufferedWriter(myFileWriter);
		
		System.out.println("\n\n~writeToFile~\n\n");

		for (Person person : personList) {
			try {
				myBufferedWriter.write(person.toString());
				myBufferedWriter.newLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(person.toString() + ": written Successfully");
		}
		try {
			myBufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readFromFile() {
		System.out.println("\n\n~readFromFile~\n\n");
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("C:\\\\Users\\\\tom\\\\Desktop\\\\working_with_files_exercise.txt"));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}	
}