package cs361;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void testGutterBall() {
        int currentScore = game.score(0);
        assertEquals(0, currentScore);
    }

    @Test
    public void testOneRoll() {
        int currentScore = game.score(4);
        assertEquals(4, currentScore);
    }

    @Test
    public void testTwoRoll() {
        game.score(4);
        int currentScore = game.score(4);
        assertEquals(8, currentScore);
    }
}
