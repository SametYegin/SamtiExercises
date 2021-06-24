package FiksturJava;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();


        teams.add("Galatasaray");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Bursaspor");
        teams.add("Başakşehir");
        teams.add("Trabzonspor");





        listMatches(teams);
        Collections.reverse(teams);
        listMatches(teams);






    }

    static void listMatches(List<String> teamList) {
        if (teamList.size() % 2 != 0) {
            teamList.add("Bay");
        }

        int numWeeks = (teamList.size() - 1);
        int halfSize = teamList.size() / 2;

        List<String> teams = new ArrayList<>(teamList);
        teams.remove(0);

        int teamsSize = teams.size();

        for (int day = 0; day < numWeeks; day++) {
            System.out.println();
            System.out.println("Week " + (day + 1));

            int teamIdx = day % teamsSize;

            System.out.printf("%s vs %s%n", teams.get(teamIdx), teamList.get(0));

            for (int idx = 1; idx < halfSize; idx++) {
                int firstTeam = (day + idx) % teamsSize;
                int secondTeam = (day + teamsSize - idx) % teamsSize;
                System.out.printf("%s vs %s%n", teams.get(firstTeam), teams.get(secondTeam));
            }
        }
    }




}
