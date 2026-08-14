package JavaLambdaExpressions;

@FunctionalInterface
public interface Operation<T> {
//     ^functional interface^
    T operate(T value1, T value2);
}
