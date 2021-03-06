package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {
    private Color color;
    private Integer moveCount;

    public ChessPiece(Board board, Color color, Integer moveCount) {
        super(board);
        this.color = color;
        this.moveCount = moveCount;
    }

    public Color getColor() {
        return color;
    }

    public Integer getMoveCount() {
        return moveCount;
    }
}
