// System.getProperties()를 이용하여 시스템 속성을 가져오는 방법을 보여주는 예제

package ch11;

import java.util.Properties;

public class PropertiesEx4 {
	public static void main(String[] args) {
		Properties sysProp = System.getProperties();
		// java.version
		System.out.println("java.version :" + sysProp.getProperty("java.version"));
		// user.language 
		System.out.println("user.language :" + sysProp.getProperty("user.language"));
		
		// user.name 
		System.out.println("user.name :" + sysProp.getProperty("user.name"));

		// user.dir
		System.out.println("user.dir :" + sysProp.getProperty("user.dir"));

		sysProp.list(System.out);
	}
}
