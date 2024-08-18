import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double amountMoney = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightSabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double sabers = lightSabersPrice * Math.ceil(studentsCount * 1.1);
        double robes = robesPrice * studentsCount;
        double belts = beltsPrice * (studentsCount - Math.floor(studentsCount * 1.0 / 6));

        double needMoney = sabers + robes + belts;

        if (amountMoney >= needMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", needMoney);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", needMoney - amountMoney);
        }


    }
}
