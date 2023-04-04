package com.chess.engine.pieces;

import java.util.Collection;

import com.chess.engine.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.Move;

public abstract class Piece {
    
    protected final int piecePosition;
    protected final Alliance pieceAlliance;
    protected final boolean isfirstMove;

    Piece( final int piecePosition, final Alliance pieceAlliance){

        this.piecePosition = piecePosition;
        this.pieceAlliance = pieceAlliance;
        this.isfirstMove = false;
    }

    public int getPiecePosition() { 
        return this.piecePosition;
    }

    public Alliance getPieceAlliance() {
        return this.pieceAlliance;
    }

    public boolean isfirstMove(){
        return this.isfirstMove;
    }

    public abstract Collection<Move> calculateLegalMoves(final Board board);

    public enum PieceType {

        PAWN("P"), 
        KNIGHT("N"),
        BISHOP("B"), 
        ROOK("R"), 
        QUEEN("Q"),
        KING("K");

        private String pieceName; 

        PieceType(final String pieceName) {
            this.pieceName = pieceName;
        }

        @Override
        public String toString() {
            return this.pieceName;
        }
    }
}
