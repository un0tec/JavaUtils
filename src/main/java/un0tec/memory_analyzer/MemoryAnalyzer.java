package un0tec.memory_analyzer;

import java.lang.management.*;
import java.text.*;

public class MemoryAnalyzer {

	public static void main(String[] args) {

		final DecimalFormat format = new DecimalFormat("0.00");

		final MemoryUsage heapMemoryUsage = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
		final MemoryUsage nonHeapMemoryUsage = ManagementFactory.getMemoryMXBean().getNonHeapMemoryUsage();

		double heapInit = heapMemoryUsage.getInit() / 1000000 / 0.9313;
		double heapMax = heapMemoryUsage.getMax() / 1000000 / 0.9313;
		double heapUsed = heapMemoryUsage.getUsed() / 1000000 / 0.9313;

		double nonHeapInit = nonHeapMemoryUsage.getInit() / 1000000 / 0.9313;
		double nonHeapMax = nonHeapMemoryUsage.getMax() / 1000000 / 0.9313;
		double nonHeapUsed = nonHeapMemoryUsage.getUsed() / 1000000 / 0.9313;

		System.out.println();
		System.out.println();

		System.out.println("-----------------------------------------");
		System.out.println("Memory Test");
		System.out.println("-----------------------------------------");
		System.out.println();
		System.out.println("HEAP memory");
		System.out.println("---- Initial: " + format.format(heapInit) + "MB");
		System.out.println("---- Max: " + format.format(heapMax) + "MB");
		System.out.println("---- Used: " + format.format(heapUsed) + "MB");
		System.out.println();
		System.out.println("NON HEAP memory");
		System.out.println("---- Initial: " + format.format(nonHeapInit) + "MB");
		System.out.println("---- Max: " + format.format(nonHeapMax) + "MB");
		System.out.println("---- Used: " + format.format(nonHeapUsed) + "MB");
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("END");
		System.out.println("-----------------------------------------");

	}

}
