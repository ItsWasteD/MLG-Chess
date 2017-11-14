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
    public void getNeightbour_NOTNULL() throws Exception {
        Assert.assertNotNull(Chessfield.getChessfield());
    }



}