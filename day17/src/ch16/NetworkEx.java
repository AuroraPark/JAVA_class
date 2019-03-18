package ch16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkEx {

	public static void main(String[] args) {
		URL url = null;
		BufferedReader input = null;
		String address = "https://github.com/AuroraPark/TTL/blob/master/DataStructure/Selection_sort.md";
		String line = "";
		
		try {
			url  = new URL(address);
			input =  new BufferedReader(new InputStreamReader(url.openStream()));
			
			while ((line=input.readLine()) != null) {
				System.out.println(line);
			}
			input.close();
		} catch(Exception e) {e.printStackTrace();}

	}

}
