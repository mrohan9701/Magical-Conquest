package com.magicalarena;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void testGameEnds() {
        Player playerA = new Player(10, 5, 10);
        Player playerB = new Player(10, 10, 5);

        Game game = new Game(playerA, playerB);
        game.start();

        assertFalse(playerA.isAlive() || playerB.isAlive());
    }
}
