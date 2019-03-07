package oopTest;

import static org.junit.Assert.assertTrue;

//befor - test - after
//befor - test - after 순으로 돌아감

import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyVectorTest {

	Vector v;
	
	// 돌아가기 전에 수행할 문장
	@Before
	void setup() {
		System.out.println("before");
		v = new Vector();
	}
	
	// 테스트가 끝난 후에 수행될 작업을 넣는다.
	@After
	void cleanUp() {
		
	}
	// 예외가 발생하는 테스트 - 예외가 발생해야 통과되는 테스트
	@Test(expected-IllegalArgumentException.class)
	void capacityTest() {
		Vector v = new Vector(100);
		assertTrue(v.capacity()==100);
		
		Vector v2 = new Vector();
		assertTrue(v2.capacity()==16);
		
		Vector v3 = new Vector(-1);
		assertTrue(v3.capacity()==16);
		
	}
	
	@Test
	void addTest() {
		Vector v = new Vector();
		assertTrue(v.size==0);
		
		v.add("1");
		assertTrue(v.size()==1);
		v.add("1");
		assertTrue(v.size()==2);
		
		// 지정한 값이 잘 저장되었는지 확인
		assertTrue("1".equals(v.get(0)));
		
		Vector v2 = new Vector();
		for(int i=0; i< 1000000; i++) {
			v.add(i+"");
		}
		assertTrue(v2.size(1000000));
		
		Vector v1 = new Vector();
		assertTrue(v2.size(1000000));
	}
	
	
	
	
	
	
	
	@Test 
	void sizeTest() {
		Vector v = new Vector();
		assertTrue(v.size()==0);
		System.out.println("sizeTest()");
		
	}
	

}