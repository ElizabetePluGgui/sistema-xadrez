package chess;

import boardgame.Board;

public class ChessMatch {
   //NESSA CLASSE QUE IRÁ FICAR AS REGRAS DO JOGO DE XADREZ
    private Board board;
    //QUEM TEM QUE SABER A DIMENSÃO DO JOGO DE XADREZ É A CLASSE CHESSMATCH
    public ChessMatch() {
        board = new Board(8, 8);
    }

    // VAI RETORNAR UMA MATRIZ DE PEÇAS DE XADREZ CORRESPONDENTE A PARTIDA
    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        //PERCORRER A MATRIZ DE PEÇAS DO TABULEIRO
        for (int i=0; i< board.getRows(); i++){
            for (int j=0; j< board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
}
