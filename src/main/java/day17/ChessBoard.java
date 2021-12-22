package day17;
//    Затем создайте класс Шахматная доска (англ. ChessBoard).
//    Этот класс в единственном аргументе конструктора должен принимать на вход двумерный массив шахматных фигур.
//    Этот двумерный массив задает конфигурацию фигур на шахматной доске.
//    Пустое пространство на шахматной доске задается с помощью значения EMPTY.
//    Также, у класса ChessBoard должен быть реализован метод print(), который выводит шахматную доску в консоль.

public class ChessBoard {
    private final ChessPiece[][] chessBoard;
    public ChessBoard(ChessPiece[][] chessBoard) {
        this.chessBoard = chessBoard;
    }
    public void print(){
        for (ChessPiece[] chessPieces : chessBoard) {
            for (ChessPiece chessPiece : chessPieces) {
                System.out.print(chessPiece.getSymbol() + " ");
            }
            System.out.println();
        }
    }
}
