package org.dt.project.arrays.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonConstructibleChangeTest {

    @Test
    void nonConstructibleChange() {
        int[] coins = {5,3,1,1,2,7,22};
        assertEquals(20, NonConstructibleChange.nonConstructibleChange(coins));
    }

    @Test
    void nonConstructibleChangeCase2() {
        int[] coins = {1,1,1,1,1};
        assertEquals(6, NonConstructibleChange.nonConstructibleChange(coins));
    }

    @Test
    void nonConstructibleChangeCase3() {
        int[] coins = {1, 5, 1, 1, 1, 10, 15, 20, 100};
        assertEquals(55, NonConstructibleChange.nonConstructibleChange(coins));
    }
}

