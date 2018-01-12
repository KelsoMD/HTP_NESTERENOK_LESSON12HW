package by.htp.lesson12;

import java.io.IOException;
import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args)  {

	System.err.println("Before");
		try {
			throw new Error();
//			doSmth(-1);
//			throw new OutOfMemoryError();
//		} catch (SQLException  | IOException e) {
//
//			e.printStackTrace();
//			//doSmth2();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("It's finale!");
		}
		
		System.out.println("ok");
	}

	public static void doSmth(int i) throws SQLException, IOException {
		if (i == 0) {
				throw new IOException();
			} else if (i<0) {
			throw new SQLException();
		} else if (i>0) {
			throw new NullPointerException();
		}
	}
	
	public static void doSmth2() {
		
			throw new NullPointerException();
	}
}
