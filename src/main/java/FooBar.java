/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class FooBar {
	
	private static String FOO = "Foo";
	private static String BAR = "Bar";
	
    /** 
     * @param i the integer to be checked 
     * @return the following string:
     *  Foo if i is a multiple of 3
     *  Bar if i is a multiple of 5
     *  FooBar if i is a multiple of both 3 and 5
     *  The value of i otherwise
     */
    public String getFooBar(int i) 
    {
    	String returnString = "";
    	// Let's calculate mods only once
    	int mod3 = (i % 3);
    	int mod5 = (i % 5);
    	
    	// If i is multiple of 3 or 5		
    	if ((mod3 == 0) || (mod5 == 0))
    	{
    		if (mod3 == 0)
    			returnString = FOO;
    		if (mod5 == 0)
    			returnString += BAR;
    	}
    	// Return the value of i otherwise
    	else
    	{
    		returnString += i;
    	}
        return returnString;
    }
    
    
    /**
     * Iterates from start till end and build 
     * @param start - start of the iteration
     * @param end - end of the iteration
     * @return a String with Foo, Bar, FooBar or the integer depending on its value
     * 
     */
    public String getFooBar(int start, int end) 
    {
    	StringBuilder stringBuilder = new StringBuilder();
    	for (int i = start; i <= end; i++)
    	{
    		// getting for or bar for i
    		stringBuilder.append(getFooBar(i));
    		// Adding a space between each iteration
    		if (i < end)
    			stringBuilder.append(' ');
    	}
    	return stringBuilder.toString();
    }
    
    public static void main(String[] args)
    {
    	FooBar foobar = new FooBar();
    	System.out.println(foobar.getFooBar(1,100));
    }
}
