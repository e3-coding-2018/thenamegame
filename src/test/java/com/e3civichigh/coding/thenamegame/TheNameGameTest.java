package com.e3civichigh.coding.thenamegame;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheNameGameTest {

    @Test
    public void createSong() {
        String StephenSong = null;
        // String StephenSong = "Stephen, Stephen, bo-btephen
        //Banana-fana fo-ftephen
        //Fee-fi-mo-mtephen
        //Stephen!
        TheNameGame game = new TheNameGame();
        assertEquals(StephenSong, game.createSong("Stephen"));
    }
}