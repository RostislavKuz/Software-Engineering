import java.util.Scanner;

public class Scholarship_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        double social = salary * 0.35;
        double excellent = grade * 25;

        if (grade<=4.5){
            System.out.println("You cannot get a scholarship!");
        }else if (grade >4.5 && grade<5.5){
            if (income<salary){
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(social));
            }else {
                System.out.println("You cannot get a scholarship!");
            }
        } else if (grade >=5.5) {
            if (income<salary){
                if (social>excellent){
                    System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(social));
                }else {
                    System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellent));
                }
            }else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellent));
            }
        }
    }
}
