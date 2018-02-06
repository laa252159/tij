package gl13.hw;//: strings/JGrep.java
// A very simple version of the "grep" program.
// {Args: JGrep.java "\\b[Ssct]\\w+"}

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

public class JGrepEx16 {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile(args[1], Integer.valueOf(args[2]));
        // Iterate through the lines of the input file:
        int index = 0;
        Matcher m = p.matcher("");
        List<TextFile> files = new ArrayList<>();
        if (args[0].endsWith(".java")) {
            files.add(new TextFile(args[0]));
        } else {
            File[] filesArr = new File(args[0]).listFiles();
            for (File f : filesArr) {
                files.add(new TextFile(f.getAbsolutePath()));
            }
        }
        for (TextFile file : files) {
            for (String line : file) {
                m.reset(line);
                while (m.find()) {
                    System.out.println(index++ + ": " +
                            m.group() + ": " + m.start());
                }
            }
        }

    }
} /* Output: (Sample)
0: strings: 4
1: simple: 10
2: the: 28
3: Ssct: 26
4: class: 7
5: static: 9
6: String: 26
7: throws: 41
8: System: 6
9: System: 6
10: compile: 24
11: through: 15
12: the: 23
13: the: 36
14: String: 8
15: System: 8
16: start: 31
*///:~
