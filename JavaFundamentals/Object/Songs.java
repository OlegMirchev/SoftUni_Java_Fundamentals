package JavaFundamentals2021.ObjectLAB2306;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberSong = Integer.parseInt(scanner.nextLine());
        List<SongName> list = new ArrayList<>();


        for (int i = 1; i <= numberSong; i++) {
            String[] type = scanner.nextLine().split("_");
            String typeName = type[0];
            String name = type[1];


            SongName song = new SongName(typeName, name);
            list.add(song);
        }

        String lastType = scanner.nextLine();
        if (lastType.equals("all")) {
            list.forEach(songName -> System.out.println(songName.getName()));
        } else {
            for (SongName songName : list) {
                if (songName.getType().equals(lastType)) {
                    System.out.println(songName.getName());
                }
            }
        }
    }
}
