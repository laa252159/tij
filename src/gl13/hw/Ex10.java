package gl13.hw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex10 {

    public static final String JAVA_NOW = "Java now has regular expression";

    public static void main(String[] args) {
        String[] regexps = {"^Java", "\\Breg.*", "n.w\\s+h(a|i)s",
                "s?", "s*", "s+", "s{4}", "s{1}., s{0,3}"};
        System.out.println(JAVA_NOW);
        for (String regexp : regexps) {
            Pattern pattern = Pattern.compile(regexp);
            Matcher matcher = pattern.matcher(JAVA_NOW);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("RE: " + regexp);
            while (matcher.find()){
                System.out.println(matcher.group());
                System.out.println(JAVA_NOW);
                System.out.print("from " + matcher.start() + " to ");
                System.out.println(matcher.end());
            }

        }
    }
}
