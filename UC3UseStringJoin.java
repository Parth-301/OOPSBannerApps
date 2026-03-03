public class UC3UseStringJoin {

    
    static String gap = "   ";

    
    static void printLine(String... parts) {
        System.out.println(String.join(gap, parts));
    }

    public static void main(String[] args) {



        printLine("OOOOO", "OOOOO", "PPPPP", "SSSSS");
        printLine("O   O", "O   O", "P   P", "S");
        printLine("O   O", "O   O", "PPPPP", "SSSSS");
        printLine("O   O", "O   O", "P", "    S");
        printLine("OOOOO", "OOOOO", "P", "SSSSS");
    }
}