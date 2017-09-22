package strings;//: strings/Receipt.java

import java.util.*;

public class Receipt {

    public static final int ITEM_WIDTH = 20;
    public static final int QTY_WIDTH = 15;
    public static final int PRICE_WIDTH = 15;
    private static final String S_5S_10S = "%-" + ITEM_WIDTH + "s %"+QTY_WIDTH+"s %" + PRICE_WIDTH + "s\n";
    private static final String S_5D_10_2F = "%-" + ITEM_WIDTH + "." + ITEM_WIDTH + "s %" + QTY_WIDTH + "d %" + PRICE_WIDTH + ".2f\n";
    private static final String S_5S_10_2F = "%-" + ITEM_WIDTH + "s %" + QTY_WIDTH + "s % " + PRICE_WIDTH + ".2f\n";
    private double total = 0;
    private Formatter f = new Formatter(System.out);

    public void printTitle() {
        f.format(S_5S_10S, "Item", "Qty", "Price");
        f.format(S_5S_10S, "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format(S_5D_10_2F, name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format(S_5S_10_2F, "Tax", "", total * 0.06);
        f.format(S_5S_10S, "", "", "-----");
        f.format(S_5S_10_2F, "Total", "",
                total * 1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
} /* Output:
Item              Qty      Price
----              ---      -----
Jack's Magic Be     4       4.25
Princess Peas       3       5.10
Three Bears Por     1      14.29
Tax                         1.42
                           -----
Total                      25.06
*///:~
