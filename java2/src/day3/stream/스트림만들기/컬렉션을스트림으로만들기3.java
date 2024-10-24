package day3.stream.스트림만들기;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class 컬렉션을스트림으로만들기3 {

	public static void main(String[] args) {
		   
        ArrayList<String> names = new ArrayList<>();
        names.add("choi문길");
        names.add("jun우선");
        names.add("bak바울");
        names.add("song송병화");

        
        System.out.println("이름 출력:");
        names.stream()
            .forEach(s-> System.out.println(s));

        
        
        
        
        
        
        // 2. 특정 조건으로 필터링 (예: 이름이 'B'로 시작하는 사람)
        System.out.println("\n이름이 's'로 시작하는 사람들:");
        List<String> 필터된이름 = names.stream()
            .filter(name -> name.startsWith("s"))
            .collect(Collectors.toList()); // 다시 리스트로 수집

        필터된이름.forEach( s -> System.out.println( s));

        
        // 3. 대문자로 변환한 후 리스트로 변환
        System.out.println("\n대문자로 변환된 이름들:");
        List<String> 대문자이름 = 필터된이름.stream()
            .map( s -> s.toUpperCase())   // 대문자로 변환
            .collect(Collectors.toList()); // 결과를 리스트로 수집

        대문자이름.forEach( s -> System.out.println(s));
    }

	 

}
