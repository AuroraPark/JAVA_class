package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.Set;

public class IOEx3 {
	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
//		byte[] temp = new byte[10]; 
		byte[] temp = new byte[4]; 
		
		ByteArrayInputStream  input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();

		// IOEX2
//		input.read(temp,0,temp.length); // 읽어온 데이터를 배열 temp에 넣는다.
//		output.write(temp,5,5);			// temp[5]에서 5개의 ㄷㅔ이터를 write한다.
//		
//		outSrc = output.toByteArray();
//		
//		System.out.println("Input source :" + Arrays.toString(inSrc));
//		System.out.println("temp : " + Arrays.toString(temp));
//		System.out.println("Output source :" + Arrays.toString(outSrc));
//		
		// IOEX3
		System.out.println("Input source :" + Arrays.toString(inSrc));
		
		try {
			Properties sysProp = System.getProperties();
			sysProp.list(System.out);
//			Set<String> key = sysProp.keySet();
//			Iterator<String> it = key.iterator();
//			while(it.hasNext()) {
//				it.next()
//			}
			while(input.available() > 0) {
				input.read(temp);
				output.write(temp);
//				System.out.println("temp : " + Arrays.toString(temp));
				
				outSrc = output.toByteArray();
				printArrays(temp, outSrc);
			}
			
		} catch (IOException e) {}
		
		
	} // main
	
	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("Output source :" + Arrays.toString(outSrc));
	}
}
