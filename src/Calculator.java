import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Calculator {
    public static Supplier<Calculator> instance = Calculator::new;

    public BinaryOperator<Integer> plus = (x, y) -> x + y;
    public BinaryOperator<Integer> minus = (x, y) -> x - y;
    public BinaryOperator<Integer> multiply = (x, y) -> x * y;

    //При делении на ноль возникнет исключение ArithmeticException. Чтобы избежать этой ошибки, необходимо предусмотреть проверку деления на ноль.
    public BinaryOperator<Integer> divide = (x, y) -> {
        if (y == 0) {
            System.out.println("Ошибка: деление на ноль.");
            return 0;
        }
        return x / y;
    };
    //Теперь в коде предусмотрена проверка на деление на ноль.
    //Если b равен нулю, код выведет сообщение об ошибке, и программа продолжит выполнение, не завершаясь из-за исключения.

    public UnaryOperator<Integer> pow = x -> x * x;
    public UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    public Predicate<Integer> isPositive = x -> x > 0;

    public Consumer<Integer> println = System.out::println;
}
