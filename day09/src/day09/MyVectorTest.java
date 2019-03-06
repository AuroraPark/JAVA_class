package day09;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyVectorTest {

	/* add를 넣을 때 넣은 값과 index의 값이 같은지 
	 */
	@Test
	public void addTest() {
		MyVector v = new MyVector();
		assertTrue(v.isEmpty()==true);
		
		v.add("1");
		assertTrue(v.isEmpty()==false);
		
	}
	
	
	@Test
	public void isEmptyTest() {
		MyVector v = new MyVector();
		assertTrue(v.isEmpty()==true);
		
		v.add("1");
		assertTrue(v.isEmpty()==false);
		
	}
	
	@Test
	public void sizeTest() {
		MyVector v = new MyVector();
		assertTrue(v.size()==0);
		
		v.add("1");
		assertTrue(v.size()==1);
		
	}

}
