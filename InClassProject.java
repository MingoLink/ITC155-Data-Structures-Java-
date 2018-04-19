package chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class InClassProject {

	public static void main(String[] args) throws FileNotFoundException {
		
		// print introduction for user
		System.out.println("This program compares the vocabulary of two");
		System.out.println("text files, reporting the number of words");
		System.out.println("in common and the percent of overlap\n");

		//create HashSets to store unique words in text
		Set<String> words1 = new HashSet<String>();
		Set<String> words2 = new HashSet<String>();

		// Create Scanner object for input stream
		Scanner console = new Scanner(System.in);
		
		//print capture statements for user and capture user input as file names
		System.out.print("File #1 name? ");
		String input1 = console.next();
		System.out.print("File #2 name? ");
		String input2 = console.next();
		
		// create scanner objects of files
		Scanner in1 = new Scanner(new File(input1));
		Scanner in2 = new Scanner(new File(input2));
		
		// Iterate through file to add words to set
		while(in1.hasNext()) {
			String word1 = in1.next();
			word1 = word1.toLowerCase();
			words1.add(word1);
		}
		
		// Iterate through file to add words to set
		while (in2.hasNext()) {
			String word2 = in2.next();
			word2 = word2.toLowerCase();
			words2.add(word2);
		}
		
		// print out amount of unique words in text files
		System.out.println();
		System.out.println("File #1: " + words1.size());
		System.out.println("File #2: " + words2.size());
		
		// create HashSet of file1 and use retailALL() to capture intersection between file2
		// print common(intersection) words for user
		Set<String> common = new HashSet<String>(words1);
		common.retainAll(words2);
		System.out.print("Common words: " + common.size());
		
		// calculate percentage of overlap between files and common words and print for user
		double overlap1 = 100.0 * common.size() / words1.size(); 
		double overlap2 = 100.0 * common.size() / words2.size();
		System.out.println("% of file 1 in overlap= " + overlap1);
		System.out.println("% of file 2 in overlap= " + overlap2);
		
		//close scanner objects
		console.close();
		in1.close();
		in2.close();
	}

}
