package oopsConcepts;

import java.text.DecimalFormat;

/**
 * @author Sunil Verma
 */
public class IntToString {
	
	public IntToString() {

		Integer int1 = new Integer(8);
		
		// Convert Integer from object.toString() method
		System.out.println(int1.toString());
		
		// Using Integer.toString() method
		System.out.println(Integer.toString(int1));
		
		// Using String.valueOf() method
		System.out.println(String.valueOf(int1));
		
		// Using String.format() method
		System.out.format("From formatting: %d\n", int1);
		
		// Using new Integer(int).toString()
		String strNum1 = new Integer(int1).toString();
		System.out.println(strNum1);
		
		// Using Integer's direct addition to string
		String strNum2 = "" + int1;
		System.out.println(strNum2);
		
		// Using Decimal Format
		DecimalFormat myFormat = new DecimalFormat("#,##");
		System.out.println(myFormat.format(123456789));
		
		// Integer to String conversion using StringBuffer or StringBuilder
		StringBuffer myBuffer = new StringBuffer();
		myBuffer.append(int1);
		System.out.println(myBuffer.toString());
		
		StringBuilder myBuilder = new StringBuilder();
		myBuilder.append(int1);
		System.out.println(myBuilder.toString());
		
		// Using special radix
		String frmBinaryString = Integer.toBinaryString(int1);
		String frmOctalString = Integer.toOctalString(int1);
		String frmHexString = Integer.toHexString(int1);
		System.out.println("frmBinaryString: " + frmBinaryString);
		System.out.println("frmHexString: " + frmHexString);
		System.out.println("frmOctalString: " + frmOctalString);
	}
}
