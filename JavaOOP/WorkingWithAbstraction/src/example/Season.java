package example;

public enum Season {

    SUMMER("Summer", 24, "medium"),
    SPRING("Spring", 15, "medium"),
    AUTUMN("Autumn", 15, "medium"),
    WINTER("Winter", 10, "low"),
    ;

    private String name;
    private double temperature;
    private String chancesOfRain;

    Season(String name, double temperature, String chancesOfRain) {
        this.name = name;
        this.temperature = temperature;
        this.chancesOfRain = chancesOfRain;
    }
}
