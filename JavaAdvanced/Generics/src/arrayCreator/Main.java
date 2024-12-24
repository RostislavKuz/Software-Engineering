package arrayCreator;

public class Main {
    public static void main(String[] args) {
        ArrayCreator arrayCreator = new ArrayCreator();
        String[] stringArray = ArrayCreator.create(String.class, 5, "Ivan");
        Integer[] integerArray = ArrayCreator.<Integer>create(6, 21);

    }
}
