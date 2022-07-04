package com.project.chess.pieces;

import com.project.boardgame.Board;
import com.project.chess.ChessPiece;
import com.project.chess.Color;

public class Rook extends ChessPiece{
	
	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}

}
