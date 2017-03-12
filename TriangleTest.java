import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest{

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testT1() {
		assertEquals((String)"无法构成三角形",Triangle.T(2,2,4));
	}
	  @Test
	    public void testT2() {
	        assertEquals((String)"无法构成三角形",Triangle.T(2,2,5));
	    }
	 
	    @Test
	    public void testT3() {
	        assertEquals((String)"无法构成三角形",Triangle.T(-2,2,5));
	    }
	 
	    @Test
	    public void testT4() {
	        assertEquals((String)"无法构成三角形",Triangle.T(0,2,5));
	    }
	 
	    @Test
	    public void testT5(){
	        assertEquals((String)"等边三角形",Triangle.T(2,2,2));
	    }
	 
	    @Test
	    public void testT6() {
	        assertEquals((String)"等腰三角形",Triangle.T(2,2,3));
	    }
	 
	    @Test
	    public void testT7() {
	        assertEquals((String)"一般三角形",Triangle.T(2,3,4));
	    }
}

