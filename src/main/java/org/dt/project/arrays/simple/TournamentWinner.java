package org.dt.project.arrays.simple;

import java.util.*;
import java.util.stream.Collectors;

public class TournamentWinner {
    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        HashMap<String, Integer> table = new HashMap<>();

        List<Integer> res = results.stream().filter(a -> a > 0).collect(Collectors.toList());




        for(int i = 0; i < competitions.size(); i++) {
            int result = results.get(i);
            ArrayList<String> teams = competitions.get(i);

            String winningTeam = result == 1 ? teams.get(0) : teams.get(1);

            table.merge(winningTeam, 3, Integer::sum);
        }

        Optional<Map.Entry<String, Integer>> maxEntry = table.entrySet().stream().max(Map.Entry.comparingByValue());

        return maxEntry.get().getKey();
    }
}
