package gl13.hw;

import java.util.Formatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestHarness {
    public static void main(String[] args) {
        Pattern pattern =
                Pattern.compile("^[A-Z].+\\.$");
        Matcher matcher =
                pattern.matcher("Gogo to play CS.");
        Formatter formatter = new Formatter(System.out);
        if (matcher.find()){
            formatter.format("I found the text" +
                            " \"%s\" starting at " +
                            "index %d and ending at index %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
        } else {
            System.out.println("Didn't find");
        }
    }

    ;

}

