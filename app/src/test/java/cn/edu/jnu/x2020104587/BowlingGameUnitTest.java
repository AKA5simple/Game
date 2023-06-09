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
    private BowlingGame game;
    protected void setUp() throws Exception {
        game=new BowlingGame();
    }
    public void testAllZeros() throws Exception{
        rollMany(20,0);
        assertEquals(0,game.score());
    }
    private void rollMany(int n,int pins)
    {
        for(int i=0;i<n;i++)
        {
            game.roll(pins);
        }
    }
    public void testAllOnes() throws Exception{
        rollMany(20,1);
        assertEquals(20,game.score());
    }
    public void testOneSpare() throws Exception{
        rollSpace();
        game.roll(3);
        rollMany(17,0);
        assertEquals(16,game.score());
    }
    public void testOneStrike() throws Exception{
        rollStrike();
        game.roll(3);
        game.roll(4);
        rollMany(16,0);
        assertEquals(24,game.score());
    }
    public void testPerfectGame() throws Exception{
        rollMany(12,10);
        assertEquals(300,game.score());
    }
    private void rollStrike()
    {
        game.roll(10);
    }
    private void rollSpace()
    {
        game.roll(5);
        game.roll(5);
    }
}
