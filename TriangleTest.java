import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest{

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testT1() {
		assertEquals((String)"�޷�����������",Triangle.T(2,2,4));
	}
	  @Test
	    public void testT2() {
	        assertEquals((String)"�޷�����������",Triangle.T(2,2,5));
	    }
	 
	    @Test
	    public void testT3() {
	        assertEquals((String)"�޷�����������",Triangle.T(-2,2,5));
	    }
	 
	    @Test
	    public void testT4() {
	        assertEquals((String)"�޷�����������",Triangle.T(0,2,5));
	    }
	 
	    @Test
	    public void testT5(){
	        assertEquals((String)"�ȱ�������",Triangle.T(2,2,2));
	    }
	 
	    @Test
	    public void testT6() {
	        assertEquals((String)"����������",Triangle.T(2,2,3));
	    }
	 
	    @Test
	    public void testT7() {
	        assertEquals((String)"һ��������",Triangle.T(2,3,4));
	    }
}

