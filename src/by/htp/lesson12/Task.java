package by.htp.lesson12;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task {

	public static File openFile() {
		File file = new File("C://Users//Алексей//Desktop", "TaskForSchool.txt");
		System.out.println("File opened succesfully");
		return file;
	}

	public static char[] readFileToArr(File file) throws FileNotFoundException {
		FileReader fr = null;
		fr = new FileReader(file);
		Scanner sc = new Scanner(fr);
		StringBuilder fileText = new StringBuilder();
		while (sc.hasNextLine()) {
			fileText.append(sc.nextLine());
		}
		String ft = new String(fileText.toString());
		char[] chArr = new char[ft.length()];
		for (int i = 0; i < chArr.length; i++) {
			chArr[i] = ft.charAt(i);
		}
		System.out.println("File readed succesfully");
		return chArr;
	}

	public static void answerMaker(char[] chars) {
		for (int i = 0; i < chars.length; i += 3) {
			int first =  Integer.parseInt(String.valueOf(chars[i]));
			int second = Integer.parseInt(String.valueOf(chars[i+2]));
			switch (chars[i + 1]) {
			case '+':
				int answer1 = first + second;
				System.out.println(answer1);
				break;
			case '-':
				int answer2 = first - second;
				System.out.println(answer2);
				break;
			case '*':
				int answer3 = first * second;
				System.out.println(answer3);
				break;
			case '/':
				int answer4 = first / second;
				System.out.println(answer4);
				break;
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		answerMaker(readFileToArr(openFile()));

		// File file = new File("C://Users//Алексей//Desktop", "TaskForSchool.txt");
		// FileReader fr = new FileReader(file);
		// Scanner sc = new Scanner(fr);
		// try {
		//
		// } catch (IOException e1) {
		// e1.printStackTrace();
		// }
		// String str = sc.nextLine();
		// System.out.println(str);
		// char[] charsInFile = null;
		// try {
		//
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// System.out.println(charsInFile.length);
		// System.out.println(ch);
	}
	// input stream read from file by chars (fileReader)
	// Blinov p 221 v A

}
