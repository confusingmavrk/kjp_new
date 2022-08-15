package kjp1.kjp1;




import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class MessageServiceTest  {
	
	    @Test
	    void testGet() {
	        assertEquals("Hello JUnit 5", MessageService.get());
	    }

}
