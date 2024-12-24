package scale;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> scale = new Scale<>(12, 11);
        System.out.println(scale.getHeavier());

        Scale<String> stringScale = new Scale<>("10", "15");
        System.out.println(stringScale.getHeavier());


    }
}
