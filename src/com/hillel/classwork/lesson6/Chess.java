package com.hillel.classwork.lesson6;

import java.util.ArrayList;

public class Chess {

    public static void main(String[] args) {

        ChessItem chessItem = new Pawn(1, 1);

        // создать 2 наследника ChessItem - король и королева
        // добавить 6 фигур в коллекцию с фигурами
        // в цикле для всех фигур вызвать метод draw

        ArrayList<Drawable> chess = new ArrayList<>();
        chess.add(chessItem);

        ChessBoard chessBoard = new ChessBoard();
        chess.add(chessBoard);

        for (Drawable item: chess) {
            item.draw();
        }

    }

}
