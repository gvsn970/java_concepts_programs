package com.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {
		IntStream.range(1, 11).forEach(System.out::print);
		System.out.println();
		IntStream.range(1, 11).skip(5).forEach(System.out::print);
		System.out.println();
		System.out.println(IntStream.range(1, 11).sum());
		System.out.println();
		
		Stream.of("AL","AVl","Albert").findFirst().ifPresent(System.out::print);
		System.out.println();
		
		String[]  str= {"ABc","ASB","SBI","WAS","ORT"};
		Arrays.stream(str).filter(x->x.endsWith("c")).sorted().forEach(System.out::print);
		System.out.println();
		
		Arrays.stream(new int[] {2,4,5,6,7,8}).map(x->x*x).average().ifPresent(System.out::print);
		System.out.println();
		
		//List<String> peple=Arrays.asList("ABc","ASB","SBI","WAS","ORT");
		//peple.stream().map(String::toLowerCase).
		
		IntSummaryStatistics summry=IntStream.of(2,4,5,6,7,8).summaryStatistics();
		System.out.println(summry);
		
		int[] a= {5,7,1,12,13};
	}
}
