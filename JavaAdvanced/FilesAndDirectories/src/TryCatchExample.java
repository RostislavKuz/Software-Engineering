import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {1, 2, 3};

        try {
            System.out.println(a[100]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Sorry, index too big");
        }

    }
}
