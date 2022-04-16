package com.hillel.classwork.lesson6;

public class Pawn extends ChessItem {

    public Pawn(int x, int y) {
        super(x, y, 10);
    }

    @Override
    public void draw() {
        System.out.println("draw pawn");
    }

}
