package org.dt.project.arrays.simple;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TournamentWinnerTest {

    @Test
    void tournamentWinner() {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        competitions.add(new ArrayList<>(Arrays.asList("HTML", "C#")));
        competitions.add(new ArrayList<>(Arrays.asList("C#", "Python")));
        competitions.add(new ArrayList<>(Arrays.asList("Python", "HTML")));
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(0, 0, 1));

        String winner = TournamentWinner.tournamentWinner(competitions, results);
        assertEquals("Python", winner, "Test where all teams win one match should return the correct winner");
    }

}