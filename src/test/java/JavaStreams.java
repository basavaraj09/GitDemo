import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStreams {
	// count the numbers of names starting with alphabet A in list
	// @Test
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Anaveer");
		names.add("Abjit");
		names.add("Alekay");
		names.add("Anavita");
		names.add("Basavaraj");
		names.add("Ram");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}

	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Anaveer");
		names.add("Abjit");
		names.add("Alekay");
		names.add("Anavita");
		names.add("Basavaraj");
		names.add("Alavs");
		names.add("Ram");

	//	long c = names.stream().filter(s -> s.endsWith("j")).count();
		//System.out.println(c);

		Long d = Stream.of("abijeet", "Don").filter(s -> {

			s.endsWith("m");
			return false;
		}).count();
		System.out.println(d);
		// print all the names of Arraylist
		// names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));

	}

	@Test
	public void streammap() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Akash");
		names.add("Amar");
		names.add("Sagara");
		names.add("Viresh");
		names.add("Naveen");
		names.add("Ram");

		// print names of length >4 with uppercase
		Stream.of("Azijeet", "Dona", "Alekhya", "beemarava").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		System.out.println("%%%%^%^^^&&&&");
		// print names which have first letter as a with uppercase and sorted

		List<String> names11 = Arrays.asList("azijeet", "Dona", "beemarava", "Adam", "alehyka");
		names11.stream().filter(s -> s.startsWith("a")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		System.out.println("******#######");

		Stream<String> newStream = Stream.concat(names.stream(), names11.stream());
		// newStream.sorted().forEach(s->System.out.println(s));
		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Viresh"));
		System.out.println(flag);
		Assert.assertTrue(flag);

	}

	@Test
	public void streamCollect() {
		List<String> ls = Stream.of("abajeet", "dona", "veera", "Rama").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(1));
		System.out.println("********");

		List<Integer> number = Arrays.asList(3, 3, 2, 2, 1, 4, 5, 7, 9);
		// print the unique numbers in list
		// sort the array
		number.stream().distinct().sorted().forEach(s -> System.out.println(s));
		System.out.println("######");
		List<Integer> values = number.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(values.get(2));
	}

}
