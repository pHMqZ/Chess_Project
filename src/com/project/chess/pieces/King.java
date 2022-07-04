package com.project.chess.pieces;

import com.project.boardgame.Board;
import com.project.chess.ChessPiece;
import com.project.chess.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}
}
