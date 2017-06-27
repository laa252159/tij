package gl11.hw;

import net.mindview.util.Stack;

import java.util.*;

public class Ex15 {
	public static final String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
	private final static Stack<Character> stack = new Stack<Character>();

	private static void evaluate(String expr) {
		char data[] = expr.toCharArray();
		for (int i = 0; i < data.length; )
			switch (data[i++]) {
			case '+':
				stack.push(data[i++]);
				break;
			case '-':
				System.out.print(stack.pop());
			}
	}

	public static void main(String[] args) {
		evaluate("+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---");
	}

}
