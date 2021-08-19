package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class ChessBoardTest {

    @Test
    public void wayIs6() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 0;
        int y2 = 6;
        int expected = 0;
        int result = ChessBoard.way(x1, y1, x2, y2);
        Assert.assertEquals(expected, result);
    }
}