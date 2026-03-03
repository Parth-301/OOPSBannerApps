public class UC6StaticFunction {
public UC6StaticFunction() {
}

public static String[] generateO() {
      return new String[]{" ***** ", "*     *", "*     *", "*     *", " ***** "};
}

public static String[] generateP() {
      return new String[]{"****** ", "*     *", "****** ", "*      ", "*      "};
}

public static String[] generateS() {
      return new String[]{" ***** ", "*      ", " ***** ", "      *", " ***** "};
}

public static void main(String[] var0) {
    String[] var1 = generateO();
    String[] var2 = generateP();
    String[] var3 = generateS();

    for(int var4 = 0; var4 < var1.length; ++var4) {
        System.out.println(var1[var4] + "  " + var1[var4] + "  " + var2[var4] + "  " + var3[var4]);
    }

}
}