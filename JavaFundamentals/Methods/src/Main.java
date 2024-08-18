public class Main {

    public static void printLine(int length, char symbol) {
        for (int i = 0; i < length; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    public static void printHeading(String chapterName) {
        printLine(chapterName.length(), '*');
        System.out.println(chapterName);
        printLine(chapterName.length(), '*');
    }

    public static void main(String[] args) {
        printHeading("Chapter 11");
        printHeading("The big apple");
    }
}