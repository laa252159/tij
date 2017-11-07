package gl13.hw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex11 {

    public static final String STRING = "Arline ate eight apples " +
            "and one orange while Anita hadn't any";

    public static void main(String[] args) {
        String regexp = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
        System.out.println(STRING);
            Pattern pattern = Pattern.compile(regexp);
            Matcher matcher = pattern.matcher(STRING);
            while (matcher.find()){
                System.out.println("---" + matcher.group());
                System.out.println(STRING);
                System.out.print("from " + matcher.start() + " to ");
                System.out.println(matcher.end() - 1);
            }

    }
}
