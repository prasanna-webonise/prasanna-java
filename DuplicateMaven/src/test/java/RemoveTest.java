import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class RemoveTest {
	private dupRemove r; 
	
	@Before
	public void init() {
		//System.out.println("Before");
		r = new dupRemove();
	}

	@After
	public void teardown() {
		//System.out.println("nothing to teardown");
	}
	
	@Test
	public void testforduplicate() {
		int[] arr = new int[] { 3,2,3,3,1,1,1,9 };
		int[] resultArr = r.removeduplicates(arr);
		
		assertArrayEquals(new int[] {3,2,3,1,9,0,0,0},resultArr);
	
	}

	@Test
	public void testAllSame() {
		int[] arr = new int[] { 1, 1, 1, 1, 1, 1 };
		int[] resultArr = r.removeduplicates(arr);
		
		assertArrayEquals(new int[] {1,0,0,0,0,0},resultArr);
	}

	@Test
	public void testNoDuplicates() {
		int[] arr = new int[] {5,8,4,6,7,1};
		int[] resultArr = r.removeduplicates(arr);
		
		assertArrayEquals(new int[] {5,8,4,6,7,1},resultArr);
	}
	
	@Test
	public void testOnEmptyArray() {
		int[] arr = new int[0]; 
		int[] resultArr = r.removeduplicates(arr);
		
		assertArrayEquals(new int[0],resultArr);
	}
	public void testAllZero() {
		int[] arr = new int[] {0,0,0,0,0}; 
		int[] resultArr = r.removeduplicates(arr);
		
		assertArrayEquals(new int[] {0,0,0,0,0},resultArr);
	}

}
