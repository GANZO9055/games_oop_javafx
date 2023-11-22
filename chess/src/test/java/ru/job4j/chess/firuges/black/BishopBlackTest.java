package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    void whenPositionTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell bishop = bishopBlack.position();
        assertThat(bishop).isEqualTo(Cell.C1);
    }

    @Test
    void whenCopyTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Figure bishop = bishopBlack.copy(Cell.G2);
        assertThat(bishop.position()).isEqualTo(Cell.G2);
    }

    @Test
    void whenWayTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] bishop = bishopBlack.way(Cell.G5);
        assertThat(bishop).isEqualTo(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5});
    }
}