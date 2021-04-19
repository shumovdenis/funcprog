package task1;

import java.util.function.Function;

public interface HigherFunction {
    Function<String, String[]> dictionary (Function<String, String[]> func1, Function<String[], String[]> func2);
}
