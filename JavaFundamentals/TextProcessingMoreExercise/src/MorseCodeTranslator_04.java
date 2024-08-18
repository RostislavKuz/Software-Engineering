import java.util.Scanner;

public class MorseCodeTranslator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < input.length; i++) {
            switch (input[i]) {
                case ".-":
                    sb.append("A");
                    break;
                case "-...":
                    sb.append("B");
                    break;
                case "-.-.":
                    sb.append("C");
                    break;
                case "-..":
                    sb.append("D");
                    break;
                case ".":
                    sb.append("E");
                    break;
                case "..-.":
                    sb.append("F");
                    break;
                case "--.":
                    sb.append("G");
                    break;
                case "....":
                    sb.append("H");
                    break;
                case "..":
                    sb.append("I");
                    break;
                case ".---":
                    sb.append("J");
                    break;
                case "-.-":
                    sb.append("K");
                    break;
                case ".-..":
                    sb.append("L");
                    break;
                case "--":
                    sb.append("M");
                    break;
                case "-.":
                    sb.append("N");
                    break;
                case "---":
                    sb.append("O");
                    break;
                case ".--.":
                    sb.append("P");
                    break;
                case "--.-":
                    sb.append("Q");
                    break;
                case ".-.":
                    sb.append("R");
                    break;
                case "...":
                    sb.append("S");
                    break;
                case "-":
                    sb.append("T");
                    break;
                case "..-":
                    sb.append("U");
                    break;
                case "...-":
                    sb.append("V");
                    break;
                case ".--":
                    sb.append("W");
                    break;
                case "-..-":
                    sb.append("X");
                    break;
                case "-.--":
                    sb.append("Y");
                    break;
                case "--..":
                    sb.append("Z");
                    break;
                case "|":
                    sb.append(" ");
                    break;
            }
        }
        System.out.println(sb);


    }
}
