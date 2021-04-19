package task1;


import java.util.Arrays;
import java.util.function.Function;



public class Main {
    public static void main(String[] args) {
        String str = "sdsad asdasdw wqeqeq sad a";
        String[] strings;

        Function<String, String[]> removingSpaces = new Function<String, String[]>() {
            @Override
            public String[] apply(String s) {
                String[] strings = s.split(" ");
                return strings;
            }
        };

        Function<String[], String[]> sortArray = new Function<String[], String[]>() {
            @Override
            public String[] apply(String[] strings) {
                Arrays.sort(strings);
                return strings;
            }
        };

        HigherFunction higherFunction = new HigherFunction() {
            @Override
            public Function<String, String[]> dictionary(Function<String, String[]> func1, Function<String[], String[]> func2) {
                return value -> func2.apply(func1.apply(String.valueOf(value)));
            }
        };

        final Function<String, String[]> differentFunctions = higherFunction.dictionary(removingSpaces, sortArray);

        strings = differentFunctions.apply(str);

        System.out.println("Result:");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
