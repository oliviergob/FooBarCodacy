import org.junit.Test;
import static org.junit.Assert.*;

public class FooBarTest {
    @Test public void testgetFooOrBar() {
    	FooBar fooBar = new FooBar();
    	assertEquals("1 is not a multiple of 3 nor 5", "1",fooBar.getFooBar(1));
    	assertEquals("3 is a multiple of 3", "Foo",fooBar.getFooBar(3));
    	assertEquals("5 is a multiple of 5", "Bar",fooBar.getFooBar(5));
    	assertEquals("15 is a multiple of both 3 and 5", "FooBar",fooBar.getFooBar(15));
    }
    
    @Test public void testgetFooOrBarIteration() {
    	FooBar fooBar = new FooBar();
    	assertEquals("1 2 Foo 4 Bar Foo 7 8 Foo Bar 11 Foo 13 14 FooBar 16 17 Foo",fooBar.getFooBar(1, 18));
    }
}
