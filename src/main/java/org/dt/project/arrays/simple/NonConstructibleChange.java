package org.dt.project.arrays.simple;

import java.util.Arrays;

public class NonConstructibleChange {
    public static int nonConstructibleChange(int[] coins) {

        if(coins == null || coins.length == 0) {
            return 1;
        }

        int[] sortedCoint = Arrays.stream(coins).sorted().toArray();
        int rest = sortedCoint[0];
        int min_change = 1;

        for(int coin : sortedCoint) {
            if(coin > min_change){
                return min_change;
            }

            min_change = min_change + coin;
        }

        return min_change;
    }
}
