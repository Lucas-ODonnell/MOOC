
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gamesPlayed = 0; 
        int wins = 0;
        int losses = 0;
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        try(Scanner read = new Scanner(Paths.get(file))) {
            while(read.hasNextLine()) {
                String row = read.nextLine();
                if (row.isEmpty()) {
                    continue;
                }
                String[] teamInfo = row.split(",");
                String homeTeam = teamInfo[0];
                String enemyTeam = teamInfo[1];
                int homePoints = Integer.valueOf(teamInfo[2]);
                int enemyPoints = Integer.valueOf(teamInfo[3]);
                if (team.equals(homeTeam)) {
                    gamesPlayed += 1;
                    if(homePoints > enemyPoints) {
                        wins += 1;
                    } else {
                        losses += 1;
                    }
                } else if (team.equals(enemyTeam)) {
                    gamesPlayed += 1;
                    if (homePoints < enemyPoints) {
                        wins += 1;
                    } else {
                        losses += 1;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
