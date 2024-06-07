package com.magicalarena;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class GameTest {
    @Test
    public void testGameEnds() {
        Player playerA = new Player(10, 5, 10);
        Player playerB = new Player(10, 10, 5);
        Game game = new Game(playerA, playerB);

        game.start();
        
        // One of the players should have health greater than 0, and the other should be defeated.
        assertTrue("One player should have health > 0 and the other should be defeated", 
                   (playerA.getHealth() > 0 && playerB.getHealth() <= 0) || 
                   (playerA.getHealth() <= 0 && playerB.getHealth() > 0));
    }
}
