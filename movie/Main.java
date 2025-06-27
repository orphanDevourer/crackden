package movie;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Director director1 = new Director("Quentin SuckAtino", "USA");
        Director director2 = new Director("Lor", "Brazil");
        Director director3 = new Director("Ken", "Phillipines");

        Theater movie1 = new Theater(director1, 1982, "One woodchipper VS 100 toddlers", 85);
        Theater movie2 = new Theater(director2, 2025, "The time I shot Ken 26 times in the chest", 90);
        Theater movie3 = new Theater(director3, 2025, "The time I broke up with Lor", 120);
        Theater movie4 = new Theater(director2, 2025, "How I disposed of a Pilipino's body", 20);

        Streaming streaming1 = new Streaming(new Director("Lara", "Brazil"), 2020, "EmoXpress", "HuluTV");
        Streaming streaming2 = new Streaming(new Director("Lorena", "Brazil"), 2022, "CigaretteBurnsXO", "Netflix");

        ArrayList<Movie> stash = new ArrayList<>();
        stash.add(movie1);
        stash.add(movie2);
        stash.add(movie3);
        stash.add(movie4);
        stash.add(streaming1);
        stash.add(streaming2);

        while (true) {
            options();
            System.out.print("Choose yo' thang: ");
            int op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("🔎- Director: ");
                    String nameSearch = scanner.nextLine();
                    filter(stash, nameSearch);
                    break;

                case 0:
                    System.out.println("[EXITTING]");
                    return;

                default:
                    System.out.println("It reeks of sulfur.");
            }
        }
    }

    public static void filter(ArrayList<movie> list, String directorName) {
        boolean found = false;

        for (Movie movie : list) {
            if (movie.getDirector().getName().equalsIgnoreCase(directorName)) {
                System.out.println(movie.showEm());
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("[???] No results with this director's name: " + directorName);
        }
    }

    public static void options() {
        System.out.println("===================================================");
        System.out.println("1 - Sort movie by director");
        System.out.println("0 - LEAVE");
        System.out.println("===================================================");
    }
}