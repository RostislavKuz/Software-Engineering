package telephony_05;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder builder = new StringBuilder();

        for (String url : this.urls) {
            boolean isValid = true;
            for (int i = 0; i < url.length(); i++) {
                char symbol = url.charAt(i);
                if (Character.isDigit(symbol)) {
                    isValid = false;
                }
            }

            if (isValid) {
                builder.append("Browsing: ").append(url).append("!").append(System.lineSeparator());
            } else {
                builder.append("Invalid URL!").append(System.lineSeparator());
            }
        }
        return builder.toString();
    }

    @Override
    public String call() {
        StringBuilder builder = new StringBuilder();
        boolean isValid = true;
        for (String number : this.numbers) {
            for (int i = 0; i < number.length(); i++) {
                char symbol = number.charAt(i);
                if (Character.isLetter(symbol)) {
                    isValid = false;
                }
            }
            if (isValid){
                builder.append("Calling... ").append(number).append(System.lineSeparator());
            }else {
                builder.append("Invalid number!").append(System.lineSeparator());
            }
        }
        return builder.toString();
    }
}
