package interview_question;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program1 {

	public static void main(String[] args) {

		Map<Integer, String> map1 = new LinkedHashMap<Integer, String>();

		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");

		Map<Integer, String> map2 = new LinkedHashMap<Integer, String>();

		map2.put(1, "D");
		map2.put(2, "E");
		map2.put(3, "F");

		LinkedHashMap<Integer, String> result = new LinkedHashMap<Integer, String>();

		for (Integer i : map1.keySet()) {
			result.put(i, map1.get(i) + " " + map2.get(i));
		}

		System.out.println(result);

		for (String s : result.values()) {
			System.out.println(s);
		}

		for (Integer i : result.keySet()) {
			System.out.println(i + " = " + result.get(i));

		}
	}
}
