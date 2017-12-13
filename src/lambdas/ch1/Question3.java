package lambdas.ch1;

import java.util.function.Predicate;

import javax.swing.*;

public class Question3 {

    public static void main(String[] args) {

        Runnable helloWorld = () -> System.out.println("hello world");
        JButton button = new JButton();
        button.addActionListener(event ->
                System.out.println(event.getActionCommand()));
        Question3 q = new Question3();
        System.out.println(  q.check((Predicate<Integer>) x -> x < 7) + "!!!!!!!11");
        System.out.println(  q.check((IntPred) x -> x < 7) + "!!!!!!!22");
    }

    boolean check(Predicate<Integer> predicate) {
        return predicate.test(5);
    }


    boolean check(IntPred predicate) {
        return predicate.test(5);
    }

}


interface IntPred {
    boolean test(Integer value);
}

