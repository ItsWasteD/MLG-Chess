package game.test;

import game.java.Chessfield;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChessfieldTest {

    @Before
    public void setUp() {
        Chessfield chessfield = new Chessfield();
    }

    @Test
    public void getSingleField() throws Exception {
        Assert.assertEquals(Chessfield.getChessfield()[0][0], Chessfield.getSingleField(0, 0));
    }

}