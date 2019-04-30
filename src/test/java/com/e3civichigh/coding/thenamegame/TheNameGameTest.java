package com.e3civichigh.coding.thenamegame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheNameGameTest {

    @Test
    public void createSong() {
        String StephenSong = "Stephen, Stephen, bo-btephen\n" +
                "Banana-fana fo-ftephen\n" +
                "Fee-fi-mo-mtephen\n" +
                "Stephen!\n";
        TheNameGame game = new TheNameGame();
        assertEquals(StephenSong, game.createSong("Stephen"));
    }
}