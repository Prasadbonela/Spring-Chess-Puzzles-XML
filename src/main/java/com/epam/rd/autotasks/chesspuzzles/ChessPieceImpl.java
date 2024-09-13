
package com.epam.rd.autotasks.chesspuzzles;

public class ChessPieceImpl implements ChessPiece {


    private final Cell cell;


    private final char piece;


    public ChessPieceImpl(Cell cell, char piece) {
        this.cell = cell;
        this.piece = piece;
    }


    public ChessPieceImpl() {
        this.cell = null;
        this.piece = '.';
    }


    @Override
    public Cell getCell() {
        return cell;
    }

    @Override
    public char toChar() {
        return piece;
    }
}