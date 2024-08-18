import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Song> songs = new ArrayList<>();
        int numberOfSongs = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfSongs; i++) {
            String[] input = scanner.nextLine().split("_");
            Song s = new Song(input[0], input[1], input[2]);

            songs.add(s);
        }

        String searchTypeList = scanner.nextLine();

        if (searchTypeList.equals("all")) {
            for (int i = 0; i < songs.size(); i++) {
                System.out.println(songs.get(i).getName());
            }
        } else {
            for (int i = 0; i < songs.size(); i++) {
                if (searchTypeList.equals(songs.get(i).getTypeList())) {
                    System.out.println(songs.get(i).getName());
                }
            }
        }
    }

    static class Song {
        String typeList;
        String name;
        String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return typeList;
        }

        public String getName() {
            return name;
        }


    }


}
