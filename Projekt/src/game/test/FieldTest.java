package game.test;


import game.java.Chessfield;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FieldTest {

    @Before
    public void setUp() {
        Chessfield chessfield = new Chessfield();
    }

    @Test
    public void testGetSingleField() {
        Assert.assertEquals(Chessfield.getChessfield()[0][0], Chessfield.getSingleField(0, 0));
    }

    @Test
    public void testGetNeightbour() throws Exception {
        Chessfield.getSingleField(1, 2).getNeightbour(1, 2);
        Assert.assertEquals(Chessfield.getSingleField(1, 2).getNeightbour(1, 0),
                Chessfield.getSingleField(2, 2));
    }
}