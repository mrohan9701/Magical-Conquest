package com.magicalarena;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void testPlayerCreation() {
        Player player = new Player(50, 5, 10);
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
    }

    @Test
    public void testPlayerHealth() {
        Player player = new Player(50, 5, 10);
        player.setHealth(30);
        assertEquals(30, player.getHealth());
    }

    @Test
    public void testPlayerIsAlive() {
        Player player = new Player(50, 5, 10);
        assertTrue(player.isAlive());
        player.setHealth(0);
        assertFalse(player.isAlive());
    }
}
