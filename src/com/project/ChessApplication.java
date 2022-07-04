package com.project;

import java.util.Scanner;

import com.project.chess.ChessMatch;
import com.project.chess.ChessPiece;
import com.project.chess.ChessPosition;

public class ChessApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
		UI.printBoard(chessMatch.getPieces());
		System.out.println();
		System.out.println("Source: ");
		ChessPosition source = UI.readChessPosition(sc);
		
		System.out.println();
		System.out.println("Target: ");
		ChessPosition target =  UI.readChessPosition(sc);
		
		ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
	}
}
