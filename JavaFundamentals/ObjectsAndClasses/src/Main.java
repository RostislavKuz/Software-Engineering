import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class Reservation {
        String holderName;
        String phoneNumber;
        int seats;


    }


    //1:26




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Reservation> reservations = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] nameAndSeats = input.split(" ");
            String holder = nameAndSeats[0];
            String phone = nameAndSeats[1];
            int seats = Integer.parseInt(nameAndSeats[2]);
            Reservation r = new Reservation();
            r.holderName = holder;
            r.phoneNumber = phone;
            r.seats = seats;
            reservations.add(r);


            input = scanner.nextLine();
        }

        String guestName = scanner.nextLine();

        int reservationsIndex = -1;
        for (int i = 0; i < reservations.size(); i++) {
            Reservation reservation = reservations.get(i);
            if (guestName.equals(reservation.holderName)) {
                reservationsIndex = i;
            }
        }

        if (reservationsIndex != -1) {
            Reservation reservation = reservations.get(reservationsIndex);
            System.out.println(reservation.seats);
        } else {
            System.out.println("Sorry, no reservations for " + guestName);
        }

    }
}