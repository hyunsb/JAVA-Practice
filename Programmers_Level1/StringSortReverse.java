package Level1;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringSortReverse {
    public static void main(String[] args) {
        String str = "Hello, world!";

        //Use StringBuffer 문자열 자체를 역순으로 정렬
        String reverseBuffer = new StringBuffer(str).reverse().toString();

        //Use Stream :: JAVA8 문자열의 각 문자를 비교하여 오름차순으로 정렬
        String reverseStream = str.chars().sorted().collect(
                                                        StringBuilder::new,
                                                        StringBuilder::appendCodePoint,
                                                        StringBuilder::append).toString();

        //use Arrays lib 문자열의 각 문자를 비교하여 내림차순으로 정렬
        String[] strArr = str.split("");
        Arrays.sort(strArr, Collections.reverseOrder());
        String reverseArrays = String.join("", strArr);

        String reverseStream2 = Stream.of(str.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());

        System.out.println(reverseBuffer);
        System.out.println(reverseStream);
        System.out.println(reverseArrays);
        System.out.println(reverseStream2);
    }
}
