package lambdas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

public class LearningLambdas {
    public static void main(String[] args) {
        Runnable noArguments = () -> System.out.println("Hello world");
        ActionListener oneArgument = event -> System.out.println("button clicked");
        Runnable multiStatement = () -> {
            System.out.println("Hello");
            System.out.println(" World");
        };
        BinaryOperator<Long> add = (x, y) -> x + y;
        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;


        System.out.println(add.apply(1L, 2L));
        System.out.println("***" + addExplicit.apply(3L, 7L) + "***");
        multiStatement.run();
        noArguments.run();
        oneArgument.actionPerformed(new ActionEvent(new Object(), 1, ""));
    }
}
