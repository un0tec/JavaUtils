package un0tec.benchmark;

import org.perfidix.annotation.Bench;
import org.perfidix.annotation.BenchClass;

/**
 * 
 * Benchmark to see performance adding text to a String
 *
 */
@BenchClass(runs = 5000)
public class Test {

	String testString = "";
	StringBuilder testBuilder = new StringBuilder();
	
	@Bench
	public void testMethod1() {
		
		testString += "test";
		
	}
	
	@Bench
	public void testMethod2() {
		
		testBuilder.append("test");
		
	}
	
}
