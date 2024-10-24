package day3.stream.연습;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex07 {
	public static void main(String[] args) {

		Set<Integer> lottos = new HashSet<>();
		// HashSet<Integer> lottos = new HashSet< >();

		Random r = new Random();

		for (int i = 0; i < 20; i++) {
			lottos.add(r.nextInt(46));
		}

		System.out.println(lottos.size());

		Object[] lottosArray = lottos.toArray();
		Integer[] result = new Integer[6];

		// 이게 빠름
		System.arraycopy(lottosArray, 0, result, 0, 6);

		System.out.println("lotto number!!!!");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + "  ");
		}
		
		
		System.out.println("스트림으로 로또 번호");
		IntStream stream = new Random().ints(1,46);
		stream.distinct().limit(6).sorted().forEach(s -> System.out.print(s + " "));
		
		
	}
	
}
