package cn.edu.jnu.x2020104587;

import org.junit.Test;

import static org.junit.Assert.*;

import junit.framework.TestCase;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest extends TestCase {
    @Test
    public void test20Zeros() throws Exception {
        BowlingGame game=new BowlingGame();
        for(int i=0;i<20;i++)
        {
            game.roll(0);
        }
        assertEquals(0,game.score());
    }